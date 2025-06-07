package com.isai.demo_api_con_mongodb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isai.demo_api_con_mongodb.models.Persona;
import com.isai.demo_api_con_mongodb.service.PersonaService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "/api/v1/personas")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService personaService;

    @PostMapping(path = "/registrar")
    public void guardarPersona(@RequestBody Persona personaRequest) {
        personaService.guardarPersona(personaRequest);
    }

    @GetMapping(path = "")
    public List<Persona> listarPersonas() {
        return personaService.listarPersonas();
    }

    @GetMapping(path = "/buscar/{idRequeId}")
    public Persona buscarPersonaIDPersona(@PathVariable String idRequeId) {
        return personaService.buscarPorId(idRequeId)
                .orElseThrow();
    }

    @DeleteMapping(path = "/eliminar/{idRequeId}")
    public void eliminarPorId(@PathVariable String idRequeId) {
        personaService.eliminarPorId(idRequeId);
    }

    @PutMapping(path = "/actualizar")
    public void actualizarPersona(@RequestBody Persona personaRequest) {
        personaService.guardarPersona(personaRequest);
    }

}
