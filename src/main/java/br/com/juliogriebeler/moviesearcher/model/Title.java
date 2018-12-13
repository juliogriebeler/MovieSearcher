
package br.com.juliogriebeler.moviesearcher.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import br.com.juliogriebeler.moviesearcher.enums.TitleTypesEnum;

@Document(indexName = "moviesearcher", type = "titles")
public class Title {

	@Id
	private String titleId;
	// akas
	private Integer ordering;
	private String title;
	private String region;
	private String language;
	private List<TitleTypesEnum> types;
	private List<String> attributes;
	private boolean isOriginalTitle;
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
	// crew
	private List<String> directors;
	private List<String> writers;
	// episodes
	private List<Episode> episodes;
	// principals
	private List<PrincipalCastCrew> principals;
	// ratings
	private Long averageRating;
	private Long numVotes;

	public Title() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the titleId
	 */
	public String getTitleId() {
		return titleId;
	}

	/**
	 * @param titleId
	 *            the titleId to set
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
	 * @param ordering
	 *            the ordering to set
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
	 * @param title
	 *            the title to set
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
	 * @param region
	 *            the region to set
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
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the types
	 */
	public List<TitleTypesEnum> getTypes() {
		return types;
	}

	/**
	 * @param types
	 *            the types to set
	 */
	public void setTypes(List<TitleTypesEnum> types) {
		this.types = types;
	}

	/**
	 * @return the attributes
	 */
	public List<String> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes
	 *            the attributes to set
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
	 * @param isOriginalTitle
	 *            the isOriginalTitle to set
	 */
	public void setOriginalTitle(boolean isOriginalTitle) {
		this.isOriginalTitle = isOriginalTitle;
	}

	/**
	 * @return the titleType
	 */
	public String getTitleType() {
		return titleType;
	}

	/**
	 * @param titleType
	 *            the titleType to set
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
	 * @param primaryTitle
	 *            the primaryTitle to set
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
	 * @param originalTitle
	 *            the originalTitle to set
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
	 * @param isAdult
	 *            the isAdult to set
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
	 * @param startYear
	 *            the startYear to set
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
	 * @param endYear
	 *            the endYear to set
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
	 * @param runtimeMinutes
	 *            the runtimeMinutes to set
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
	 * @param genres
	 *            the genres to set
	 */
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	/**
	 * @return the directors
	 */
	public List<String> getDirectors() {
		return directors;
	}

	/**
	 * @param directors
	 *            the directors to set
	 */
	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}

	/**
	 * @return the writers
	 */
	public List<String> getWriters() {
		return writers;
	}

	/**
	 * @param writers
	 *            the writers to set
	 */
	public void setWriters(List<String> writers) {
		this.writers = writers;
	}

	/**
	 * @return the episodes
	 */
	public List<Episode> getEpisodes() {
		return episodes;
	}

	/**
	 * @param episodes
	 *            the episodes to set
	 */
	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}

	/**
	 * @return the principals
	 */
	public List<PrincipalCastCrew> getPrincipals() {
		return principals;
	}

	/**
	 * @param principals
	 *            the principals to set
	 */
	public void setPrincipals(List<PrincipalCastCrew> principals) {
		this.principals = principals;
	}

	/**
	 * @return the averageRating
	 */
	public Long getAverageRating() {
		return averageRating;
	}

	/**
	 * @param averageRating
	 *            the averageRating to set
	 */
	public void setAverageRating(Long averageRating) {
		this.averageRating = averageRating;
	}

	/**
	 * @return the numVotes
	 */
	public Long getNumVotes() {
		return numVotes;
	}

	/**
	 * @param numVotes
	 *            the numVotes to set
	 */
	public void setNumVotes(Long numVotes) {
		this.numVotes = numVotes;
	}

	/*
	 * title.ratings.tsv.gz – Contains the IMDb rating and votes information for
	 * titles tconst (string) - alphanumeric unique identifier of the title
	 * averageRating – weighted average of all the individual user ratings numVotes
	 * - number of votes the title has received
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * title.akas.tsv.gz - Contains the following information for titles: titleId
	 * (string) - a tconst, an alphanumeric unique identifier of the title ordering
	 * (integer) – a number to uniquely identify rows for a given titleId title
	 * (string) – the localized title region (string) - the region for this version
	 * of the title language (string) - the language of the title types (array) -
	 * Enumerated set of attributes for this alternative title. One or more of the
	 * following: "alternative", "dvd", "festival", "tv", "video", "working",
	 * "original", "imdbDisplay". New values may be added in the future without
	 * warning attributes (array) - Additional terms to describe this alternative
	 * title, not enumerated isOriginalTitle (boolean) – 0: not original title; 1:
	 * original title title.basics.tsv.gz - Contains the following information for
	 * titles: tconst (string) - alphanumeric unique identifier of the title
	 * titleType (string) – the type/format of the title (e.g. movie, short,
	 * tvseries, tvepisode, video, etc) primaryTitle (string) – the more popular
	 * title / the title used by the filmmakers on promotional materials at the
	 * point of release originalTitle (string) - original title, in the original
	 * language isAdult (boolean) - 0: non-adult title; 1: adult title startYear
	 * (YYYY) – represents the release year of a title. In the case of TV Series, it
	 * is the series start year endYear (YYYY) – TV Series end year. ‘\N’ for all
	 * other title types runtimeMinutes – primary runtime of the title, in minutes
	 * genres (string array) – includes up to three genres associated with the title
	 * title.crew.tsv.gz – Contains the director and writer information for all the
	 * titles in IMDb. Fields include: tconst (string) - alphanumeric unique
	 * identifier of the title directors (array of nconsts) - director(s) of the
	 * given title writers (array of nconsts) – writer(s) of the given title
	 * title.episode.tsv.gz – Contains the tv episode information. Fields include:
	 * tconst (string) - alphanumeric identifier of episode parentTconst (string) -
	 * alphanumeric identifier of the parent TV Series seasonNumber (integer) –
	 * season number the episode belongs to episodeNumber (integer) – episode number
	 * of the tconst in the TV series name.basics.tsv.gz – Contains the following
	 * information for names: nconst (string) - alphanumeric unique identifier of
	 * the name/person primaryName (string)– name by which the person is most often
	 * credited birthYear – in YYYY format deathYear – in YYYY format if applicable,
	 * else '\N' primaryProfession (array of strings)– the top-3 professions of the
	 * person knownForTitles (array of tconsts) – titles the person is known for
	 * title.principals.tsv.gz – Contains the principal cast/crew for titles tconst
	 * (string) - alphanumeric unique identifier of the title ordering (integer) – a
	 * number to uniquely identify rows for a given titleId nconst (string) -
	 * alphanumeric unique identifier of the name/person category (string) - the
	 * category of job that person was in job (string) - the specific job title if
	 * applicable, else '\N' characters (string) - the name of the character played
	 * if applicable, else '\N'
	 */

}