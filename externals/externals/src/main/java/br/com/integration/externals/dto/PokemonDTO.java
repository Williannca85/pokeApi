package br.com.integration.externals.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PokemonDTO {

    private int id;
    private String name;
    private String order;
    private List<AbilityDTO> abilities;
    private String base_experience;
    //objeto
    private CriesDTO cries;

    //O DTO vai trazer os objetos do client que está sendo consumindo
}
