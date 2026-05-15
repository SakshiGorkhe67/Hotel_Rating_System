package com.lcwd.ratingservice.service;

import com.lcwd.ratingservice.entities.Rating;
import com.lcwd.ratingservice.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {


    //create
    Rating createRating(Rating rating);



    //getall
    List<Rating> getAllRatings();

    //get all by user Id
    List<Rating> getRatingsByUserId(String userId);

    //get all by hotel Id

    List<Rating> getRatingsByHotelId(String hotelId);
}
