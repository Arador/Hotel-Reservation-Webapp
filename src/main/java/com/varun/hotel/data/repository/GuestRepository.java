package com.varun.hotel.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.varun.hotel.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}