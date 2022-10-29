package com.capg.flightbooking.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.capg.flightbooking.Entity.Booking;

@Repository
public interface BookingRepository  extends MongoRepository<Booking, String> {

	/*@Query("{firstName: ?0}")
	Booking getByFirstname(String firstName);*/
}