package com.devsuperior.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.demo.dto.EventDTO;
import com.devsuperior.demo.entities.City;
import com.devsuperior.demo.entities.Event;
import com.devsuperior.demo.exception.idEmCorpoInvalidoException;
import com.devsuperior.demo.exceptions.EntidadeNaoEncontradaException;
import com.devsuperior.demo.repositories.CityRepository;
import com.devsuperior.demo.repositories.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private EventRepository repository;
	
	public EventDTO atualiza(EventDTO dto, Long id) {
		
	   Event event	= repository.findById(id).orElseThrow(() -> new EntidadeNaoEncontradaException(id));
	   event.setName(dto.getName());
	   event.setDate(dto.getDate());
	   event.setUrl(dto.getUrl());
	   
	   City city = cityRepository.findById(dto.getCityId()).orElseThrow(() -> new idEmCorpoInvalidoException("City" , dto.getCityId()));
	   event.setCity(city);
	   return new EventDTO(repository.save(event));
	}
}
