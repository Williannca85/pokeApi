package br.com.integration.externals.client;

import br.com.integration.externals.dto.PokemonDTO;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "externalClient",url = "localhost:8080/api")
public interface ExternalClient {

    @GetMapping("/{name}")
    PokemonDTO getPokemonInformation(@PathVariable("name") String name);
}
