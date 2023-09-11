package br.com.fag.adapter.save;

import java.util.ArrayList;

public class EnterpriseResult {
  private String nome;
  private Long totalVendas;
  private Long totalLucro;
  private Long totalGastos;
  private Long porcentagemLucro;
  private Long porcentagemGastos;
  private ArrayList<FilialResult> filias;
  private Long imposto;
  private Long aluguel;
  private Long seguro;
  private FilialQueMaisVendeu filialQueMaisVendeu;
  private FilialQueMaisGastou filialQueMaisGastou;

  public EnterpriseResult() {
  }

  public EnterpriseResult(String nome, Long totalVendas, Long totalLucro, Long totalGastos, Long porcentagemLucro, Long porcentagemGastos, ArrayList<FilialResult> filias) {
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

  public Long getPorcentagemLucro() {
    return this.porcentagemLucro;
  }

  public void setPorcentagemLucro(Long porcentagemLucro) {
    this.porcentagemLucro = porcentagemLucro;
  }

  public Long getPorcentagemGastos() {
    return this.porcentagemGastos;
  }

  public void setPorcentagemGastos(Long porcentagemGastos) {
    this.porcentagemGastos = porcentagemGastos;
  }

  public ArrayList<FilialResult> getFilias() {
    return this.filias;
  }

  public void setFilias(ArrayList<FilialResult> filias) {
    this.filias = filias;
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

  public FilialQueMaisVendeu getFilialQueMaisVendeu() {
    return this.filialQueMaisVendeu;
  }

  public void setFilialQueMaisVendeu(FilialQueMaisVendeu filialQueMaisVendeu) {
    this.filialQueMaisVendeu = filialQueMaisVendeu;
  }

  public FilialQueMaisGastou getFilialQueMaisGastou() {
    return this.filialQueMaisGastou;
  }

  public void setFilialQueMaisGastou(FilialQueMaisGastou filialQueMaisGastou) {
    this.filialQueMaisGastou = filialQueMaisGastou;
  }

  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", totalVendas='" + getTotalVendas() + "'" +
      ", totalLucro='" + getTotalLucro() + "'" +
      ", totalGastos='" + getTotalGastos() + "'" +
      ", porcentagemLucro='" + getPorcentagemLucro() + "'" +
      ", porcentagemGastos='" + getPorcentagemGastos() + "'" +
      ", filias='" + getFilias() + "'" +
      ", imposto='" + getImposto() + "'" +
      ", aluguel='" + getAluguel() + "'" +
      ", seguro='" + getSeguro() + "'" +
      ", filialQueMaisVendeu='" + getFilialQueMaisVendeu() + "'" +
      ", filialQueMaisGastou='" + getFilialQueMaisGastou() + "'" +
      "}";
  }

}
