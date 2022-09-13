package com.springboot.h2databaseExample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.h2databaseExample.model.Movie;
@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
