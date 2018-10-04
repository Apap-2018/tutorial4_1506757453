package com.apap.tutorial4.service;

import com.apap.tutorial4.model.PilotModel;
import com.apap.tutorial4.repository.PilotDB;

/*
 * PilotService
 */
public interface PilotService {
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
	
	PilotModel getPilotById(Long id);
	
	void addPilot(PilotModel pilot);
	
	void updatePilot(PilotModel pilot);
	
	void deletePilotById(Long id);
	
	PilotDB getPilotDb();
}
