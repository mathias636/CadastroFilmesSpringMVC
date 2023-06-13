package br.senac.tads.dsw.filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.tads.dsw.filmes.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
