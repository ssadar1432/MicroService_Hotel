package com.sach.hotel.repositories;

import com.sach.hotel.enties.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,Integer> {
    @Query("select htl FROM Hotel htl WHERE htl.hotelId =:id")
    Hotel getHotelById(int id);
}
