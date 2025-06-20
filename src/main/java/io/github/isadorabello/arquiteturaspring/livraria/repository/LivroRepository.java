package io.github.isadorabello.arquiteturaspring.livraria.repository;

import io.github.isadorabello.arquiteturaspring.livraria.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
