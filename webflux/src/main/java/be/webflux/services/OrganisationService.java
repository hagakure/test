package be.webflux.services;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.webflux.dao.OrganisationRepository;
import be.webflux.domain.Organisation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OrganisationService implements IOrganisationService{

	@Autowired
	OrganisationRepository organisationRepository;
	@Override
	public void create(Organisation o) {
		organisationRepository.insert(o).subscribe();
	}

	@Override
	public Mono<Organisation> findById(BigInteger id) {
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
	public Mono<Void> delete(BigInteger id) {
		return organisationRepository.deleteById(id);
	}

}
