package org.example.spring.AppBiblioteca;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ejemplar")
public class Ejemplar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idtitulo", nullable = false)
    private org.example.spring.AppBiblioteca.Libro idtitulo;

    @Lob
    @Column(name = "estado", nullable = false)
    private String estado;

    @OneToMany(mappedBy = "ejemplarid")
    private Set<org.example.spring.AppBiblioteca.Prestamo> prestamos = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public org.example.spring.AppBiblioteca.Libro getIdtitulo() {
        return idtitulo;
    }

    public void setIdtitulo(org.example.spring.AppBiblioteca.Libro idtitulo) {
        this.idtitulo = idtitulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Set<org.example.spring.AppBiblioteca.Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<org.example.spring.AppBiblioteca.Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

}