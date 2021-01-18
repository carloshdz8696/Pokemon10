package com.capgeminiproyect.Pokedex.repository;

import com.capgeminiproyect.Pokedex.persistense.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
