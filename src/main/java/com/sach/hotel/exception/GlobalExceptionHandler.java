package com.sach.hotel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>> handleResoureNotFoundException(ResourceNotFoundException ex){
     String Message=ex.getMessage();
     Map map=new HashMap<>();
     map.put("message",Message);
     map.put("success",false);
     map.put("status",HttpStatus.NOT_FOUND);

     return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);


    }
}
