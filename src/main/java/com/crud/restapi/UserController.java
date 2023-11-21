package com.crud.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.restapi.entities.User;

import com.crud.restapi.database.RepositoryUser;

@RestController // indica que é um controlador rest
@RequestMapping("/user") // indica o caminho do endpoint
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    @Autowired // cria o objeto e Injeção de dependência
        private RepositoryUser repositoryUser;


        //metdo para consultar
        @GetMapping // indica que é um metodo get
        //retorna uma lista de usuários convertida de 
        public List<User> listar(){//retorna uma lista de usuários 
            return repositoryUser.findAll();//retorna todos os usuários
        }



        //metodo para salvar
        @PostMapping // indica que é um metodo post
        public void salvar(@RequestBody User user){//recebe um usuário e converte para json
             repositoryUser.save(user);//salva o usuário
        }



        //metodo para alterar
        @PutMapping // indica que é um metodo put
        public void alterar(@RequestBody User user){
            if(user.getId() != 0){
                repositoryUser.save(user);//salva o usuário
            }//altera o usuário
        }



        //metodo para deletar
        @DeleteMapping // indica que é um metodo delete
        public void deletar(@RequestBody User user){
            repositoryUser.delete(user);;//deleta o usuário pelo id
        }
}
