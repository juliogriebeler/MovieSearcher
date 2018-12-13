package br.com.juliogriebeler.moviesearcher.model;

import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * @author Julio
 *
 */
public class TitleAka {

	@Id
	private String titleId;
	private Integer ordering;
	private String title;
	private String region;
	private String language;
	private List<String> types;
	private List<String> attributes;
	private boolean isOriginalTitle;

	/**
	 * @return the titleId
	 */
	public String getTitleId() {
		return titleId;
	}

	/**
	 * @param titleId the titleId to set
	 */
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	/**
	 * @return the ordering
	 */
	public Integer getOrdering() {
		return ordering;
	}

	/**
	 * @param ordering the ordering to set
	 */
	public void setOrdering(Integer ordering) {
		this.ordering = ordering;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the types
	 */
	public List<String> getTypes() {
		return types;
	}

	/**
	 * @param types the types to set
	 */
	public void setTypes(List<String> types) {
		this.types = types;
	}

	/**
	 * @return the attributes
	 */
	public List<String> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return the isOriginalTitle
	 */
	public boolean isOriginalTitle() {
		return isOriginalTitle;
	}

	/**
	 * @param isOriginalTitle the isOriginalTitle to set
	 */
	public void setOriginalTitle(boolean isOriginalTitle) {
		this.isOriginalTitle = isOriginalTitle;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
