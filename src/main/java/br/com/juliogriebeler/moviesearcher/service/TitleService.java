package br.com.juliogriebeler.moviesearcher.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import br.com.juliogriebeler.moviesearcher.model.Title;

public interface TitleService {


    Title save(Title book);

    void delete(Title book);

    Title findOne(String id);

    Iterable<Title> findAll();

    List<Title> findByAuthor(String author, PageRequest pageRequest);

    List<Title> findByTitle(String title);

}
