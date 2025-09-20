package io.github.DevCarlosMoura.pessoal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.DevCarlosMoura.pessoal.model.Autor;
import io.github.DevCarlosMoura.pessoal.repository.AutorRepository;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping
    public List<Autor> listarTodos() {
        return autorRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Autor> adicionar(@RequestBody Autor novoAutor) {
        Autor autorSalvo = autorRepository.save(novoAutor);
        return new ResponseEntity<>(autorSalvo, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> obterPorId(@PathVariable Long id) {
        Optional<Autor> autor = autorRepository.findById(id);

        if (autor.isPresent()) {
            return ResponseEntity.ok(autor.get());
        } 
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!autorRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } 
        autorRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}