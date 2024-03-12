package com.example.projeto.dtos;

import org.hibernate.validator.constraints.Length;

import com.example.projeto.model.UserModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;


@Getter
public class UserDTO{
    private Integer id;

    @NotBlank(message = "Nome nao pode ser em branco")
    @NotEmpty(message = "Nome nao pode ser em branco")
    @Length(min = 10, max = 225, message = "Nome deve ter entre 10 e 225 caracteres")
    private String nome;

    @NotEmpty(message = "Nome nao pode ser em branco")
    @NotBlank(message = "Nome nao pode ser em branco")
    @Length(min = 4, max = 10, message = "Senha deve ter entre 4 a 10")
    private String senha;

    public UserDTO(){}

    public UserModel transformaParaObjeto(){
        return new UserModel(nome, senha);
    }
}