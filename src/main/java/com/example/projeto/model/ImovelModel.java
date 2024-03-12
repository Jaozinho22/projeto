package com.example.projeto.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="imoveis")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImovelModel implements Serializable{
    private static final long serialVersionUID = 1L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    private Integer quartos;

    private Integer vagas;

    public ImovelModel(String descricao, Integer quartos, Integer vagas)
    {
        super();
        this.descricao = descricao;
        
        this.quartos = quartos;

        this.vagas = vagas;
    }

}
