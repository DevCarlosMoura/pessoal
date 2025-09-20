package io.github.DevCarlosMoura.pessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.DevCarlosMoura.pessoal.model.Livro;
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
