package br.com.fag.adapter.save;

public class FilialResult {
  private String mes;
  private Long totalVendas;
  private Long totalLucro;
  private Long totalGastos;
  private Float porcentagemLucro;
  private Float porcentagemGastos;
  private Long imposto;
  private Long aluguel;
  private Long seguro;
  private Long comissaoDeVendedor;

  public FilialResult() {
  }

  public FilialResult(String mes, Long totalVendas, Long totalLucro, Long totalGastos, Float porcentagemLucro, Float porcentagemGastos) {
    this.mes = mes;
    this.totalVendas = totalVendas;
    this.totalLucro = totalLucro;
    this.totalGastos = totalGastos;
    this.porcentagemLucro = porcentagemLucro;
    this.porcentagemGastos = porcentagemGastos;
  }

  public String getMes() {
    return this.mes;
  }

  public void setMes(String mes) {
    this.mes = mes;
  }

  public Long getTotalVendas() {
    return this.totalVendas;
  }

  public void setTotalVendas(Long totalVendas) {
    this.totalVendas = totalVendas;
  }

  public Long getTotalLucro() {
    return this.totalLucro;
  }

  public void setTotalLucro(Long totalLucro) {
    this.totalLucro = totalLucro;
  }

  public Long getTotalGastos() {
    return this.totalGastos;
  }

  public void setTotalGastos(Long totalGastos) {
    this.totalGastos = totalGastos;
  }

  public Float getPorcentagemLucro() {
    return this.porcentagemLucro;
  }

  public void setPorcentagemLucro(Float porcentagemLucro) {
    this.porcentagemLucro = porcentagemLucro;
  }

  public Float getPorcentagemGastos() {
    return this.porcentagemGastos;
  }

  public void setPorcentagemGastos(Float porcentagemGastos) {
    this.porcentagemGastos = porcentagemGastos;
  }

  public Long getImposto() {
    return this.imposto;
  }

  public void setImposto(Long imposto) {
    this.imposto = imposto;
  }

  public Long getAluguel() {
    return this.aluguel;
  }

  public void setAluguel(Long aluguel) {
    this.aluguel = aluguel;
  }

  public Long getSeguro() {
    return this.seguro;
  }

  public void setSeguro(Long seguro) {
    this.seguro = seguro;
  }

  public Long getComissaoDeVendedor() {
    return this.comissaoDeVendedor;
  }

  public void setComissaoDeVendedor(Long comissaoDeVendedor) {
    this.comissaoDeVendedor = comissaoDeVendedor;
  }

  @Override
  public String toString() {
    return "{" +
      " mes='" + getMes() + "'" +
      ", totalVendas='" + getTotalVendas() + "'" +
      ", totalLucro='" + getTotalLucro() + "'" +
      ", totalGastos='" + getTotalGastos() + "'" +
      ", porcentagemLucro='" + getPorcentagemLucro() + "'" +
      ", porcentagemGastos='" + getPorcentagemGastos() + "'" +
      ", imposto='" + getImposto() + "'" +
      ", aluguel='" + getAluguel() + "'" +
      ", seguro='" + getSeguro() + "'" +
      ", comissaoDeVendedor='" + getComissaoDeVendedor() + "'" +
      "}";
  }

}
