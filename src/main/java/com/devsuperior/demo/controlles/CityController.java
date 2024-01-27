package com.devsuperior.demo.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.dto.CityDTO;
import com.devsuperior.demo.services.CityService;

@RestController
@RequestMapping("/cities")
public class CityController {

	@Autowired
	private CityService service;
	
	@GetMapping
	public List<CityDTO> lista() {
		return service.lista();
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public CityDTO adiciona(@RequestBody CityDTO dto) {
		return service.adiciona(dto);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void adiciona(@PathVariable Long id) {
		service.delete(id);
	}
}
