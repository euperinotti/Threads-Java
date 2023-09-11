package br.com.fag;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import br.com.fag.adapter.receive.Enterprise;

public class DataSaver {
  public void save(Enterprise[] listaEnterprises) {
    File newJson = new File("threads/src/main/java/br/com/fag/data/result.json");
    Gson gson = new Gson();
    FileWriter writer;
    try {
      writer = new FileWriter(newJson);
      writer.write(gson.toJson(listaEnterprises));
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
