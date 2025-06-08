package com.sach.hotel.controller;

import com.sach.hotel.enties.Hotel;
import com.sach.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;

    //Create/add Hotel

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        System.out.println("Hotel Checking");

        Hotel addHotel=hotelService.saveHotelDetails(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(addHotel);


    }


    //Get All Hotels Detils
    @GetMapping("/getAllHotel")
    public ResponseEntity<List<Hotel>> getAllHotel(){

       List<Hotel> hotels= hotelService.getAllHotels();

       return ResponseEntity.ok(hotels);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable int id){

        Hotel hoteldetail=hotelService.getHotelDetails(id);

        return ResponseEntity.status(HttpStatus.FOUND).body(hoteldetail);
    }

    @PutMapping("/update")
    public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel){
        System.out.println("Hotel Update");

        Hotel updtHotel=hotelService.updateHotelDetails(hotel);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(updtHotel);
}
    // Get Delete User By ID
    @DeleteMapping("/delete/{uesrId}")
    public ResponseEntity<String> deleteUser(@PathVariable int uesrId){
        String msg=hotelService.deleteHotelDetails(uesrId);
        return ResponseEntity.ok(msg);

    }



}
