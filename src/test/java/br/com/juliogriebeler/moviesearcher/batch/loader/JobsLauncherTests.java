package br.com.juliogriebeler.moviesearcher.batch.loader;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JobsLauncherTests {
	//@AutoWired
	private JobsLauncher jobsLauncher = new JobsLauncher();

	@Test
	public void csvFileItemReaderTest() {
		jobsLauncher.launch();
	}
	
	
	@Test
	public final void givenUsingPlainJava_whenConvertingAnInputStreamToString_thenCorrect()
	  throws IOException {
	    String originalString = "1";
	    InputStream inputStream = new ByteArrayInputStream(originalString.getBytes());
	 
	    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	    int nRead;
	    byte[] data = new byte[1024];
	    while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
	        buffer.write(data, 0, nRead);
	    }
	 
	    buffer.flush();
	    byte[] byteArray = buffer.toByteArray();
	         
	    String text = new String(byteArray, StandardCharsets.UTF_8);
	    
	}

}
