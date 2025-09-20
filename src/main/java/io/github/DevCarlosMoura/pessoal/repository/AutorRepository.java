package io.github.DevCarlosMoura.pessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.DevCarlosMoura.pessoal.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
