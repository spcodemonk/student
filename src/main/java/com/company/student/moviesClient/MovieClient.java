package com.company.student.moviesClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieClient {
	
	@Autowired
	RestTemplate restTemplate;
	
	public Movies getMoviesData(int page) {
		
		String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman&page="+page;
		Movies moviesData = restTemplate.getForObject(url, Movies.class);
		
		return moviesData;
	} 

}
