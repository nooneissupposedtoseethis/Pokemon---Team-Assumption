package pokemonspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pokemonspring.model.dao.PokemonRepository;
import pokemonspring.model.dto.Pokemon;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokedex")
public class PokemonController {
    @Autowired
    private PokemonRepository pokemonRepository;

    //Get list of all pokemons
    @GetMapping("/list")
    public List<Pokemon> listPokemons(){
        return pokemonRepository.findAll();
    }

    //Display a chosen pokemon
    @GetMapping("/pokemon/{id}")
    public Optional<Pokemon> displayPokemon(@PathVariable(value = "id") Long pId){
        return pokemonRepository.findById(pId);
    }

}
