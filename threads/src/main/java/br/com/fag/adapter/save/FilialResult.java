package br.com.fag.adapter.save;

public class FilialResult {
  private String mes;
  private Float totalVendas;
  private Float totalLucro;
  private Float totalGastos;
  private Float porcentagemLucro;
  private Float porcentagemGastos;

  public FilialResult() {
  }

  public FilialResult(String mes, Float totalVendas, Float totalLucro, Float totalGastos, Float porcentagemLucro, Float porcentagemGastos) {
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

  public Float getTotalVendas() {
    return this.totalVendas;
  }

  public void setTotalVendas(Float totalVendas) {
    this.totalVendas = totalVendas;
  }

  public Float getTotalLucro() {
    return this.totalLucro;
  }

  public void setTotalLucro(Float totalLucro) {
    this.totalLucro = totalLucro;
  }

  public Float getTotalGastos() {
    return this.totalGastos;
  }

  public void setTotalGastos(Float totalGastos) {
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

}
