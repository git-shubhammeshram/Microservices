package com.app.ratingservice.service;

import java.util.List;

import com.app.ratingservice.entities.Rating;

public interface RatingService {
	
	/*Create Rating*/
	Rating create (Rating rating);
	
	/*Get Rating*/
	List<Rating> getAllRating();
	
	/*Get Rating By UserID*/
	List<Rating> getRatingByUserId(String userId);
	
	/*Get Rating by HotelID*/
	List<Rating> getRatingByHotelId(String hotelId);

}
