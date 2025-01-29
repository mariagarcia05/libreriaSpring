package org.example.spring.AppBiblioteca;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Entity
@Table(name = "prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "usuarioid", nullable = false)
    private org.example.spring.AppBiblioteca.Usuario usuarioid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "ejemplarid", nullable = false)
    private Ejemplar ejemplarid;

    @Column(name = "fechainicio", nullable = false)
    private LocalDate fechainicio;

    @Column(name = "fechadevolucion")
    private LocalDate fechadevolucion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public org.example.spring.AppBiblioteca.Usuario getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(org.example.spring.AppBiblioteca.Usuario usuarioid) {
        this.usuarioid = usuarioid;
    }

    public Ejemplar getEjemplarid() {
        return ejemplarid;
    }

    public void setEjemplarid(Ejemplar ejemplarid) {
        this.ejemplarid = ejemplarid;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(LocalDate fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

}