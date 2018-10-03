package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;

/*
 * FlightService
 */
public interface FlightService {
	void addFlight(FlightModel flight);
	
	FlightModel getFlightByFlightNumber(String flightNumber);
}
