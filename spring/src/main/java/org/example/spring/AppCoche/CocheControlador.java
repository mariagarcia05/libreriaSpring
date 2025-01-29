package org.example.spring.AppCoche;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coches")
public class CocheControlador {
    @GetMapping("/coche")
    public ResponseEntity<Coche>obtenerCoche(){
        Coche c=new Coche("ford","utilitario","azul","diesel",90,1200);
        return ResponseEntity.ok(c);
    }

    @PostMapping("/coche")
    public ResponseEntity<Coche>ejemploPostCoche(@RequestBody Coche c){
        System.out.println(("por consola" + c));
        return ResponseEntity.ok(c);
    }
}
