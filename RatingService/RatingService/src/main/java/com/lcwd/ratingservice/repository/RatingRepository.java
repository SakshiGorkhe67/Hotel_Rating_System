package com.lcwd.ratingservice.repository;

import com.lcwd.ratingservice.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,String> {
//Custom Finder Method

    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);

}
