package com.springboot.h2databaseExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.h2databaseExample.model.Movie;
import com.springboot.h2databaseExample.repository.MovieRepository;
@Service
public class MovieService {
	@Autowired
private	MovieRepository movieRepository;


	public List<Movie> getAllMovies()
	{
		List<Movie> movies=(List<Movie>) movieRepository.findAll();
				
		return movies;
	}
	
	public Movie getById(int id)
	{
		return movieRepository.findById(id).get();
	}
	public Movie saveOrUpdate(Movie movie)
	{
		return movieRepository.save(movie);
		
	}
	
	public void deleteMovie(int id)
	{
		movieRepository.deleteById(id);
	}
}

