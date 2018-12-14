package br.com.juliogriebeler.moviesearcher.batch.config;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import br.com.juliogriebeler.moviesearcher.data.model.TitleBasic;

@Configuration
public class FileReaderConfig {

	@Bean
	ItemReader<TitleBasic> tsvFileItemReader() {
		FlatFileItemReader<TitleBasic> tsvReader = new FlatFileItemReader<>();
		try {
			System.out.println(1);
			tsvReader.setResource(new ClassPathResource("C:\\Users\\jfgriebeler\\Downloads\\data.tsv"));
			System.out.println(2);
			tsvReader.setLinesToSkip(1);
			System.out.println(3);
			LineMapper<TitleBasic> titleLineMapper = createTitleLineMapper();
			System.out.println(4 + " - " + titleLineMapper );
			tsvReader.setLineMapper(titleLineMapper);
			System.out.println(5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return tsvReader;
	}

	private LineMapper<TitleBasic> createTitleLineMapper() {
		System.out.println(1.1);
		DefaultLineMapper<TitleBasic> titleLineMapper = new DefaultLineMapper<>();
		System.out.println(1.2);

		LineTokenizer titleLineTokenizer = createTitleLineTokenizer();
		System.out.println(1.3);
		titleLineMapper.setLineTokenizer(titleLineTokenizer);
		System.out.println(1.4);

		FieldSetMapper<TitleBasic> titleInformationMapper = createTitleInformationMapper();
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

	private FieldSetMapper<TitleBasic> createTitleInformationMapper() {
		System.out.println(3);
		BeanWrapperFieldSetMapper<TitleBasic> titleInformationMapper = new BeanWrapperFieldSetMapper<>();
		System.out.println(3.1);
		titleInformationMapper.setTargetType(TitleBasic.class);
		System.out.println(3.2);
		return titleInformationMapper;
	}
}
