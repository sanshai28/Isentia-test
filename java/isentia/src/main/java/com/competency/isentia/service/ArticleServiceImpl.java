package com.competency.isentia.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.stereotype.Service;

import com.competency.isentia.model.Article;
import com.competency.isentia.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleRepository articleRepository;

	@Override
	public List<Article> findByKeyword(String keyword) {
		List<Article> articles = null;
		if (keyword == null) {
			List<Article> i = articleRepository.findAll();
			return i;

		}
		TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingAny(keyword);
		articles = articleRepository.findAllByOrderByScoreDesc(criteria);
		return articles;
	}

}
