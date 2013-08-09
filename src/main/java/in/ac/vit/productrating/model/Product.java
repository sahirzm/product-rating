package in.ac.vit.productrating.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The persistent class for the product database table.
 * 
 */
@Document(collection = "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private Date createdon;
	private String keywords;
	private String name;

	public Product() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}

		return true;
	}

	public Date getCreatedon() {
		return this.createdon;
	}

	public String getId() {
		return this.id;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result)
				+ ((this.createdon == null) ? 0 : this.createdon.hashCode());
		result = (prime * result)
				+ ((this.id == null) ? 0 : this.id.hashCode());
		result = (prime * result)
				+ ((this.keywords == null) ? 0 : this.keywords.hashCode());
		result = (prime * result)
				+ ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + this.id + ", createdon=" + this.createdon
				+ ", keywords=" + this.keywords + ", name=" + this.name + "]";
	}
}