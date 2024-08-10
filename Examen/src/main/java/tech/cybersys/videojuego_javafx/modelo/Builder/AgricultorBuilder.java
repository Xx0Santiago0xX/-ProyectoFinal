package tech.cybersys.videojuego_javafx.modelo.Builder;

import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class AgricultorBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public AgricultorBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
        String historia = "Un agricultor diligente, nacido y criado en las fértiles tierras del valle de Verdalia. " +
                "Desde joven, trabajó la tierra junto a su familia, aprendiendo los secretos del cultivo y la cría de animales. " +
                "Con una profunda conexión con la naturaleza, su conocimiento de las plantas y el suelo es insuperable. " +
                "Pasa sus días cuidando sus campos, asegurando que sus cultivos crezcan fuertes y saludables. Aunque su " +
                "vida es sencilla, su experiencia en el manejo de la tierra y su habilidad para sobrevivir en la naturaleza " +
                "lo convierten en un aliado valioso para cualquier grupo de aventureros.";

        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("70");
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("60");
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("70");
    }

    @Override
    public void buildClase() {
        builder.setClase("Agricultor");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
