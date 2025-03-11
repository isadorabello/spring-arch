package io.github.isadorabello.arquiteturaspring.todos;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

// interface -> controller -> service (dependẽncias) -> repository -> banco de dados

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity novo){
        try {
            return this.service.salvar(novo);
        }catch (IllegalArgumentException e){
            var mensagemErro = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, mensagemErro);
        }
    }

    @PutMapping("{id}")
    public TodoEntity atualizatStatus (@PathVariable("id") Integer id, @RequestBody TodoEntity atualizado){
        atualizado.setId(id);
        return this.service.atualizarStatus(atualizado);
    }

    @GetMapping("{id}")
    public TodoEntity buscarPorId(@PathVariable("id") Integer id){
        return  this.service.buscarPorId(id);
    }
}
