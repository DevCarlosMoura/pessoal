package io.github.DevCarlosMoura.pessoal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "livros")
@Getter
@Setter
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=200, nullable = false)
    private String titulo;

    @Column(name="ano_publicacao")
    private Integer anoPublicacao;

    @ManyToOne
    @JoinColumn(name="autor_id", nullable = false)
    private Autor autor;
}
