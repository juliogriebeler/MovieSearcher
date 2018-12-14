package br.com.juliogriebeler.moviesearcher.batch.loader;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import br.com.juliogriebeler.moviesearcher.data.model.EdiDocument;
import br.com.juliogriebeler.moviesearcher.data.repository.EsDocumentRepository;
 
@Component
public class ElasticSearchItemWriter implements ItemWriter<EdiDocument>, InitializingBean {
 
    private EsDocumentRepository repository;
 
    public ElasticSearchItemWriter(EsDocumentRepository repository) {
        this.repository = repository;
    }
 
    @Override
    public void write(final List<? extends EdiDocument> items) throws Exception {
        //repository.save(items);
    }
 
    @Override
    public void afterPropertiesSet() throws Exception {
    }
}