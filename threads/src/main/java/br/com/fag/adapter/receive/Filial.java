package br.com.fag.adapter.receive;

import java.util.ArrayList;

public class Filial {
  private String nome;
  private ArrayList<RegistroMensal> historicoDeVendas;

  public Filial() {
  }

  public Filial(String nome, ArrayList<RegistroMensal> historicoDeVendas) {
    this.nome = nome;
    this.historicoDeVendas = historicoDeVendas;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<RegistroMensal> getHistoricoDeVendas() {
    return this.historicoDeVendas;
  }

  public void setHistoricoDeVendas(ArrayList<RegistroMensal> historicoDeVendas) {
    this.historicoDeVendas = historicoDeVendas;
  }

  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", historicoDeVendas='" + getHistoricoDeVendas() + "'" +
      "}";
  }

}
