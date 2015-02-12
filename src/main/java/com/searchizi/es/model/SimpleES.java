package com.searchizi.es.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by akonczak on 12/02/15.
 */
@Document(indexName = "test-index")
public class SimpleES {

	@Id
	public String id;
	public String test;

}
