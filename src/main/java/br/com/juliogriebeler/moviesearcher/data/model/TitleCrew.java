/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.data.model;

import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * @author Julio
 *
 */
public class TitleCrew {

	@Id
	private String tconst;
	private List<NameBasic> directors;
	private List<NameBasic> writers;

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
	 * @return the directors
	 */
	public List<NameBasic> getDirectors() {
		return directors;
	}

	/**
	 * @param directors the directors to set
	 */
	public void setDirectors(List<NameBasic> directors) {
		this.directors = directors;
	}

	/**
	 * @return the writers
	 */
	public List<NameBasic> getWriters() {
		return writers;
	}

	/**
	 * @param writers the writers to set
	 */
	public void setWriters(List<NameBasic> writers) {
		this.writers = writers;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
