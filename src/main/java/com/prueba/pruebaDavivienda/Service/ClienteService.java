package com.prueba.pruebaDavivienda.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.pruebaDavivienda.DataAcces.ClienteRepository;
import com.prueba.pruebaDavivienda.Entity.Persona;
import java.util.Optional;
@Service
public class ClienteService {
@Autowired
    private ClienteRepository clienteRepository;

    public Persona crearCliente(Persona persona) {
        return clienteRepository.save(persona);
    }

    public List<Persona> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }
    public Optional<Persona> obtenerClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Persona actualizarPersona(Persona persona) {
        Optional<Persona> existente = clienteRepository.findById(persona.getIdPersona());
        if (existente.isPresent()) {
            return clienteRepository.save(persona);
        } else {
            throw new RuntimeException("Persona no encontrada");
        }
    }
}
