package com.sach.hotel.service.Impl;

import com.sach.hotel.enties.Hotel;
import com.sach.hotel.exception.ResourceNotFoundException;
import com.sach.hotel.repositories.HotelRepo;
import com.sach.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepo hotelRepo;

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getHotelDetails(int id) {
        return hotelRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Given Hotel Details Not Found"));
    }

    @Override
    public String deleteHotelDetails(int id) {
        if (hotelRepo.findById(id).isPresent()) {
            hotelRepo.deleteById(id);
                return "User deleted successfully";
            }
            return "No such User in the database";
        }


    @Override
    public Hotel saveHotelDetails(Hotel hotel) {
        //Generate Unique UserId
        System.out.println("Hodel Name From Service" + hotel.getHotelId());

        return hotelRepo.save(hotel);


    }

    @Override
    public Hotel updateHotelDetails(Hotel htlUpdate) {
        Hotel htl = hotelRepo.getHotelById(htlUpdate.getHotelId());
        if (htl.getHotelId() == htlUpdate.getHotelId()) {
            htl.setHotelName(htlUpdate.getHotelName());
            htl.setLocation(htlUpdate.getLocation());
            htl.setAbout(htlUpdate.getAbout());
            hotelRepo.save(htl);


        }
        return htl;
}
}
