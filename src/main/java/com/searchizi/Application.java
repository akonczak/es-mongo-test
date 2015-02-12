package com.searchizi;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.searchizi.mongo.repository")
@EnableElasticsearchRepositories(basePackages = "com.searchizi.es.repository")
@ComponentScan
public class Application  {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(Application.class).run(args);
    }

}
