package com.coderscampus.Week13.web;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

	private FileService fileService;
	
	public List<String> readLines() throws IOException{
		return fileService.readFile("Test.txt");
	}
}
