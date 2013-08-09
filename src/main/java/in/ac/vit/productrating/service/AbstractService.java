package in.ac.vit.productrating.service;

import java.util.List;
import java.util.Map;

public interface AbstractService<X> {

	public X save(X x);

	public X update(X x);

	public void delete(X x);

	public void delete(int key);

	public int getCount();

	public List<X> getPaged(int first, int pageSize, String sortField,
			String sortOrder, Map<String, String> filters);

	public int getCount(Map<String, String> filters);

	public X findById(int id);
}
