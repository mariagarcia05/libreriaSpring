package org.example.spring.AppCasa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Casa {
    private String color;
    private int numPlantas;
    private String material;

    @Autowired
    private Habitacion habitacion;

    public Casa(){
        this.color="rosa";
        this.numPlantas=3;
        this.material="cemento";
    }

    public Casa(String color, int numPlantas, String material) {
        this.color = color;
        this.numPlantas = numPlantas;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "color='" + color + '\'' +
                ", numPlantas=" + numPlantas +
                ", material='" + material + '\'' +
                ", habitacion=" + habitacion +
                '}';
    }
}
