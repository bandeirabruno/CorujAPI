package org.faeterj.apicoruja.coruja.controller;

import org.faeterj.apicoruja.coruja.controller.requestBody.DisciplinaRequestBody;
import org.faeterj.apicoruja.coruja.model.entity.Disciplina;
import org.faeterj.apicoruja.coruja.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Marcos Felipe on 19/07/17.
 */

@RestController
public class DisciplinaController {

    private DisciplinaService disciplinaService;

    @Autowired
    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

    @RequestMapping(value="/disciplina", method = RequestMethod.GET)
    public List<Disciplina> listarDisciplinas() {
        return disciplinaService.obterDisciplinas();
    }

    @RequestMapping(value="/disciplina", method = RequestMethod.POST)
    public Disciplina adicionarDisciplina(@RequestBody DisciplinaRequestBody requestBody) {
        return disciplinaService.adicionarDisciplina(requestBody.getNome(), requestBody.getCargaHoraria(), requestBody.getDescricao(), requestBody.getSigla());
    }

    public void removerDisciplina() {

    }

    @RequestMapping(value="/disciplina/{sigla}", method = RequestMethod.GET)
    public void obterDisciplina(@PathVariable String sigla) {
        disciplinaService.obterDisciplina(sigla);
    }

}
