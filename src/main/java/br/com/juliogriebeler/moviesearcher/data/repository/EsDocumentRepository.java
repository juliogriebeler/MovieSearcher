package br.com.juliogriebeler.moviesearcher.data.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import br.com.juliogriebeler.moviesearcher.data.model.TitleBasic;

public interface EsDocumentRepository extends ElasticsearchRepository<TitleBasic, String> {

}
