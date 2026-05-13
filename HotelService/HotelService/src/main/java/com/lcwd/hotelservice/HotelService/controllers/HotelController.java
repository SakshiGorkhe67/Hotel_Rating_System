package com.lcwd.hotelservice.HotelService.controllers;

import com.lcwd.hotelservice.HotelService.entities.Hotel;
import com.lcwd.hotelservice.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    //create

    @PostMapping
    public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel){
       return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));
    }

    //get single
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getSingleUser(@PathVariable String id){
       return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotelById(id));
    }
    //get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels(){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotel());
    }

}
