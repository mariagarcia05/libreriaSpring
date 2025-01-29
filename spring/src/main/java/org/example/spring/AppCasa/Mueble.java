package org.example.spring.AppCasa;

import org.springframework.stereotype.Component;

@Component
public class Mueble {
    private String material;
    private String color;

    public Mueble() {
        this.material = "madera";
        this.color = "marron";
    }

    public Mueble(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Mueble{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
