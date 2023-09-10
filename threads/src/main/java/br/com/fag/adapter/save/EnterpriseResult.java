package br.com.fag.adapter.save;

import java.util.ArrayList;

public class EnterpriseResult {
  private String nome;
  private Float totalVendas;
  private Float totalLucro;
  private Float totalGastos;
  private Float porcentagemLucro;
  private Float porcentagemGastos;
  private ArrayList<FilialResult> filias;

  public EnterpriseResult() {
  }

  public EnterpriseResult(String nome, Float totalVendas, Float totalLucro, Float totalGastos, Float porcentagemLucro, Float porcentagemGastos, ArrayList<FilialResult> filias) {
    this.nome = nome;
    this.totalVendas = totalVendas;
    this.totalLucro = totalLucro;
    this.totalGastos = totalGastos;
    this.porcentagemLucro = porcentagemLucro;
    this.porcentagemGastos = porcentagemGastos;
    this.filias = filias;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
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

  public ArrayList<FilialResult> getFilias() {
    return this.filias;
  }

  public void setFilias(ArrayList<FilialResult> filias) {
    this.filias = filias;
  }

}