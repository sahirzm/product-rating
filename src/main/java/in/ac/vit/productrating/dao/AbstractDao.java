package in.ac.vit.productrating.dao;

import java.util.List;
import java.util.Map;

/**
 * @author sahir
 */
public interface AbstractDao<X> {

	public void delete(X x);

	public void deleteById(String id);

	public X findById(String id);

	public X save(X x);

	public X update(X x);

	public Long getCount();

	public List<X> getPaged(int first, int pageSize, String sortField,
			String sortOrder, Map<String, String> filters);

	public int getCount(Map<String, String> filters);

}
