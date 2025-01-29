package org.example.spring.AppBiblioteca.Service;

import org.example.spring.AppBiblioteca.Libro;
import org.example.spring.AppBiblioteca.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro>obtenerTodos(){
        return libroRepository.findAll();
    }
    public Optional<Libro>obtenerPorId(Long id){
        return libroRepository.findById(id);
    }
    public Libro guardar(Libro libro){
        return libroRepository.save(libro);
    }
    public void eliminar(Long id){
        libroRepository.deleteById(id);
    }

}
