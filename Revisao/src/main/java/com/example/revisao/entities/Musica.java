package com.example.revisao.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Musica")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private LocalDate dataLancamento;
    private String cantor;

    public Musica() {
    }

    public Musica( String titulo, LocalDate dataLancamento, String cantor) {
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.cantor = cantor;
    }

    public Musica(long id, String titulo, LocalDate dataLancamento, String cantor) {
        this.id = id;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.cantor = cantor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
}
