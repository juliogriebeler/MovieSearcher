/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.batch.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import br.com.juliogriebeler.moviesearcher.batch.loader.ElasticSearchItemWriter;
import br.com.juliogriebeler.moviesearcher.batch.processor.DocProcessor;
import br.com.juliogriebeler.moviesearcher.data.model.EdiDocument;
import br.com.juliogriebeler.moviesearcher.data.repository.EsDocumentRepository;

/**
 * @author Julio
 *
 */

@Configuration
@EnableBatchProcessing
public class StepConfig {

	private StepBuilderFactory stepBuilderFactory;
	private DataSource dataSource;
	private EsDocumentRepository esRepository;
	private final int FETCH_SIZE = 100000;

	@Autowired
	public StepConfig(StepBuilderFactory stepBuilderFactory, DataSource dataSource, EsDocumentRepository esRepository) {
		this.stepBuilderFactory = stepBuilderFactory;
		this.dataSource = dataSource;
		this.esRepository = esRepository;
	}

	@Bean
	public ItemReader<EdiDocument> reader() {
		FlatFileItemReader<EdiDocument> tsvReader = new FlatFileItemReader<>();
		try {
			tsvReader.setResource(new ClassPathResource("C:\\Users\\jfgriebeler\\Downloads\\data.tsv"));
			tsvReader.setLinesToSkip(1);
			LineMapper<EdiDocument> titleLineMapper = createTitleLineMapper();
			tsvReader.setLineMapper(titleLineMapper);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return tsvReader;
	}

	private LineMapper<EdiDocument> createTitleLineMapper() {
		System.out.println(1.1);
		DefaultLineMapper<EdiDocument> titleLineMapper = new DefaultLineMapper<>();
		System.out.println(1.2);

		LineTokenizer titleLineTokenizer = createTitleLineTokenizer();
		System.out.println(1.3);
		titleLineMapper.setLineTokenizer(titleLineTokenizer);
		System.out.println(1.4);

		FieldSetMapper<EdiDocument> titleInformationMapper = createTitleInformationMapper();
		System.out.println(1.5);
		titleLineMapper.setFieldSetMapper(titleInformationMapper);
		System.out.println(1.6);

		return titleLineMapper;
	}

	private LineTokenizer createTitleLineTokenizer() {
		System.out.println(2.1);
		DelimitedLineTokenizer titleLineTokenizer = new DelimitedLineTokenizer();
		System.out.println(2.2);
		titleLineTokenizer.setDelimiter("\t");
		System.out.println(2.3);
		titleLineTokenizer.setNames(new String[] { "name", "emailAddress", "purchasedPackage" });
		System.out.println(2.4);
		return titleLineTokenizer;
	}

	private FieldSetMapper<EdiDocument> createTitleInformationMapper() {
		System.out.println(3);
		BeanWrapperFieldSetMapper<EdiDocument> titleInformationMapper = new BeanWrapperFieldSetMapper<>();
		System.out.println(3.1);
		titleInformationMapper.setTargetType(EdiDocument.class);
		System.out.println(3.2);
		return titleInformationMapper;
	}

	@Bean
	public DocProcessor processor() {
		return new DocProcessor();
	}

	@Bean
	public ElasticSearchItemWriter writer() {
		return new ElasticSearchItemWriter(esRepository);
	}

	@Bean
	public Step step() {
		return stepBuilderFactory.get("step").<EdiDocument, EdiDocument>chunk(100000).reader(reader())
				.processor(processor()).writer(writer()).build();
	}
}