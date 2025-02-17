package br.com.brunostaine.api_github.client;

import br.com.brunostaine.api_github.domain.Repositorio;
import br.com.brunostaine.api_github.domain.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "api-github", url = "https://api.github.com")
public interface GithubClient {

    @RequestMapping(method = RequestMethod.GET, path = "/users/{usuario}")
    Usuario obterUsuario(@PathVariable String usuario);

    @RequestMapping(method = RequestMethod.GET, path = "/users/{usuario}/repos")
    List<Repositorio> obterRepositorios(@PathVariable String usuario);
}
