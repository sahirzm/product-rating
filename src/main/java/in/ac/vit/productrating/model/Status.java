/**
 * This is a generic status class that stores id of the post, text and timestamp
 * of the status updates. Additional sources need to extend this class and add
 * specific properties related to that source.
 *
 */
package in.ac.vit.productrating.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sahir
 * 
 */
@Document(collection = "status")
public abstract class Status implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String statusId;
	private Product product;
	private String text;
	private Date timestamp;
	private Date createdOn;
	private Sources source;
	private int score;
	private double latitude;
	private double longitude;
	private String country;
	private String languageCode;

	public Status() {
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Status(String statusId, String text, Date timestamp, Product product) {
		super();
		this.text = text;
		this.timestamp = timestamp;
		this.product = product;
		this.statusId = statusId;
	}

	/**
	 * Returns the id of the status provided by the source
	 * 
	 * @return - id of the status
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Returns the product id to which this status belongs
	 * 
	 * @return - product Id
	 */
	public Product getProduct() {
		return this.product;
	}

	/**
	 * Returns the source from where data is fetched.
	 * 
	 * @return - Source
	 */
	public Sources getSource() {
		return this.source;
	}

	/**
	 * Returns the id of data source
	 * 
	 * @return - id of data soruce
	 */
	public int getSourceId() {
		return this.getSource().ordinal();
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * Returns the text of the status update
	 * 
	 * @return - text of the status
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * Returns the time when status was updated.
	 * 
	 * @return - timestamp of the status update
	 */
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setSource(Sources source) {
		this.source = source;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public abstract String toString();

	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
}