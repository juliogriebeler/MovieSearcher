/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.data.model;

import org.springframework.data.annotation.Id;

/**
 * @author Julio
 *
 */

public class TitleEpisode {

	@Id
	private String tconst;
	private String parentTconst;
	private Integer seasonNumber;
	private Integer episodeNumber;

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
	 * @return the parentTconst
	 */
	public String getParentTconst() {
		return parentTconst;
	}

	/**
	 * @param parentTconst the parentTconst to set
	 */
	public void setParentTconst(String parentTconst) {
		this.parentTconst = parentTconst;
	}

	/**
	 * @return the seasonNumber
	 */
	public Integer getSeasonNumber() {
		return seasonNumber;
	}

	/**
	 * @param seasonNumber the seasonNumber to set
	 */
	public void setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	/**
	 * @return the episodeNumber
	 */
	public Integer getEpisodeNumber() {
		return episodeNumber;
	}

	/**
	 * @param episodeNumber the episodeNumber to set
	 */
	public void setEpisodeNumber(Integer episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
