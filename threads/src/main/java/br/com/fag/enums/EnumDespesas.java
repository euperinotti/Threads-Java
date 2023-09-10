package br.com.fag.enums;

public enum EnumDespesas {
  IMPOSTO(35f),
  ALUGUEL(5f),
  SEGURO(5f);

  private Float porcentagem;

  EnumDespesas(Float porcentagem) {
    this.porcentagem = porcentagem;
  }

  public Float getPorcentagem() {
    return this.porcentagem;
  }
}
