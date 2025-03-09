package io.github.isadorabello.arquiteturaspring.todos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // não necessário no JPA pois ao extender JpaRepository, já sera mapeado pelo container
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

    //

}
