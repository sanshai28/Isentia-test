package com.competency.isentia.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.competency.isentia.model.*;


public interface ArticleService {
	
	//Service method to get by keyword Search	
	public List<Article> findByKeyword(String keyword) ;

	
	

}
