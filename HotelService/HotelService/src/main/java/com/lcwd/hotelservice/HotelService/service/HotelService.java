package com.lcwd.hotelservice.HotelService.service;

import com.lcwd.hotelservice.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {
    //create

    Hotel createHotel(Hotel hotel);

    //get all
    List<Hotel> getAllHotel();

    //get single
    Hotel getHotelById(String id);
}
