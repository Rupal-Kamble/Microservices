package com.rupal.hotel.service.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rupal.hotel.service.entities.Hotel;
import com.rupal.hotel.service.exceptions.ResorceNotFoundException;
import com.rupal.hotel.service.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel addHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel findHotelById(String id) {
		Hotel hotel = hotelRepository.findById(id).orElseThrow(()-> new ResorceNotFoundException("Requested resource is not found"));
		return hotel;
	}

	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}

}
