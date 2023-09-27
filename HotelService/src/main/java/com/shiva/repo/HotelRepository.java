package com.shiva.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
