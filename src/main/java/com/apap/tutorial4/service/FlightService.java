package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;

/*
 * FlightService
 */
public interface FlightService {
	void addFlight(FlightModel flight);
	
	void deleteFlightById(Long id);
	
	FlightModel updateFlight(FlightModel flight);
	
	FlightModel getFlightById(Long id);
	
	FlightModel getFlightByFlightNumber(String flightNumber);
}
