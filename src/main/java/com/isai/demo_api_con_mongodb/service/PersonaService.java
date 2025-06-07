package com.isai.demo_api_con_mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.isai.demo_api_con_mongodb.models.Persona;
import com.isai.demo_api_con_mongodb.repository.PersonaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonaService {
    private final PersonaRepository personaRepository;

    public void guardarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    public Optional<Persona> buscarPorId(String id) {
        return personaRepository.findById(id);
    }

    public void eliminarPorId(String id) {
        personaRepository.deleteById(id);
    }

}
