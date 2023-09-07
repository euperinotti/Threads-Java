package br.com.fag;

import br.com.fag.adapter.Enterprise;
import br.com.fag.adapter.Filial;

public class Calculate {

  public Float calculate(Enterprise[] listaEmpresas) {
    Float result = 0f;
    for (Enterprise empresa : listaEmpresas) {
      for (Filial filial : empresa.getFiliais()) {
        result += filial.getVendaMensal();
      }
    }
    
    return result;
  }
  
}
