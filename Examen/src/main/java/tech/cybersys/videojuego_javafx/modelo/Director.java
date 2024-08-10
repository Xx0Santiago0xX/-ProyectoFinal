package tech.cybersys.videojuego_javafx.modelo;

import tech.cybersys.videojuego_javafx.modelo.Builder.ComercianteBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.SoldadoBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.AgricultorBuilder;

public class Director {
    private ComercianteBuilder comercianteBuilder;
    private SoldadoBuilder soldadoBuilder;
    private AgricultorBuilder agricultorBuilder;

    public void setComercianteBuilder(ComercianteBuilder builder) {
        this.comercianteBuilder = builder;
    }

    public void setSoldadoBuilder(SoldadoBuilder builder) {
        this.soldadoBuilder = builder;
    }

    public void setAgricultorBuilder(AgricultorBuilder builder) {
        this.agricultorBuilder = builder;
    }

    public Personaje construirComerciante(String nombre) {
        comercianteBuilder.buildNombre(nombre);
        comercianteBuilder.buildSalud();
        comercianteBuilder.buildFuerza();
        comercianteBuilder.buildInteligencia();
        comercianteBuilder.buildClase();
        return comercianteBuilder.getPersonaje();
    }

    public Personaje construirSoldado(String nombre) {
        soldadoBuilder.buildNombre(nombre);
        soldadoBuilder.buildSalud();
        soldadoBuilder.buildFuerza();
        soldadoBuilder.buildInteligencia();
        soldadoBuilder.buildClase();
        return soldadoBuilder.getPersonaje();
    }

    public Personaje construirAgricultor(String nombre) {
        agricultorBuilder.buildNombre(nombre);
        agricultorBuilder.buildSalud();
        agricultorBuilder.buildFuerza();
        agricultorBuilder.buildInteligencia();
        agricultorBuilder.buildClase();
        return agricultorBuilder.getPersonaje();
    }
}
