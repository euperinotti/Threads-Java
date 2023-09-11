package br.com.fag;

import java.io.FileNotFoundException;

public class WithThreads extends Thread {

  private String filename;

  public WithThreads(String filename) {
    this.filename = filename;
  }

  @Override
  public void run() {
    long inicio = System.currentTimeMillis();
    JsonParser jsonData = new JsonParser(this.filename);
    Calculate calc = new Calculate();
    DataSaverWithThreads saveJson;

    try {
      saveJson = new DataSaverWithThreads(calc.calculate(jsonData.parse()));
      saveJson.start();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    long fim = System.currentTimeMillis();

    System.out.println("(th) duracao: " + (fim - inicio) + "ms");
  }
}
