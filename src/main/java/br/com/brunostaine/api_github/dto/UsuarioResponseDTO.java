package br.com.brunostaine.api_github.dto;

import br.com.brunostaine.api_github.domain.Usuario;
import lombok.Data;

@Data
public class UsuarioResponseDTO {
    private Long id;
    private String nome;
    private String login;
    private String urlAvatar;
    private String localizacao;
    private Integer repositoriosPublicos;
    private String bio;

    public UsuarioResponseDTO(Usuario response) {
        this.id = response.getId();
        this.nome = response.getName();
        this.login = response.getLogin();
        this.urlAvatar = response.getAvatar_url();
        this.localizacao = response.getLocation();
        this.repositoriosPublicos = response.getPublic_repos();
        this.bio = response.getBio();
    }
}
