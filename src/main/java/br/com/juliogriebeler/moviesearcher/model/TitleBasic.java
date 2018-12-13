
package br.com.juliogriebeler.moviesearcher.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "moviesearcher", type = "titles")
public class TitleBasic {

	@Id
	private String tconst;
	// basics
	private String titleType;
	private String primaryTitle;
	private String originalTitle;
	private boolean isAdult;
	private Long startYear;
	private Long endYear;
	private Long runtimeMinutes;
	@Field(type = FieldType.Nested, includeInParent = true)
	private List<String> genres;
	
	@Field(type = FieldType.Nested)
	private TitleAka titleAka;
	@Field(type = FieldType.Nested)
	private TitleCrew titleCrew;
	@Field(type = FieldType.Nested)
	private TitleEpisode titleEpisode;
	@Field(type = FieldType.Nested)
	private TitlePrincipals titlePrincipals;
	@Field(type = FieldType.Nested)
	private TitleRating titleRating;
	

	/**
	 * @return the tconst
	 */
	public String getTconst() {
		return tconst;
	}

	/**
	 * @param tconst the tconst to set
	 */
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	/**
	 * @return the titleType
	 */
	public String getTitleType() {
		return titleType;
	}

	/**
	 * @param titleType the titleType to set
	 */
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	/**
	 * @return the primaryTitle
	 */
	public String getPrimaryTitle() {
		return primaryTitle;
	}

	/**
	 * @param primaryTitle the primaryTitle to set
	 */
	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	/**
	 * @return the originalTitle
	 */
	public String getOriginalTitle() {
		return originalTitle;
	}

	/**
	 * @param originalTitle the originalTitle to set
	 */
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	/**
	 * @return the isAdult
	 */
	public boolean isAdult() {
		return isAdult;
	}

	/**
	 * @param isAdult the isAdult to set
	 */
	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}

	/**
	 * @return the startYear
	 */
	public Long getStartYear() {
		return startYear;
	}

	/**
	 * @param startYear the startYear to set
	 */
	public void setStartYear(Long startYear) {
		this.startYear = startYear;
	}

	/**
	 * @return the endYear
	 */
	public Long getEndYear() {
		return endYear;
	}

	/**
	 * @param endYear the endYear to set
	 */
	public void setEndYear(Long endYear) {
		this.endYear = endYear;
	}

	/**
	 * @return the runtimeMinutes
	 */
	public Long getRuntimeMinutes() {
		return runtimeMinutes;
	}

	/**
	 * @param runtimeMinutes the runtimeMinutes to set
	 */
	public void setRuntimeMinutes(Long runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}

	/**
	 * @return the genres
	 */
	public List<String> getGenres() {
		return genres;
	}

	/**
	 * @param genres the genres to set
	 */
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}