package be.webflux.services;

import java.math.BigInteger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import be.webflux.dao.OrganisationRepository;
import be.webflux.domain.Organisation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class OrganisationService {

	@Autowired
	OrganisationRepository organisationRepository;
	
	@PostMapping("/organisation")
	public Mono<Organisation> create(@Valid @RequestBody Organisation o) {
		System.out.println("save:"+o);
		return organisationRepository.insert(o);
	}

	@GetMapping("/organisation/{id}")
	public Mono<Organisation> findById(@PathVariable(value = "id") BigInteger id) {
		return organisationRepository.findById(id);
	}

	public Flux<Organisation> findByName(String name) {
		return organisationRepository.findByName(name);
	}

	@GetMapping("/organisation")
	public Flux<Organisation> findAll() {
		return organisationRepository.findAll();
	}

	@PutMapping("/organisation/{id}")
	public Mono<Organisation> update(@PathVariable(value = "id") BigInteger id, @Valid @RequestBody Organisation o) {
		return organisationRepository.save(o);
	}

	@DeleteMapping("/organisation/{id}")
	public Mono<Void> delete(@PathVariable(value = "id") BigInteger id) {
		return organisationRepository.deleteById(id);
	}
	
	@GetMapping(path="/stream/organisation",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Organisation> streamAll() {
		return organisationRepository.findAll();
	}
}
