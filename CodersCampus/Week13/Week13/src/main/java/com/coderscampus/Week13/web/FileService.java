package com.coderscampus.Week13.web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class FileService {
	
	@Autowired
	private FileService fileService;
	
	@GetMapping("")
	public List<String> readFile(String fileName) throws IOException {
		fileService = new FileService();
		return Files.readAllLines(Paths.get(fileName));
	}
}
