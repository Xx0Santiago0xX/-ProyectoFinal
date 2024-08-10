package tech.cybersys.videojuego_javafx.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import tech.cybersys.videojuego_javafx.modelo.Builder.PersonajeBuilder;
import tech.cybersys.videojuego_javafx.modelo.Personaje;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAO;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAOImpl;

import java.io.IOException;

import static tech.cybersys.videojuego_javafx.controlador.ControladorVentanas.mostrarVentana;

public class ControladorCreacionPersonaje {

    @FXML private TabPane TablaPestanas;
    @FXML private TextArea CampoHistoria;
    @FXML private TextField CampoNombre;
    @FXML private Label EtiquetaErrorNombre;
    @FXML private TextField CampoSalud;
    @FXML private TextField CampoFuerza;
    @FXML private TextField CampoInteligencia;
    @FXML private TextField CampoDinero;
    @FXML private Button BotonCrearPersonaje;

    Personaje PersonajeGuardado;

    @FXML
    public void MostrarAtributosComerciante() throws IOException {
        String historia = "Un astuto comerciante, nacido en el bullicioso puerto de Marvella. " +
                "Desde joven, aprendió el arte del trueque y la negociación de su padre, un renombrado mercader. " +
                "Con un ojo agudo para los tesoros y una lengua de plata, él viaja por tierras lejanas en busca de " +
                "objetos raros y valiosos. Su tienda es conocida por tener los artículos más exóticos y útiles, " +
                "desde pociones mágicas hasta armas legendarias. Aunque su apariencia es modesta, su conocimiento " +
                "y recursos son invaluables para cualquier aventurero que cruce su camino.";

        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje comerciante = new Personaje.Builder()
                    .setClase("Comerciante")
                    .setFuerza("50")
                    .setHistoria(historia)
                    .setInteligencia("55")
                    .setSalud("200")
                    .setNombre("Carlos")
                    .setDinero("1000")
                    .build();
            PersonajeGuardado = comerciante;

            CampoHistoria.setText(comerciante.getHistoria());
            CampoSalud.setText(comerciante.getSalud());
            CampoFuerza.setText(comerciante.getFuerza());
            CampoDinero.setText(comerciante.getDinero());
            CampoInteligencia.setText(comerciante.getInteligencia());
        }
    }

    @FXML
    public void MostrarAtributosSoldado() throws IOException {

        String historia = "Un valiente soldado, nacido en un pequeño pueblo y entrenado desde la infancia en el arte de la guerra. " +
                "Con una determinación inquebrantable y una lealtad feroz, ha servido en muchas batallas a lo largo de su vida. " +
                "Su habilidad con la espada es legendaria, y su armadura, aunque desgastada por el tiempo, es un símbolo de su " +
                "invencible espíritu guerrero. Siempre en la primera línea del combate, su presencia infunde valor a sus aliados y " +
                "miedo a sus enemigos.";

        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje Soldado = new Personaje.Builder()
                    .setClase("Soldado")
                    .setFuerza("90")
                    .setHistoria(historia)
                    .setInteligencia("40")
                    .setSalud("300")
                    .setNombre("Alejandro")
                    .setDinero("500")
                    .build();
            PersonajeGuardado = Soldado;

            CampoHistoria.setText(Soldado.getHistoria());
            CampoSalud.setText(Soldado.getSalud());
            CampoFuerza.setText(Soldado.getFuerza());
            CampoDinero.setText(Soldado.getDinero());
            CampoInteligencia.setText(Soldado.getInteligencia());
        }
    }

    @FXML
    public void MostrarAtributosAgricultor() throws IOException {

        String historia = "Un agricultor diligente, nacido y criado en las fértiles tierras del valle de Verdalia. " +
                "Desde joven, trabajó la tierra junto a su familia, aprendiendo los secretos del cultivo y la cría de animales. " +
                "Con una profunda conexión con la naturaleza, su conocimiento de las plantas y el suelo es insuperable. " +
                "Pasa sus días cuidando sus campos, asegurando que sus cultivos crezcan fuertes y saludables. Aunque su " +
                "vida es sencilla, su experiencia en el manejo de la tierra y su habilidad para sobrevivir en la naturaleza " +
                "lo convierten en un aliado valioso para cualquier grupo de aventureros.";

        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje agricultor = new Personaje.Builder()
                    .setClase("Agricultor")
                    .setFuerza("60")
                    .setHistoria(historia)
                    .setInteligencia("70")
                    .setSalud("250")
                    .setNombre("Luis")
                    .setDinero("300")
                    .build();
            PersonajeGuardado = agricultor;

            CampoHistoria.setText(agricultor.getHistoria());
            CampoSalud.setText(agricultor.getSalud());
            CampoFuerza.setText(agricultor.getFuerza());
            CampoDinero.setText(agricultor.getDinero());
            CampoInteligencia.setText(agricultor.getInteligencia());
        }
    }

    @FXML
    public void CrearPersonaje(ActionEvent event) throws IOException {
        PersonajeDAO personajeDAO = new PersonajeDAOImpl();
        personajeDAO.guardarPersonaje(PersonajeGuardado);
        mostrarVentana(event, null, "Juego-view.fxml", "Pantalla de Juego");
    }

    @FXML
    public void CargarPersonaje(String nombre) throws IOException {
        Personaje personaje1;
        PersonajeDAO personajedao = new PersonajeDAOImpl();
        personaje1 = personajedao.cargarPersonaje(nombre);
    }
}
