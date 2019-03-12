package be.webflux.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import be.webflux.domain.Organisation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrganisationRepository extends ReactiveMongoRepository<Organisation, BigInteger>{
    @Query("{ 'name': ?0 }")
    Flux<Organisation> findByName(final String name);
}
