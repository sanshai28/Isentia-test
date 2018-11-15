package com.competency.isentia.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.competency.isentia.model.Article;
import com.competency.isentia.repository.ArticleRepository;
import com.competency.isentia.service.ArticleService;


@Controller
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@Autowired
	ArticleRepository articleRepository;

	@RequestMapping(value = "/v1/article/search", method = RequestMethod.GET)
	public @ResponseBody List<Article> searchByKeyword(HttpServletRequest req, HttpServletResponse resp,
			@RequestParam(value = "keyword", required = false) String keyword) {
		
		
		return articleService.findByKeyword(keyword);
	}

}
