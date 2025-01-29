package org.example.spring.AppCasa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Habitacion {
    private int id;
    private String color;

   @Autowired
    private Mueble mueble;
    @Autowired
    private Puerta puerta;
    @Autowired
    private Ventana ventana;

    public Habitacion(){
        this.id=1;
        this.color="blanco";
    }

    public Habitacion(int id, String color) {
        this.id = id;
        this.color = color;
    }

    public Mueble getMueble() {
        return mueble;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", mueble=" + mueble +
                ", puerta=" + puerta +
                ", ventana=" + ventana +
                '}';
    }
}
