package br.com.brunostaine.api_github.domain;

import lombok.Data;

@Data
public class Usuario {

    private String name;
    private String login;
    private Long id;
    private String avatar_url;
    private String location;
    private Integer public_repos;
    private String bio;
}
