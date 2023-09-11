package br.com.fag;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.google.gson.Gson;

import br.com.fag.adapter.save.EnterpriseResult;

public class DataSaver {
  public void save(ArrayList<EnterpriseResult> listaEnterprises) {
    File newJson = new File("threads/src/main/java/br/com/fag/data/" + LocalDateTime.now().toLocalDate().toString() + Math.random() + ".json");
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
