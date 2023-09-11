package br.com.fag;

import java.io.FileNotFoundException;

public class NoThreads {
  private String filename;

  public NoThreads(String filename) {
    this.filename = filename;
  }
  
  public void run() {
    long inicio = System.currentTimeMillis();
    JsonParser jsonData = new JsonParser(this.filename);
    Calculate calc = new Calculate();
    DataSaver saveJson = new DataSaver();

    try {
      saveJson.save(calc.calculate(jsonData.parse()));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    long fim = System.currentTimeMillis();
    
    System.out.println("(st) intervalo: " + (fim - inicio) + "ms");
  }
}
