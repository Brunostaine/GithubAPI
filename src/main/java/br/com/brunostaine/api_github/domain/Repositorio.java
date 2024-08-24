package br.com.brunostaine.api_github.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Repositorio {

    private String name;

    private String language;

    @JsonProperty("private")
    private boolean isPrivate; // Como PRIVATE é uma palavra reservada do java precisei contornar dessa forma

    public boolean isPrivate() {
        return isPrivate;
    }
}
