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
public class NameBasic {

	@Id
	private String nconst;
	private String primaryName;
	private Integer birthYear;
	private Integer deathYear;
	private List<String> primaryProfession;
	private List<String> knownForTitles;

	/**
	 * @return the nconst
	 */
	public String getNconst() {
		return nconst;
	}

	/**
	 * @param nconst the nconst to set
	 */
	public void setNconst(String nconst) {
		this.nconst = nconst;
	}

	/**
	 * @return the primaryName
	 */
	public String getPrimaryName() {
		return primaryName;
	}

	/**
	 * @param primaryName the primaryName to set
	 */
	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName;
	}

	/**
	 * @return the birthYear
	 */
	public Integer getBirthYear() {
		return birthYear;
	}

	/**
	 * @param birthYear the birthYear to set
	 */
	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * @return the deathYear
	 */
	public Integer getDeathYear() {
		return deathYear;
	}

	/**
	 * @param deathYear the deathYear to set
	 */
	public void setDeathYear(Integer deathYear) {
		this.deathYear = deathYear;
	}

	/**
	 * @return the primaryProfession
	 */
	public List<String> getPrimaryProfession() {
		return primaryProfession;
	}

	/**
	 * @param primaryProfession the primaryProfession to set
	 */
	public void setPrimaryProfession(List<String> primaryProfession) {
		this.primaryProfession = primaryProfession;
	}

	/**
	 * @return the knownForTitles
	 */
	public List<String> getKnownForTitles() {
		return knownForTitles;
	}

	/**
	 * @param knownForTitles the knownForTitles to set
	 */
	public void setKnownForTitles(List<String> knownForTitles) {
		this.knownForTitles = knownForTitles;
	}

}
