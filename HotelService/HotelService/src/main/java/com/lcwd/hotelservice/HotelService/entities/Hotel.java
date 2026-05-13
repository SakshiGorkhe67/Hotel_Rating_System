package com.lcwd.hotelservice.HotelService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Table(name="hotels")

public class Hotel {
    @Id
    private String id;
    private String name;
    private String location;
    private String about;

}
