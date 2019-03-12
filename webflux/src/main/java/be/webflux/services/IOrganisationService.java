package be.webflux.services;

import be.webflux.domain.Organisation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IOrganisationService {
	 void create(Organisation o);
	 Mono<Organisation> findById(Long id);
	 Flux<Organisation> findByName(String name);
	 Flux<Organisation> findAll();
	 Mono<Organisation> update(Organisation o);
	 Mono<Void> delete(Long id);
}
