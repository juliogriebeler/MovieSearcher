package br.com.juliogriebeler.movieevaluator.batch;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.batch.item.ItemReader;
import org.springframework.util.ResourceUtils;

import br.com.juliogriebeler.movieevaluator.model.Title;
import br.com.juliogriebeler.moviesearcher.batch.FileReaderConfig;

public class FileReaderConfigTest {

	private FileReaderConfig fileReaderConfig;
	
	@Before
	public void setUp() throws Exception {
		fileReaderConfig = new FileReaderConfig();
	}

	@Test
	public void testTsvFileItemReader() {
		//ItemReader<TitleDTO> reader = fileReaderConfig.tsvFileItemReader();		
	}
	
	@Test
	public void testGetFileWithSpring() throws FileNotFoundException, MalformedURLException {
		fileReaderConfig.getFileWithSpring();
	}

}
