package org.example.spring.AppBiblioteca.Controller;

import org.example.spring.AppBiblioteca.Libro;
import org.example.spring.AppBiblioteca.Service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;
    @GetMapping
    public List<Libro>obtenerTodos(){
        return libroService.obtenerTodos();
    }
    @GetMapping("/{id}")
    public Optional<Libro>obtenerPorId(@PathVariable Long id){
        return libroService.obtenerPorId(id);
    }
    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro){
        return libroService.guardar(libro);
    }
    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable Long id, @RequestBody Libro libro){
        return libroService.obtenerPorId(id).map(l->{
            l.setTitulo(libro.getTitulo());
            l.setAutor(libro.getAutor());
            return libroService.guardar(l);
        }).orElse(null);
    }
    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id){
        libroService.eliminar(id);
    }
}
