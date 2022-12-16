package com.danielprimo.exfinal.PerrosyPokemones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ExFinalController {
    @Autowired
    private RestTemplate restTemplate;

    private static String urlPerros = "https://dog.ceo/api/breeds/list/all";

    private static String urlPokemon="https://pokeapi.co/api/v2/pokemon";

    @GetMapping
    @RequestMapping("/pokemon/get-all")
    public List<Object> getAllPokemones() {
        //return personService.getAll();



        PokemonResponse response = restTemplate.getForObject(urlPokemon
                ,PokemonResponse.class );

        return Arrays.asList(response);

    }

    @GetMapping
    @RequestMapping("/perros/razas")
    public List<Object> getAllPerros() {
        //return personService.getAll();



        Object response = restTemplate.getForObject(urlPerros
                ,Object.class );

        return Arrays.asList(response);

    }
}
