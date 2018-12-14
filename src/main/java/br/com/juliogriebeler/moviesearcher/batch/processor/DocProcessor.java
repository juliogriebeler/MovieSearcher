package br.com.juliogriebeler.moviesearcher.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import br.com.juliogriebeler.moviesearcher.data.model.EdiDocument;

@Component
public class DocProcessor implements ItemProcessor<EdiDocument, EdiDocument> {
    @Override
    public EdiDocument process(final EdiDocument item) throws Exception {
        return item;
    }
}