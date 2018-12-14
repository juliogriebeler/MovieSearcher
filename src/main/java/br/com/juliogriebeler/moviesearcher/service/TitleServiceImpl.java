/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.juliogriebeler.moviesearcher.data.model.TitleBasic;
import br.com.juliogriebeler.moviesearcher.data.repository.TitleRepository;

/**
 * @author Julio
 *
 */
@Service
public class TitleServiceImpl implements TitleService {

	    private TitleRepository titleRepository;

		@Autowired
	    public void setTitleRepository(TitleRepository titleRepository) {
	        this.titleRepository = titleRepository;
	    }

		
	    public TitleBasic save(TitleBasic title) {
	        return titleRepository.save(title);
	    }

	    public void delete(TitleBasic title) {
	        titleRepository.delete(title);
	    }

	    public Iterable<TitleBasic> findAll() {
	        return titleRepository.findAll();
	    }

	    public List<TitleBasic> findByAuthor(String title, PageRequest pageRequest) {
	        return titleRepository.findByPrimaryTitleOrOriginalTitle(title);
	    }


		@Override
		public TitleBasic findOne(String id) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<TitleBasic> findByTitle(String title) {
			// TODO Auto-generated method stub
			return null;
		}

	}
