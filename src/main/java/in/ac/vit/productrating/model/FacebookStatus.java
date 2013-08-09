/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.vit.productrating.model;

/**
 * 
 * @author sahir
 */

public class FacebookStatus extends Status {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long likes;

	public FacebookStatus() {
		this.setSource(Sources.FACEBOOK);
	}

	public long getLikes() {
		return this.likes;
	}

	public void setLikes(long likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "FacebookStatus [likes=" + this.likes + ", getScore()="
				+ this.getScore() + ", getId()=" + this.getId()
				+ ", getProduct()=" + this.getProduct() + ", getSource()="
				+ this.getSource() + ", getSourceId()=" + this.getSourceId()
				+ ", getCreatedOn()=" + this.getCreatedOn() + ", getText()="
				+ this.getText() + ", getTimestamp()=" + this.getTimestamp()
				+ ", getStatusId()=" + this.getStatusId() + ", getLatitude()="
				+ this.getLatitude() + ", getLongitude()="
				+ this.getLongitude() + ", getCountry()=" + this.getCountry()
				+ ", getLanguageCode()=" + this.getLanguageCode() + "]";
	}

}