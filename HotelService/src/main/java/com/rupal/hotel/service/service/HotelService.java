package com.rupal.hotel.service.service;

import java.util.List;

import com.rupal.hotel.service.entities.Hotel;

public interface HotelService {

	Hotel addHotel(Hotel hotel);
	
	Hotel findHotelById(String id);
	
	List<Hotel> getAllHotels();
	
}
