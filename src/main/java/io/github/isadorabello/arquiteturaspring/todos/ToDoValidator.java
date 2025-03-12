package io.github.isadorabello.arquiteturaspring.todos;


import org.springframework.stereotype.Component;

// escopo padrão de qualquer bean é singleton (instância unica de projeto que vai atender toda a apliacação) -> @Scope("singleton") (BeanDefinition.SCOPE_SINGLETON)
// @Scope("request") -> aplicação web
// @Scope(WebApplicationContext.SCOPE_SESSION)
// @Scope("session") -> aplicação web
// @Scope("application") -> aplicação web
// Lazy(false) //padrão true -> só é instanciado quando for ser utilizado
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
