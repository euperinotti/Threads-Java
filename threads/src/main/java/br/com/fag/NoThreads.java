package br.com.fag;

import java.io.FileNotFoundException;

public class NoThreads {
  public void run() {
    long inicio = System.currentTimeMillis();
    JsonParser jsonData = new JsonParser("data.json");

        Calculate calc = new Calculate();
        DataSaver saveJson = new DataSaver();

        try {
            saveJson.save(calc.calculate(jsonData.parse()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        long fim = System.currentTimeMillis();

        System.out.println("(st) inicio: " + inicio);
        System.out.println("(st) fim: " + fim);
        System.out.println("(st) intervalo: " + (fim - inicio));
  }
}
