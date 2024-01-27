package com.devsuperior.demo.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.dto.EventDTO;
import com.devsuperior.demo.services.EventService;

@RestController
@RequestMapping("/events")
public class EventController {

	@Autowired
	private EventService service;
	
	@PutMapping("/{id}")
	public EventDTO atualiza(@RequestBody EventDTO  dto , @PathVariable Long id) {
		return service.atualiza(dto, id);
	}
}
