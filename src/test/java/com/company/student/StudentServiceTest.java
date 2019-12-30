package com.company.student;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.company.student.moviesClient.MovieClient;
import com.company.student.moviesClient.MovieDetails;
import com.company.student.moviesClient.Movies;
import com.company.student.repository.StudentRepository;
import com.company.student.service.StudentService;
import com.company.student.serviceimpl.StudentServiceImpl;

@RunWith(SpringRunner.class)
public class StudentServiceTest {

	@TestConfiguration
	static class StudentServiceTestContextConfiguration {

		@Bean
		public StudentService getStudentServicee() {

			return new StudentServiceImpl();
		}
	}

	@Autowired
	public StudentService studentService;

	@MockBean
	MovieClient moviesClient;

	@MockBean
	StudentRepository studentRepo;
	
	@Before
	public void setUp() {

		Movies movies = new Movies();
		movies.setPage("1");
		movies.setTotal(13);

		MovieDetails det1 = new MovieDetails();
		det1.setTitle("spider");

		MovieDetails det2 = new MovieDetails();
		det2.setTitle("spider");

		MovieDetails det3 = new MovieDetails();
		det3.setTitle("spider");

		List<MovieDetails> list = new ArrayList<>();
		list.add(det1);
		list.add(det2);
		list.add(det3);
		movies.setData(list);

		Mockito.when(moviesClient.getMoviesData(1)).thenReturn(movies);
	}
	
	@Test
	public void Test_GetMovieTitles() {
		
		Set<String> data = studentService.getTitles();
		
		assertTrue(data.size() == 3);	
		
	} 
	

}
