package com.searchizi.es.repository;

import com.searchizi.es.model.SimpleES;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by akonczak on 12/02/15.
 */
public interface SimpleESRepo extends ElasticsearchRepository<SimpleES, String> {

}
