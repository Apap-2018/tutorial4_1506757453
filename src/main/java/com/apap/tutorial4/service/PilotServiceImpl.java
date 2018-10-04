package com.apap.tutorial4.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.tutorial4.model.PilotModel;
import com.apap.tutorial4.repository.PilotDB;

/*
 * PilotServiceImpl
 */
@Service
@Transactional
public class PilotServiceImpl implements PilotService{
	@Autowired
	private PilotDB pilotDb;
	
	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		return pilotDb.findByLicenseNumber(licenseNumber);
	}
	
	@Override
	public PilotModel getPilotById (Long id) {
		return pilotDb.getOne(id);
	}
	
	@Override
	public void addPilot(PilotModel pilot) {
		pilotDb.save(pilot);
	}
	
	@Override
	public void updatePilot(PilotModel pilot) {
		PilotModel pilotToUpdate = pilotDb.getOne(pilot.getId());
		pilotToUpdate.setFlyHour(pilot.getFlyHour());
		pilotToUpdate.setLicenseNumber(pilot.getLicenseNumber());
        pilotToUpdate.setName(pilot.getName());
        
        pilotDb.save(pilot);
	}
	
	@Override 
	public void deletePilotById(Long id) {
		pilotDb.deleteById(id);
	}
	
	public PilotDB getPilotDb() {
        return pilotDb;
    }
}
