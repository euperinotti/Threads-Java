package br.com.fag.adapter;

public class Filial {
  private String nome;
  private float vendaMensal;


  public Filial() {
  }

  public Filial(String nome, float vendaMensal) {
    this.nome = nome;
    this.vendaMensal = vendaMensal;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getVendaMensal() {
    return this.vendaMensal;
  }

  public void setVendaMensal(float vendaMensal) {
    this.vendaMensal = vendaMensal;
  }

  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", vendaMensal='" + getVendaMensal() + "'" +
      "}";
  }
  
}
