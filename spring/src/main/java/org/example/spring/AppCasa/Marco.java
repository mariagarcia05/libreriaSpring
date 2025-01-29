package org.example.spring.AppCasa;

import org.springframework.stereotype.Component;

@Component
public class Marco {
    private String color;
    private String material;

    public Marco() {
        this.color="marron";
        this.material="madera";
    }

    public Marco(String color, String material) {
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
        return "Marco{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
