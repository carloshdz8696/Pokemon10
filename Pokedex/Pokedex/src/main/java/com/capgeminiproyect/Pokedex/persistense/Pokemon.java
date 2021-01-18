package com.capgeminiproyect.Pokedex.persistense;
import javax.persistence.*;
@Entity
@Table(name = "datos_pokemon")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(String numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public String getEvolucionPokemon() {
        return evolucionPokemon;
    }

    public void setEvolucionPokemon(String evolucionPokemon) {
        this.evolucionPokemon = evolucionPokemon;
    }

    @Column(name = "numero_pokemon")
    private String numeroPokedex;

    @Column(name = "nombre_pokemon")
    private String nombrePokemon;

    @Column(name = "tipo_pokemon")
    private String tipoPokemon;

    @Column(name = "evolucion_pokemon")
    private String evolucionPokemon;
}























