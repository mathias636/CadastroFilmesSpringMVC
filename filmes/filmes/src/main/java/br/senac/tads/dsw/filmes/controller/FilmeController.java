package br.senac.tads.dsw.filmes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.tads.dsw.filmes.model.Filme;
import br.senac.tads.dsw.filmes.repository.FilmeRepository;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
    
    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping("/listar")
    public String listarFIlmes(Model model){
        model.addAttribute("filmes", filmeRepository.findAll());
        return "filmes/listar";
    }

    @GetMapping("/novo")
    public String exibirFormularioNovo(Model model){
        model.addAttribute("filme", new Filme());
        return "filmes/formulario";   
    }

    @PostMapping("/novo")
    public String salvarFilme(@ModelAttribute("filme") Filme filme){
        filmeRepository.save(filme);
        return "redirect:/filmes";
    }
}
