package com.lcwd.hotelservice.HotelService.exception;

public class ResourceNotFoundException  extends  RuntimeException{
    public ResourceNotFoundException(String s){
       super(s);
    }

    public ResourceNotFoundException() {
        System.out.println("Resource Not Found");
    }
}
