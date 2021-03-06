/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.data.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import br.com.juliogriebeler.moviesearcher.data.model.TitleBasic;

/**
 * @author Julio
 *
 */
public interface TitleRepository extends ElasticsearchRepository<TitleBasic, String> {
	/*
	 * Requirement #1 (easy): IMDb copycat: Present the user with endpoint for
	 * allowing them to search by movie’s primary title or original title. The
	 * outcome should be related information to that title, including cast and crew.
	 */

	public List<TitleBasic> findByPrimaryTitleOrOriginalTitle(String title);

	/*
	 * Requirement #2 (easy): Top rated movies: Given a query by the user, you must
	 * provide what are the top rated movies for a genre (If the user searches
	 * horror, then it should show a list of top rated horror movies).
	 */
	//public Page<TitleBasic> findByGenresContainingAndTitleRatingAverageRating(String genre);

	/*
	 * Requirement #3 (easy): Typecasting: Given a query by the user, where he/she
	 * provides an actor/actress name, the system should determine if that person
	 * has become typecasted (at least half of their work is one genre).
	 */
	//public Page<TitleBasic> findByTitlePrincipalsNameBasicPrimaryName(String name);

	/*
	 * Requirement #4 (easy): Find the coincidence: Given a query by the user, where
	 * the input is two actors/actresses names, the application replies with a list
	 * of movies or TV shows that both people have shared.
	 */
	//findByAvailableTrueOrderByNameDesc
	//public Page<TitleBasic> findByTitlePrincipalsNameBasicPrimaryName(String name1, String name2);

	/*
	 * Requirement #5 (difficult): Six degrees of Kevin Bacon: Given a query by the
	 * user, you must provide what’s the degree of separation between the person
	 * (e.g. actor or actress) the user has entered and Kevin Bacon.
	 */

	//public Page<TitleBasic> findByTitlePrincipalsNameBasicPrimaryNameEquals(String name);

}
