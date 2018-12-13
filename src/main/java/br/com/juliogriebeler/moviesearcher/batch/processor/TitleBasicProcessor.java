package br.com.juliogriebeler.moviesearcher.batch.processor;

import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

import br.com.juliogriebeler.moviesearcher.model.TitleBasic;

public class TitleBasicProcessor implements ItemProcessor<TitleBasic, TitleBasic> {
	    
	    @Override
	    public TitleBasic process(final TitleBasic titleBasic) throws Exception {
	    	
	    	final TitleBasic transformedTitleBasic = new TitleBasic();
	    	transformedTitleBasic.setPrimaryTitle(titleBasic.getPrimaryTitle());
	        
	    	//log.info("Converting (" + titleBasic + ") into (" + transformedTitleBasic + ")");

	        return transformedTitleBasic;
	    }

	}