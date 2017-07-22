package org.faeterj.apicoruja.coruja.model.repository;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.faeterj.apicoruja.coruja.model.entity.Professor;

public interface ProfessorRepository extends
    PagingAndSortingRepository<Professor, Long> {

         Professor  findByMatricula (String matricula);
    List<Professor> findByNome      (String nome);
    List<Professor> findByEndereco  (String endereco);
    List<Professor> findByTelefone  (String telefone);
    List<Professor> findBySexo      (char   sexo);

}

// OK
