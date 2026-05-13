package com.lcwd.hotelservice.HotelService.service.Impl;

import com.lcwd.hotelservice.HotelService.entities.Hotel;
import com.lcwd.hotelservice.HotelService.exception.ResourceNotFoundException;
import com.lcwd.hotelservice.HotelService.repositories.HotelRepository;
import com.lcwd.hotelservice.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl  implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(String id) {

        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel with given Id not found"));
    }
}
