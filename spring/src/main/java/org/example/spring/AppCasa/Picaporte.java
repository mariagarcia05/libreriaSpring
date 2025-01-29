package org.example.spring.AppCasa;

import org.springframework.stereotype.Component;

@Component
public class Picaporte {
    private String material;
    private String color;

    public Picaporte() {
        this.material="plastico";
        this.color="blanco";
    }

    public Picaporte(String material, String color) {
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
        return "Picaporte{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
