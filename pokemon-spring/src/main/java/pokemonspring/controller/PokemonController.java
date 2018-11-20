package pokemonspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pokemonspring.model.dao.AttackRepository;
import pokemonspring.model.dao.PokemonRepository;
import pokemonspring.model.dao.TypeRepository;
import pokemonspring.model.dto.Pokemon;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokedex")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Autowired
    private AttackRepository attackRepository;

    @Autowired
    private TypeRepository typeRepository;

    //Get list of all pokemons
    @CrossOrigin
    @GetMapping("/list")
    public List<Pokemon> listPokemons(){
        return pokemonRepository.findAll();
    }

    //Display a chosen pokemon
    @CrossOrigin
    @GetMapping("/pokemon/{id}")
    public Optional<Pokemon> displayPokemon(@PathVariable(value = "id") Long pId){
        return pokemonRepository.findById(pId);
    }

}
