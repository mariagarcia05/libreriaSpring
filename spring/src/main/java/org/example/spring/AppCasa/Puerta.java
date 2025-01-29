package org.example.spring.AppCasa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Puerta {
    private String color;

    @Autowired
    private Picaporte picaporte;
    @Autowired
    private Marco marco;

    public Puerta(){
        this.color="blanco";
    }

    public Puerta(String color) {
        this.color = color;
    }

    public Puerta(Picaporte picaporte, Marco marco) {
        this.picaporte = picaporte;
        this.marco = marco;
    }

    public Picaporte getPicaporte() {
        return picaporte;
    }

    public Marco getMarco() {
        return marco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPicaporte(Picaporte picaporte) {
        this.picaporte = picaporte;
    }

    public void setMarco(Marco marco) {
        this.marco = marco;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "color='" + color + '\'' +
                ", picaporte=" + picaporte +
                ", marco=" + marco +
                '}';
    }
}
