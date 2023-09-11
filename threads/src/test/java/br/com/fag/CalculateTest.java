package br.com.fag;

import java.io.FileNotFoundException;

import br.com.fag.adapter.receive.Enterprise;

public class CalculateTest {
  // public static void main() throws FileNotFoundException {
  //   ArrayList<FilialResult> novosRegistros = new ArrayList<>();
  //   ArrayList<EnterpriseResult> novasEmpresas = new ArrayList<>();
  //   Float totalGasto = 0f;
  //   Float totalVenda = 0f;
  //   Float totalLucro = 0f;
  //   Enterprise[] listaEmpresas = new JsonParser("data1.json").parse();
  //   for (Enterprise empresa : listaEmpresas) {
  //     for (Filial filial : empresa.getFiliais()) {
  //       for(RegistroMensal registro : filial.getHistoricoDeVendas()) {
  //         FilialResult filialResult = new FilialResult();
  //         filialResult.setTotalVendas(registro.getTotalDeVendas());
  //         filialResult.setTotalGastos(registro.getGasto());
  //         filialResult.setMes(registro.getMes());
  //         filialResult.setPorcentagemGastos((registro.getTotalDeVendas() * registro.getGasto()) / 100);
  //         filialResult.setTotalLucro(registro.getTotalDeVendas() - registro.getGasto());
  //         filialResult.setPorcentagemLucro((registro.getTotalDeVendas() * filialResult.getTotalLucro()) / 100);
  //         novosRegistros.add(filialResult);
  //         totalGasto += registro.getGasto();
  //         totalVenda += registro.getTotalDeVendas();
  //         totalLucro += (registro.getTotalDeVendas() - registro.getGasto());
  //       }
  //     }
  //     EnterpriseResult empresaResult = new EnterpriseResult();
  //     empresaResult.setTotalGastos(totalGasto);
  //     empresaResult.setTotalLucro(totalLucro);
  //     empresaResult.setTotalVendas(totalVenda);
  //     empresaResult.setNome(empresa.getNome());
  //     empresaResult.setFilias(novosRegistros);

  //     novasEmpresas.add(empresaResult);
  //   }

  //   System.out.println(novasEmpresas.toString());
  // }

  // // Calcula relatorio de cada mes de uma filial
  // public static void mainn() throws FileNotFoundException {
  //   ArrayList<FilialResult> novosRegistros = new ArrayList<>();
  //   Enterprise[] listaEmpresas = new JsonParser("data1.json").parse();
  //   for (Enterprise empresa : listaEmpresas) {
  //     for (Filial filial : empresa.getFiliais()) {
  //       for(RegistroMensal registro : filial.getHistoricoDeVendas()) {
  //         FilialResult filialResult = new FilialResult();
  //         filialResult.setTotalVendas(registro.getTotalDeVendas());
  //         filialResult.setTotalGastos(registro.getGasto());
  //         filialResult.setMes(registro.getMes());
  //         filialResult.setPorcentagemGastos((registro.getTotalDeVendas() * registro.getGasto()) / 100);
  //         filialResult.setTotalLucro(registro.getTotalDeVendas() - registro.getGasto());
  //         filialResult.setPorcentagemLucro((registro.getTotalDeVendas() * filialResult.getTotalLucro()) / 100);
  //         novosRegistros.add(filialResult);
  //       }
  //     }
  //   }

  //   System.out.println(novosRegistros);

  // }

  // Capturar a filial que mais vendeu
  public static void main(String[] args) throws FileNotFoundException {
    Enterprise[] listaEmpresas = new JsonParser("data1.json").parse();
    Calculate calculadora = new Calculate();

    System.out.println(calculadora.calculate(listaEmpresas));
  }
}
