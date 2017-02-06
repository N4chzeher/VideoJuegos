package com.company;

import java.time.LocalDate;

/**
 * Created by NACHZEHER on 13/12/2016.
 */
public class Videojuego {


    public Videojuego(long id, String nombre, String compañia, LocalDate fecha_lanzamiento, int n_ventas, String genero, double precio, int pegi, int numero_jugadores, String plataforma) {
        this.id = id;
        this.nombre = nombre;
        this.compañia = compañia;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.n_ventas = n_ventas;
        this.genero = genero;
        this.precio = precio;
        this.pegi = pegi;
        this.numero_jugadores = numero_jugadores;
        this.plataforma = plataforma;
    }

    private long id;
    private String nombre;
    private String compañia;
    private LocalDate fecha_lanzamiento;
    private int n_ventas;
    private String genero;
    private double precio;
    private int pegi;
    private int numero_jugadores;
    private String plataforma;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public LocalDate getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(LocalDate fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public int getN_ventas() {
        return n_ventas;
    }

    public void setN_ventas(int n_ventas) {
        this.n_ventas = n_ventas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public int getNumero_jugadores() {
        return numero_jugadores;
    }

    public void setNumero_jugadores(int numero_jugadores) {
        this.numero_jugadores = numero_jugadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }


    @Override
    public String toString() {
        return "com.company.Videojuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", compañia='" + compañia + '\'' +
                ", fecha_lanzamiento=" + fecha_lanzamiento +
                ", n_ventas=" + n_ventas +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                ", pegi=" + pegi +
                ", numero_jugadores=" + numero_jugadores +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}


