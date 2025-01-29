package org.example.spring.AppCasa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casa")
public class CasaControlador {
    @Autowired
    private Casa casa;

    @GetMapping
    public ResponseEntity<Casa>obtenerCasa(){
        System.out.println(casa.toString());
        return ResponseEntity.ok(casa);
    }

}
