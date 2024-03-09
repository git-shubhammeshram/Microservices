package com.app.ratingservice.implemention;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ratingservice.entities.Rating;
import com.app.ratingservice.repository.RatingRepository;
import com.app.ratingservice.service.RatingService;

@Service
public class RatingImplement implements RatingService{

	@Autowired
	private RatingRepository rr;
	
	@Override
	public Rating create(Rating rating) {
		
		return rr.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		
		return rr.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		
		return rr.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		
		return rr.findByHotelId(hotelId);
	}

}
