package in.ac.vit.productrating.dao.mongodb;

import in.ac.vit.productrating.dao.AbstractDao;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public abstract class AbstractDaoImpl<X> implements AbstractDao<X> {

	@Override
	public void delete(X x) {
		this.getMongoOperations().remove(x);
	}

	@Override
	public void deleteById(String id) {
		this.getMongoOperations().remove(
				new Query(Criteria.where("id").is(id)), this.getModelClass());
	}

	@Override
	public X findById(String id) {
		return this.getMongoOperations().findById(id, this.getModelClass());
	}

	@Override
	public X insert(X x) {
		this.getMongoOperations().insert(x);
		return x;
	}

	@Override
	public X update(X x) {
		this.getMongoOperations().save(x);
		return x;
	}

	@Override
	public Long getCount() {
		return this.getMongoOperations().count(new Query(),
				this.getModelClass());
	}

	protected abstract MongoOperations getMongoOperations();

	protected abstract Class<X> getModelClass();
}
