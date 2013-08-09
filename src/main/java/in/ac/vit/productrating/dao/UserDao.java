/**
 * 
 */
package in.ac.vit.productrating.dao;

import in.ac.vit.productrating.model.User;

/**
 * @author sahir
 * 
 */
public interface UserDao extends AbstractDao<User> {

	User getByEmail(String email);
}
