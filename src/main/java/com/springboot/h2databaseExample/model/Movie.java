package com.springboot.h2databaseExample.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Movie")
public class Movie {
@Id	
@GeneratedValue
private int id;

private String movieName;
private String reviews;


public int getId() {
	return id;
}
public String getReviews() {
	return reviews;
}
public void setReviews(String reviews) {
	this.reviews = reviews;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}




}
