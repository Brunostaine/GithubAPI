package br.com.brunostaine.api_github.dto;

import br.com.brunostaine.api_github.domain.Repositorio;
import lombok.Data;

@Data
public class RepositorioResponseDTO {

    private String nome;
    private String linguagem;
    private boolean repositorioPrivado;

    public RepositorioResponseDTO(Repositorio response) {
        this.nome = response.getName();
        this.linguagem = response.getLanguage();
        this.repositorioPrivado = response.isPrivate();
    }
}
