package br.com.juliogriebeler.moviesearcher.data.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "moviesearcher", type = "documents")
public class EdiDocument {

}
