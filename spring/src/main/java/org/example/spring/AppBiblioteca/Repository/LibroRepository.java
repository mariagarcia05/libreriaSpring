package org.example.spring.AppBiblioteca.Repository;
import org.example.spring.AppBiblioteca.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Long> {
}
