package br.com.fag.adapter.receive;

public class RegistroMensal {
  private String mes;
  private Long totalDeVendas;
  private Long gasto;

  public RegistroMensal() {
  }

  public RegistroMensal(String mes, Long totalDeVendas, Long gasto) {
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

  public Long getTotalDeVendas() {
    return this.totalDeVendas;
  }

  public void setTotalDeVendas(Long totalDeVendas) {
    this.totalDeVendas = totalDeVendas;
  }

  public Long getGasto() {
    return this.gasto;
  }

  public void setGasto(Long gasto) {
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
