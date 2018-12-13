/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.juliogriebeler.moviesearcher.model.Title;
import br.com.juliogriebeler.moviesearcher.repository.TitleRepository;

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

		
	    public Title save(Title title) {
	        return titleRepository.save(title);
	    }

	    public void delete(Title title) {
	        titleRepository.delete(title);
	    }

	    public Iterable<Title> findAll() {
	        return titleRepository.findAll();
	    }

	    public List<Title> findByAuthor(String title, PageRequest pageRequest) {
	        return titleRepository.findByPrimaryTitleOrOriginalTitle(title);
	    }


		@Override
		public Title findOne(String id) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<Title> findByTitle(String title) {
			// TODO Auto-generated method stub
			return null;
		}

	}
