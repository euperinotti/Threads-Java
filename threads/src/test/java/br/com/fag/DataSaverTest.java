package br.com.fag;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import br.com.fag.adapter.receive.Enterprise;

public class DataSaverTest {
  public static void main(String[] args) throws FileNotFoundException {
    File newJson = new File("threads/src/main/java/br/com/fag/data/result.json");
    Gson gson = new Gson();
    Enterprise[] listaEmpresas = new JsonParser("data.json").parse();

    Calculate calculadora = new Calculate();

    System.out.println(calculadora.calculate(listaEmpresas));

    FileWriter writer;
    try {
      writer = new FileWriter(newJson);
      writer.write(gson.toJson(calculadora.calculate(listaEmpresas)));
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
