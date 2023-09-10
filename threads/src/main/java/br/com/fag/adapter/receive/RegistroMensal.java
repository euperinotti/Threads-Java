package br.com.fag.adapter.receive;

public class RegistroMensal {
  private String mes;
  private Float totalDeVendas;
  private Float gasto;

  public RegistroMensal() {
  }

  public RegistroMensal(String mes, Float totalDeVendas, Float gasto) {
    this.mes = mes;
    this.totalDeVendas = totalDeVendas;
    this.gasto = gasto;
  }

  public String getMes() {
    return this.mes;
  }

  public void setMes(String mes) {
    this.mes = mes;
  }

  public Float getTotalDeVendas() {
    return this.totalDeVendas;
  }

  public void setTotalDeVendas(Float totalDeVendas) {
    this.totalDeVendas = totalDeVendas;
  }

  public Float getGasto() {
    return this.gasto;
  }

  public void setGasto(Float gasto) {
    this.gasto = gasto;
  }

  @Override
  public String toString() {
    return "{" +
      " mes='" + getMes() + "'" +
      ", totalDeVendas='" + getTotalDeVendas() + "'" +
      ", gasto='" + getGasto() + "'" +
      "}";
  }

}
