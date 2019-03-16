package com.sbrowne

class Appointment {

	Date appDate
	String appTime
	int appDuration
	String roomNumber
	Patient patients

	static hasMany=[surgeries:Surgery, doctors:Doctor]

	String toString(){

	return roomNumber	
		
	}

	static constraints = {
	
	appDate nullable:false, blank:false;
	appTime nullable:false, blank:false, maxSize:7;
	appDuration nullable:false, blank:false, max:60;
	roomNumber nullable:false, blank:false, maxSize:15;
	patients nullable:true, blank:true;
	
	}
}
