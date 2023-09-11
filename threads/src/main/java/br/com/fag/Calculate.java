package br.com.fag;

import java.util.ArrayList;

import br.com.fag.adapter.receive.Enterprise;
import br.com.fag.adapter.receive.Filial;
import br.com.fag.adapter.receive.RegistroMensal;
import br.com.fag.adapter.save.EnterpriseResult;
import br.com.fag.adapter.save.FilialQueMaisGastou;
import br.com.fag.adapter.save.FilialQueMaisVendeu;
import br.com.fag.adapter.save.FilialResult;
import br.com.fag.enums.EnumDespesas;

public class Calculate {

  public ArrayList<EnterpriseResult> calculate(Enterprise[] listaEmpresas) {
    EnterpriseResult relatorioEmpresa = new EnterpriseResult();
    ArrayList<FilialResult> relatorioFiliais = new ArrayList<>();
    ArrayList<EnterpriseResult> relatorioTotal = new ArrayList<>();

    for (Enterprise empresa : listaEmpresas) {
      relatorioFiliais = calculaMesFilial(empresa);
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

  public ArrayList<FilialResult> calculaMesFilial(Enterprise empresa) {
    ArrayList<FilialResult> resultados = new ArrayList<>();
    for (Filial filial : empresa.getFiliais()) {
      for (RegistroMensal registro : filial.getHistoricoDeVendas()) {
        FilialResult filialResult = new FilialResult();
        filialResult.setTotalVendas(registro.getTotalDeVendas());
        filialResult.setTotalGastos(registro.getGasto());
        filialResult.setMes(registro.getMes());
        filialResult.setPorcentagemGastos((float) (registro.getTotalDeVendas() * registro.getGasto()) % 100);
        filialResult.setAluguel((long) (EnumDespesas.ALUGUEL.getPorcentagem() * registro.getTotalDeVendas()));
        filialResult.setSeguro((long) (EnumDespesas.SEGURO.getPorcentagem() * registro.getTotalDeVendas()));
        filialResult.setImposto((long) (EnumDespesas.IMPOSTO.getPorcentagem() * registro.getTotalDeVendas()));
        filialResult.setTotalLucro(registro.getTotalDeVendas() - registro.getGasto());
        
        filialResult.setPorcentagemLucro((float) (registro.getTotalDeVendas() * filialResult.getTotalLucro()) % 100);
        resultados.add(filialResult);
      }
    }

    return resultados;
  }

  public FilialQueMaisVendeu calculaFilialQueMaisVendeu(Enterprise empresa) {
    FilialQueMaisVendeu filialQueMaisVendeu = new FilialQueMaisVendeu();
    Long maiorVenda = (long) 0;
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
    Long maiorGasto = (long) 0;
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

  public Long calculaTotalLucroDaEmpresa(Enterprise empresa) {
    Long totalLucro = (long) 0;
    for (Filial filial : empresa.getFiliais()) {
      for (RegistroMensal registro : filial.getHistoricoDeVendas()) {
        totalLucro += (registro.getTotalDeVendas() - registro.getGasto());
      }
    }

    return totalLucro;
  }

  public Long calculaTotalGastoDaEmpresa(Enterprise empresa) {
    Long totalGastos = (long) 0;
    for (Filial filial : empresa.getFiliais()) {
      for (RegistroMensal registro : filial.getHistoricoDeVendas()) {
        totalGastos += registro.getGasto();
      }
    }

    return totalGastos;
  }

  public Long calculaTotalVendaDaEmpresa(Enterprise empresa) {
    Long totalVenda = (long) 0;
    for (Filial filial : empresa.getFiliais()) {
      for (RegistroMensal registro : filial.getHistoricoDeVendas()) {
        totalVenda += registro.getTotalDeVendas();
      }
    }

    return totalVenda;
  }
}
