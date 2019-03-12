package be.webflux.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import be.webflux.domain.Organisation;
import reactor.core.publisher.Flux;

public interface OrganisationRepository extends ReactiveMongoRepository<Organisation, Long>{
    @Query("{ 'name': ?0 }")
    Flux<Organisation> findByName(final String name);
}
