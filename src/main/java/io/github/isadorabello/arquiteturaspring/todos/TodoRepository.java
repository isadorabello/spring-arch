package io.github.isadorabello.arquiteturaspring.todos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // não necessário no JPA pois ao extender JpaRepository, já sera mapeado pelo container. Classes com @Repository são otimizadas para trabalhar com banco de dados
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

    // existBy -> diz se existe aquela entidade através do campo informado (campo original da entidade) -> retorna true ou false
    boolean existsByDescricao(String descricao);

    // findtBy -> encontra a entidade através do campo informado (campo original da entidade) -> retorna o objeto
    TodoEntity findByDescricao (String descricao);

}
