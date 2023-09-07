package br.com.fag;

import java.io.FileNotFoundException;

import br.com.fag.adapter.Enterprise;
import br.com.fag.adapter.Filial;

public class CalculateTest {
  public static void main(String[] args) throws FileNotFoundException {
    Float result = 0f;
    Enterprise[] listaEmpresas = new JsonParser("data1.json").parse();
    for (Enterprise empresa : listaEmpresas) {
      for (Filial filial : empresa.getFiliais()) {
        result += filial.getVendaMensal();
      }
    }

    System.out.println(result);
  }
}
