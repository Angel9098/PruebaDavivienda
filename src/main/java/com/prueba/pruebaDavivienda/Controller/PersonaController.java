package com.prueba.pruebaDavivienda.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.pruebaDavivienda.Entity.Persona;
import com.prueba.pruebaDavivienda.Service.ClienteService;
import java.util.Optional;
@RestController
@RequestMapping("/clientes")
public class PersonaController {

    @Autowired
    private ClienteService clienteService;

   
    @PostMapping
    public ResponseEntity<Persona> crearCliente(@RequestBody Persona persona) {
        Persona newCliente = clienteService.crearCliente(persona);
        return new ResponseEntity<>(newCliente, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Persona>> obtenerTodosLosClientes() {
        List<Persona> clientes = clienteService.obtenerTodosLosClientes();
        return ResponseEntity.ok(clientes);
    }
    @GetMapping("/cliente")
    public ResponseEntity<Persona> obtenerCliente(@RequestParam Long id) {
        Optional<Persona> cliente = clienteService.obtenerClientePorId(id);
        return cliente.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }
       @PutMapping("/cliente")
    public ResponseEntity<Persona> actualizarCliente(@RequestBody Persona persona) {
        Persona actualizado = clienteService.actualizarPersona(persona);
        return ResponseEntity.ok(actualizado);
    }
}
