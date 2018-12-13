/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.model;

import org.springframework.data.annotation.Id;

/**
 * @author Julio
 *
 */

public class TitleRating {

	@Id
	private String tconst;
	private Double averageRating;
	private Integer numVotes;

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
	 * @return the averageRating
	 */
	public Double getAverageRating() {
		return averageRating;
	}

	/**
	 * @param averageRating the averageRating to set
	 */
	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	/**
	 * @return the numVotes
	 */
	public Integer getNumVotes() {
		return numVotes;
	}

	/**
	 * @param numVotes the numVotes to set
	 */
	public void setNumVotes(Integer numVotes) {
		this.numVotes = numVotes;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
