package br.com.fag.adapter.receive;

import java.util.ArrayList;

public class Enterprise {
  private String nome;
  private ArrayList<Filial> filiais;

  public Enterprise() {
  }

  public Enterprise(String nome, ArrayList<Filial> filiais) {
    this.nome = nome;
    this.filiais = filiais;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Filial> getFiliais() {
    return this.filiais;
  }

  public void setFiliais(ArrayList<Filial> filiais) {
    this.filiais = filiais;
  }

  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", filiais='" + getFiliais() + "'" +
      "}";
  }

}
