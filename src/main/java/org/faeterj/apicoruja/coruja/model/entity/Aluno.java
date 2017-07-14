package org.faeterj.apicoruja.coruja.model.entity;

import org.faeterj.apicoruja.coruja.model.entity.Pessoa;
import org.faeterj.apicoruja.coruja.model.entity.Historico;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="aluno")
public class Aluno extends Pessoa {

  @Id
  @Column(name="aluno_id")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id;

  @OneToOne(optional=false)
  @JoinColumn(name = "historico", referencedColumnName="historico_id") 
  private Historico historico;

  @Column(name="matricula", unique=true)
  private String matricula;

  // =======================================

  public Aluno ( ) {

  }

  public Aluno (long id, Historico historico, String matricula) {
    this.id        = id;
    this.historico = historico;
    this.matricula = matricula;
  }

  // ==============================

  public void setId (long id) {
    this.id = id;
  }

  public long getId ( ) {
    return id;
  }

  // ---------------------------------------------

  public void setMatricula (String matricula) {
    this.matricula = matricula;
  }

  public String getMatricula ( ) {
    return matricula;
  }

  // ------------------------------------

  public Historico getHistorico ( ) {
    return historico;
  }

  public void setHistorico (Historico historico) {
    this.historico = historico;
  }

}

// OK
