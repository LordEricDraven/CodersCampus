package com.coderscampus.Week14.alphavangtage;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Week14.alphavangtage.dto.AlphaVantageResponse;

public class AlphaVantageIntegration {

	@Test
	public void callApiExample() {
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://www.alphavantage.co/query")
									  .queryParam("function", "TIME_SERIES_INTRADAY")
									  .queryParam("symbol", "TSLA")
		   							  .queryParam("interval", "5min")
									  .queryParam("apikey", "I9XF8HYVSMVC00RG")
									  .build()
									  .toUri();
				
		ResponseEntity<AlphaVantageResponse> response = rt.getForEntity(uri,  AlphaVantageResponse.class);
		System.out.println(response.getBody());
	}
}
