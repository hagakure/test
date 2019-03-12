package be.webflux.services;

import org.springframework.beans.factory.annotation.Autowired;

import be.webflux.dao.OrganisationRepository;
import be.webflux.domain.Organisation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class OrganisationService implements IOrganisationService{

	@Autowired
	OrganisationRepository organisationRepository;
	@Override
	public void create(Organisation o) {
		organisationRepository.save(o).subscribe();
	}

	@Override
	public Mono<Organisation> findById(Long id) {
		return organisationRepository.findById(id);
	}

	@Override
	public Flux<Organisation> findByName(String name) {
		return organisationRepository.findByName(name);
	}

	@Override
	public Flux<Organisation> findAll() {
		return organisationRepository.findAll();
	}

	@Override
	public Mono<Organisation> update(Organisation o) {
		return organisationRepository.save(o);
	}

	@Override
	public Mono<Void> delete(Long id) {
		return organisationRepository.deleteById(id);
	}

}
