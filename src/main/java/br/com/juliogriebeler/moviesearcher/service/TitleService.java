package br.com.juliogriebeler.moviesearcher.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import br.com.juliogriebeler.moviesearcher.model.TitleBasic;

/**
 * @author Julio
 *
 */
public interface TitleService {

	TitleBasic save(TitleBasic book);

	void delete(TitleBasic book);

	TitleBasic findOne(String id);

	Iterable<TitleBasic> findAll();

	List<TitleBasic> findByAuthor(String author, PageRequest pageRequest);

	List<TitleBasic> findByTitle(String title);

}
