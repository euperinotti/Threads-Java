package br.com.fag;

import java.util.ArrayList;

import br.com.fag.adapter.receive.Enterprise;
import br.com.fag.adapter.receive.Filial;
import br.com.fag.adapter.receive.RegistroMensal;
import br.com.fag.adapter.save.EnterpriseResult;
import br.com.fag.adapter.save.FilialQueMaisGastou;
import br.com.fag.adapter.save.FilialQueMaisVendeu;
import br.com.fag.adapter.save.FilialResult;

public class Calculate {

  public ArrayList<EnterpriseResult> calculate(Enterprise[] listaEmpresas) {
    EnterpriseResult relatorioEmpresa = new EnterpriseResult();
    ArrayList<FilialResult> relatorioFiliais = new ArrayList<>();
    ArrayList<EnterpriseResult> relatorioTotal = new ArrayList<>();

    for (Enterprise empresa : listaEmpresas) {
      relatorioFiliais.add(calculaMesFilial(empresa));
      relatorioEmpresa.setFilias(relatorioFiliais);
      relatorioEmpresa.setTotalGastos(this.calculaTotalGastoDaEmpresa(empresa));
      relatorioEmpresa.setTotalVendas(this.calculaTotalVendaDaEmpresa(empresa));
      relatorioEmpresa.setTotalLucro(this.calculaTotalLucroDaEmpresa(empresa));
      relatorioEmpresa.setFilialQueMaisGastou(this.calculaFilialQueMaisGastou(empresa));
      relatorioEmpresa.setFilialQueMaisVendeu(this.calculaFilialQueMaisVendeu(empresa));

      relatorioTotal.add(relatorioEmpresa);
    }
    return relatorioTotal;
  }

  public FilialResult calculaMesFilial(Enterprise empresa) {
    FilialResult filialResult = new FilialResult();
    for (Filial filial : empresa.getFiliais()) {
      for (RegistroMensal registro : filial.getHistoricoDeVendas()) {
        filialResult.setTotalVendas(registro.getTotalDeVendas());
        filialResult.setTotalGastos(registro.getGasto());
        filialResult.setMes(registro.getMes());
        filialResult.setPorcentagemGastos((registro.getTotalDeVendas() * registro.getGasto()) / 100);
        filialResult.setTotalLucro(registro.getTotalDeVendas() - registro.getGasto());
        filialResult.setPorcentagemLucro((registro.getTotalDeVendas() * filialResult.getTotalLucro()) / 100);
      }
    }

    return filialResult;
  }

  public FilialQueMaisVendeu calculaFilialQueMaisVendeu(Enterprise empresa) {
    FilialQueMaisVendeu filialQueMaisVendeu = new FilialQueMaisVendeu();
    Float maiorVenda = 0f;
    for (Filial filial : empresa.getFiliais()) {
      for (RegistroMensal registro : filial.getHistoricoDeVendas()) {

        if (registro.getTotalDeVendas() > maiorVenda) {
          filialQueMaisVendeu.setValorMensal(registro.getTotalDeVendas());
          filialQueMaisVendeu.setNome(filial.getNome());
          filialQueMaisVendeu.setMes(registro.getMes());
        }
      }
    }

    return filialQueMaisVendeu;
  }

  public FilialQueMaisGastou calculaFilialQueMaisGastou(Enterprise empresa) {
    FilialQueMaisGastou filialQueMaisGastou = new FilialQueMaisGastou();
    Float maiorGasto = 0f;
    for (Filial filial : empresa.getFiliais()) {
      for (RegistroMensal registro : filial.getHistoricoDeVendas()) {

        if (registro.getTotalDeVendas() > maiorGasto) {
          filialQueMaisGastou.setValorMensal(registro.getGasto());
          filialQueMaisGastou.setNome(filial.getNome());
          filialQueMaisGastou.setMes(registro.getMes());
        }
      }
    }

    return filialQueMaisGastou;
  }

  public Float calculaTotalLucroDaEmpresa(Enterprise empresa) {
    Float totalLucro = 0f;
    for (Filial filial : empresa.getFiliais()) {
      for (RegistroMensal registro : filial.getHistoricoDeVendas()) {
        totalLucro += (registro.getTotalDeVendas() - registro.getGasto());
      }
    }

    return totalLucro;
  }

  public Float calculaTotalGastoDaEmpresa(Enterprise empresa) {
    Float totalGastos = 0f;
    for (Filial filial : empresa.getFiliais()) {
      for (RegistroMensal registro : filial.getHistoricoDeVendas()) {
        totalGastos += registro.getGasto();
      }
    }

    return totalGastos;
  }

  public Float calculaTotalVendaDaEmpresa(Enterprise empresa) {
    Float totalVenda = 0f;
    for (Filial filial : empresa.getFiliais()) {
      for (RegistroMensal registro : filial.getHistoricoDeVendas()) {
        totalVenda += registro.getTotalDeVendas();
      }
    }

    return totalVenda;
  }
}
