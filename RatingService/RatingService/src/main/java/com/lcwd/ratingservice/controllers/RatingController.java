package com.lcwd.ratingservice.controllers;

import com.lcwd.ratingservice.entities.Rating;
import com.lcwd.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    //create
    @PostMapping
    ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        return new ResponseEntity<Rating>(ratingService.createRating(rating), HttpStatus.CREATED);
    }

    // get All Rating
    @GetMapping
    ResponseEntity<List<Rating>> getAllRatings(){
        return ResponseEntity.ok(ratingService.getAllRatings());
    }

    // find rating by user Id
    @GetMapping("/users/{userId}")
    ResponseEntity<List<Rating>>getRatingByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingsByUserId(userId));
    }


    // find rating by hotel Id
    @GetMapping("/hotels/{hotelId}")
    ResponseEntity<List<Rating>>getRatingByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getRatingsByHotelId(hotelId));
    }







}
