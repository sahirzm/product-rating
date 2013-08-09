package in.ac.vit.productrating.dao;

import java.util.List;
import java.util.Map;

public interface ReportDao {

	List<Map<String, Object>> getAllProductsScore(int companyId);

	List<Map<String, Object>> getLast24HrsScore(int productId);
}
