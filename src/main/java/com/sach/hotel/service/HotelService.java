package com.sach.hotel.service;

import com.sach.hotel.enties.Hotel;

import java.util.List;

public interface HotelService {

    //Get All Hotels
    public List<Hotel> getAllHotels();

    //Get Singel Hotel

    public Hotel getHotelDetails(int id);

    //delete Hotel details

    public String deleteHotelDetails(int id);

    //Save Hotel details

    public  Hotel saveHotelDetails(Hotel hotel);

    //Update Hotel details
    public Hotel updateHotelDetails(Hotel hotel);

}
