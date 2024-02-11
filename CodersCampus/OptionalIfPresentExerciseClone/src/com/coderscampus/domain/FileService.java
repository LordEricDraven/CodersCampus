package com.coderscampus.domain;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileService {

	public List<SuspectLocation> readSuspectLocations(String filename){
		List<SuspectLocation> suspectLocations = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(",");
				SuspectLocation suspectLocation = new SuspectLocation(parts[0], parts[1]);
				suspectLocations.add(suspectLocation);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return suspectLocations;
	}
	
	public void findCarmenSandiego(List<SuspectLocation> suspectLocations) {
		Optional<SuspectLocation> carmenSandiego = suspectLocations.stream()
																   .filter(location -> location.getName().equalsIgnoreCase("CARMEN SANDIEGO"))
																   .findAny();
		carmenSandiego.ifPresentOrElse(
				location -> System.out.println("Carmen Sandiego is in" + location.getCountry()),
				() -> System.out.println("Galdang, just missed her!"));
	
	}
	
}
