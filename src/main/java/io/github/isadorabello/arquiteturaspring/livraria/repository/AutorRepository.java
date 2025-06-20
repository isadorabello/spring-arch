package io.github.isadorabello.arquiteturaspring.livraria.repository;

import io.github.isadorabello.arquiteturaspring.livraria.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
