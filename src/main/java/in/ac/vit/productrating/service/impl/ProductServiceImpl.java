package in.ac.vit.productrating.service.impl;

import in.ac.vit.productrating.dao.ProductDao;
import in.ac.vit.productrating.model.Product;
import in.ac.vit.productrating.service.ProductService;
import in.ac.vit.productrating.validators.ProductValidator;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.validation.BindException;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	private ProductValidator productValidator;
	private transient Logger logger = Logger
			.getLogger(ProductServiceImpl.class);

	public ProductServiceImpl(ProductDao productDao,
			ProductValidator productValidator) {
		super();
		this.productDao = productDao;
		this.productValidator = productValidator;
	}

	@Override
	public Product save(Product product) {
		BindException errors = new BindException(product, "product");
		this.getProductValidator().validate(product, errors);
		errors.hasErrors();
		product.setCreatedon(new Date());
		return null;
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Product x) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int key) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> getPaged(int first, int pageSize, String sortField,
			String sortOrder, Map<String, String> filters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount(Map<String, String> filters) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	protected ProductDao getProductDao() {
		return this.productDao;
	}

	protected ProductValidator getProductValidator() {
		return this.productValidator;
	}
}
