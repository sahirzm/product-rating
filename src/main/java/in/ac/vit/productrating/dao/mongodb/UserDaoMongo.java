package in.ac.vit.productrating.dao.mongodb;

import in.ac.vit.productrating.dao.UserDao;
import in.ac.vit.productrating.model.User;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMongo extends AbstractDaoImpl<User> implements UserDao {

	private MongoOperations mongoOperations;
	private transient Logger log = Logger.getLogger(UserDaoMongo.class);

	public UserDaoMongo(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}

	@Override
	public List<User> getPaged(int first, int pageSize, String sortField,
			String sortOrder, Map<String, String> filters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getCount(Map<String, String> filters) {
		// TODO reimplement according to fields
		Query q = new Query();
		Iterator<String> iterator = filters.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			q.addCriteria(Criteria.where(key)
					.regex(filters.get(key) + "%", "i"));
		}

		return this.getMongoOperations().count(q, User.class);
	}

	@Override
	public User getByEmail(String email) {
		try {
			return this.getMongoOperations().findOne(
					new Query(Criteria.where("email").is(email)), User.class);
		} catch (Exception e) {
			this.log.error(e.getMessage());
		}
		return null;
	}

	@Override
	protected MongoOperations getMongoOperations() {
		return this.mongoOperations;
	}

	@Override
	protected Class<User> getModelClass() {
		return User.class;
	}

}