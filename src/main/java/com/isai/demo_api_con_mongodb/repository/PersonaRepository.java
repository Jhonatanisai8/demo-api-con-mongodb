package com.isai.demo_api_con_mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.isai.demo_api_con_mongodb.models.Persona;

@Repository
public interface PersonaRepository
        extends MongoRepository<Persona, String> {

}
