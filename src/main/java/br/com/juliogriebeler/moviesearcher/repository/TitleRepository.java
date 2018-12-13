/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import br.com.juliogriebeler.moviesearcher.model.Title;

/**
 * @author Julio
 *
 */
public interface TitleRepository extends ElasticsearchRepository<Title, String> {
	/*
	 * Requirement #1 (easy): IMDb copycat: Present the user with endpoint for
	 * allowing them to search by movie’s primary title or original title. The
	 * outcome should be related information to that title, including cast and crew.
	 */

	public List<Title> findByPrimaryTitleOrOriginalTitle(String title);

	/*
	 * Requirement #2 (easy): Top rated movies: Given a query by the user, you must
	 * provide what are the top rated movies for a genre (If the user searches
	 * horror, then it should show a list of top rated horror movies).
	 */
	public Page<Title> findByGenresAndAverageRating(String genre);

	/*
	 * Requirement #3 (easy): Typecasting: Given a query by the user, where he/she
	 * provides an actor/actress name, the system should determine if that person
	 * has become typecasted (at least half of their work is one genre).
	 */
	public Page<Title> findByPrincipals(String name);

	/*
	 * Requirement #4 (easy): Find the coincidence: Given a query by the user, where
	 * the input is two actors/actresses names, the application replies with a list
	 * of movies or TV shows that both people have shared.
	 */
	public Page<Title> findByPrincipalsAndPrimaryTitle(String name1, String name2);
	
	/* 
	 * Requirement #5 (difficult): Six degrees of Kevin Bacon: Given a query by the
	 * user, you must provide what’s the degree of separation between the person
	 * (e.g. actor or actress) the user has entered and Kevin Bacon.
	 */

	public Page<Title> findByPrincipalsAndAttributes(String name);

}
