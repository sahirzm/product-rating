/**
 * 
 */
package in.ac.vit.productrating.dao;

import in.ac.vit.productrating.model.Product;

import java.util.List;

/**
 * @author sahir
 * 
 */
public interface ProductDao extends AbstractDao<Product> {

	List<Product> getAllByCompanyId(Integer companyId);

}
