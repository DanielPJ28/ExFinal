package com.danielprimo.exfinal.PerrosyPokemones;

import lombok.Data;

import java.util.List;

@Data
public class PokemonResponse {
    private List<PokemonResponseDetail> results;
}