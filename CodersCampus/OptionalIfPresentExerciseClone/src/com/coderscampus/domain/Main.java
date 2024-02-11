package com.coderscampus.domain;


import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileService fileService = new FileService();
		
		// Week 1
		System.out.println("Week 1");
		List<SuspectLocation> week1Locations = fileService.readSuspectLocations("InterpolWatchReport-Week1.csv");
		fileService.findCarmenSandiego(week1Locations);
		
		// Week 2
		System.out.println("Week 2");
		List<SuspectLocation> week2Locations = fileService.readSuspectLocations("InterpolWatchReport-Week2.csv");
		fileService.findCarmenSandiego(week2Locations);
		
		// Week 3
		System.out.println("Week 3");
		List<SuspectLocation> week3Locations = fileService.readSuspectLocations("InterpolWatchReport-Week3.csv");
		fileService.findCarmenSandiego(week3Locations);
				
		
	}

}
