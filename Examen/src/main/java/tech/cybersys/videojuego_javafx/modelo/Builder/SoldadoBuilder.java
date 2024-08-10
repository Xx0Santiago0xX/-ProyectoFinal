package tech.cybersys.videojuego_javafx.modelo.Builder;


import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class SoldadoBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public SoldadoBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
        String historia = "Héctor nació en un pequeño pueblo agrícola," +
                " donde la vida era tranquila y sencilla. " +
                "Desde joven, mostró un gran interés por la historia y las leyendas de antiguos guerreros." +
                " Inspirado por estas historias, decidió unirse al ejército para proteger a su gente y su tierra.";


        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("100");
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("90");
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("50");
    }

    @Override
    public void buildClase() {
        builder.setClase("Soldado");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
