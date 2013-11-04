package in.ac.vit.productrating.dao.mongodb;

import in.ac.vit.productrating.dao.ProductDao;
import in.ac.vit.productrating.model.Product;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.data.mongodb.core.MongoOperations;

public class ProductDaoMongo extends AbstractDaoImpl<Product> implements
		ProductDao {

	private MongoOperations mongoOperations;
	private transient Logger log = Logger.getLogger(ProductDaoMongo.class);

	public ProductDaoMongo(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}

	@Override
	public List<Product> getPaged(int first, int pageSize, String sortField,
			String sortOrder, Map<String, String> filters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getCount(Map<String, String> filters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllByCompanyId(Integer companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected MongoOperations getMongoOperations() {
		return this.mongoOperations;
	}

	@Override
	protected Class<Product> getModelClass() {
		return Product.class;
	}

}
