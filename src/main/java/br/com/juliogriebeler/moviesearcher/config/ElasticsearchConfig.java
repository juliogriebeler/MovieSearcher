package br.com.juliogriebeler.moviesearcher.config;

import java.net.InetAddress;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "br.com.juliogriebeler.moviesearcher.repository")
public class ElasticsearchConfig {

	@Value("${elasticsearch.host}")
	private String host;

	@Value("${elasticsearch.port}")
	private int port;

	@Value("${elasticsearch.clustername}")
	private String clusterName;

	@Bean
	public Client client() throws Exception {

		Settings settings = Settings.builder().put("cluster.name", clusterName).build();
		TransportClient client = new PreBuiltTransportClient(settings)
				.addTransportAddress(new TransportAddress(InetAddress.getByName(host), port));
		return client;
	}

	@Bean
	public ElasticsearchOperations getElasticsearchTemplate() throws Exception {
		return new ElasticsearchTemplate(client());
	}

	// Embedded Elasticsearch Server
	/* @Bean public ElasticsearchOperations elasticsearchTemplate() {
	 * 		return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
	 * }
	 */

}
