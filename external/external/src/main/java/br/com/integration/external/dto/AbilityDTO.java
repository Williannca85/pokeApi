package br.com.integration.external.dto;

import lombok.Data;

@Data
public class AbilityDTO {

    private boolean is_hidden;
    private int slot;
    //objeto
    private AbilityDescriptionDTO ability;
}
