package com.sach.hotel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {
@GetMapping("/getAllStaff")
    public ResponseEntity<List<String>> getAllStaff(){

    List<String> staff= Arrays.asList("Sachin","Manoj","Arav","Punit");

    return new ResponseEntity<>(staff, HttpStatus.OK);

    }
}
