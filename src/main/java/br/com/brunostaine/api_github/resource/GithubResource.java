package br.com.brunostaine.api_github.resource;

import br.com.brunostaine.api_github.client.GithubClient;
import br.com.brunostaine.api_github.domain.Repositorio;
import br.com.brunostaine.api_github.domain.Usuario;
import br.com.brunostaine.api_github.dto.RepositorioResponseDTO;
import br.com.brunostaine.api_github.dto.UsuarioResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/github")
public class GithubResource {

    private final GithubClient githubClient;

    public GithubResource(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    @GetMapping("/usuario/{usuario}")
    public ResponseEntity<UsuarioResponseDTO> obterUsuario(@PathVariable String usuario){
        Usuario response = githubClient.obterUsuario(usuario);
        UsuarioResponseDTO dto = new UsuarioResponseDTO(response);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/usuario/{usuario}/repos")
    public ResponseEntity<List<RepositorioResponseDTO>> obterRepositorios(@PathVariable String usuario){
        List<Repositorio> repositorios = githubClient.obterRepositorios(usuario);
        List<RepositorioResponseDTO> lista = repositorios.stream()
                .map(RepositorioResponseDTO::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(lista);
    }
}
