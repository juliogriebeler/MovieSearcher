/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.data.model;

import org.springframework.data.annotation.Id;

/**
 * @author Julio
 *
 */

public class TitlePrincipals {

	@Id
	private String tconst;
	private Integer ordering;
	// private String nconst;
	private NameBasic nameBasic;
	private String category;
	private String job;
	private String characters;

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
	 * @return the nameBasic
	 */
	public NameBasic getNameBasic() {
		return nameBasic;
	}

	/**
	 * @param nameBasic the nameBasic to set
	 */
	public void setNameBasic(NameBasic nameBasic) {
		this.nameBasic = nameBasic;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the characters
	 */
	public String getCharacters() {
		return characters;
	}

	/**
	 * @param characters the characters to set
	 */
	public void setCharacters(String characters) {
		this.characters = characters;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
