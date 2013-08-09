/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.vit.productrating.model;

import java.util.Date;

/**
 * 
 * @author
 */

public class TwitterStatus extends Status {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long retweetCount;

	public TwitterStatus() {
		this.setSource(Sources.TWITTER);
	}

	public TwitterStatus(String statusId, String text, Date timestamp,
			Product product) {
		super(statusId, text, timestamp, product);
		this.setSource(Sources.TWITTER);
	}

	@Override
	public String toString() {
		return "TwitterStatus [retweetCount=" + this.retweetCount
				+ ", getScore()=" + this.getScore() + ", getId()="
				+ this.getId() + ", getProduct()=" + this.getProduct()
				+ ", getSource()=" + this.getSource() + ", getSourceId()="
				+ this.getSourceId() + ", getCreatedOn()="
				+ this.getCreatedOn() + ", getText()=" + this.getText()
				+ ", getTimestamp()=" + this.getTimestamp()
				+ ", getStatusId()=" + this.getStatusId() + ", getLatitude()="
				+ this.getLatitude() + ", getLongitude()="
				+ this.getLongitude() + ", getCountry()=" + this.getCountry()
				+ ", getLanguageCode()=" + this.getLanguageCode() + "]";
	}

	public long getRetweetCount() {
		return this.retweetCount;
	}

	public void setRetweetCount(long l) {
		this.retweetCount = l;
	}
}