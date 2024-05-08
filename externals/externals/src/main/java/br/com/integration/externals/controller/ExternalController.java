package br.com.integration.externals.controller;

import br.com.integration.externals.client.ExternalClient;
import br.com.integration.externals.dto.PokemonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backend")
public class ExternalController {

    @Autowired
    private ExternalClient client;

    @GetMapping("/{name}")
    public ResponseEntity<PokemonDTO> getPokemonInformation(@PathVariable("name") String name){
        return ResponseEntity.ok(client.getPokemonInformation(name));
    }

    //http://localhost:8081/backend/pikachu
}
