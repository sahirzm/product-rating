package in.ac.vit.productrating.service;

import in.ac.vit.productrating.model.User;

import java.util.List;

public interface UserService extends AbstractService<User> {

	User findByEmail(String email);

	User findById(String id);

	List<User> getAll();

}
