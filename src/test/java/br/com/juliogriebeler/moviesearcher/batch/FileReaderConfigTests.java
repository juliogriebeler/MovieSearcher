package br.com.juliogriebeler.moviesearcher.batch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileReaderConfigTests {
	
	//@AutoWired
	FileReaderConfig fileReaderConfig = new FileReaderConfig();
	
	@Test
	public void csvFileItemReaderTest() {
		fileReaderConfig.csvFileItemReader();
	}

}