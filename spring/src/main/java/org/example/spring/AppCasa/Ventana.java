package org.example.spring.AppCasa;

import org.springframework.stereotype.Component;

@Component
public class Ventana {
    private String color;
    private String material;

    public Ventana() {
        this.color="gris";
        this.material="cristal";
    }

    public Ventana(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return "Ventana{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
