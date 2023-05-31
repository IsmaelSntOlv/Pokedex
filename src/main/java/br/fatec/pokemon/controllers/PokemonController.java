package br.fatec.pokemon.controllers;
import java.util.List;
import java.util.ArrayList;

import br.fatec.pokemon.models.Pokemon;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pokemon")
public class PokemonController {
    private static final List<Pokemon> _pokemon = new ArrayList<Pokemon>();

    public PokemonController(){
        //(int id, String name, String type, String subtype, String evolveId
        _pokemon.add(new Pokemon(1, "Bulbasaur", "Grass", "Poison","Ivysaur","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png"));
        _pokemon.add(new Pokemon(2, "Ivysaur", "Grass", "Poison","Venusaur","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/002.png"));
        _pokemon.add(new Pokemon(3, "Venusaur", "Grass", "Poison","","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/003.png"));
        _pokemon.add(new Pokemon(4, "Charmandar", "Fire", "","Charmeleon","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png"));
        _pokemon.add(new Pokemon(5, "Charmeleon", "Fire", "","Charizard","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/005.png"));
        _pokemon.add(new Pokemon(6, "Charizard", "Fire", "Flying","","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/006.png"));
        _pokemon.add(new Pokemon(7, "Squirtly", "Water", "","Wartotle","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/007.png"));
        _pokemon.add(new Pokemon(8, "Wartotle", "Water", "","Blastoise","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/008.png"));
        _pokemon.add(new Pokemon(9, "Blastoise", "Water", "","","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/009.png"));
    }

    @GetMapping
    public String getPokemon (Model model){
        model.addAttribute("Pokemon", _pokemon);
        return "Pokemon";
    }

    @GetMapping("PokeApi")
    public String getPokedexApi(Model model){
        model.addAttribute("Pokemon", _pokemon);
        return "PokeApi";
    }

}
