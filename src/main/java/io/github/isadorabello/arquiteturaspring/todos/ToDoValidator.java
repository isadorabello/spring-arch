package io.github.isadorabello.arquiteturaspring.todos;


import org.springframework.stereotype.Component;

@Component
public class ToDoValidator {

    private TodoRepository repository;

    public ToDoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    // exemplo-> só pode haver ToDos com descrições diferentes
    public void validar (TodoEntity todo){
        if(existeToDoComDescricao(todo.getDescricao())){
            throw new IllegalArgumentException("Já existe ToDo com está descrição!");
        }
    }

    private boolean existeToDoComDescricao (String descricao){
        return repository.existsByDescricao(descricao);
    }

}
