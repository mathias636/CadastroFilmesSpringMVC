package br.senac.tads.dsw.filmes.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filme implements Serializable {
    
    @Id
    private Long id;

    private String titulo;
    private String genero;
    private String anoLancamento;

    public Filme() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    
}
