package com.competency.isentia.repository;
import java.util.List;

import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.competency.isentia.model.Article;

public interface ArticleRepository extends MongoRepository<Article,String> {
	
	public List<Article> findAllByOrderByScoreDesc(TextCriteria criteria); 

}
