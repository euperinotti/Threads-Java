package br.com.fag;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class DataSaverTest {
  public static void main(String[] args) {
    File newJson = new File("threads/src/main/java/br/com/fag/data/result.json");
    Gson gson = new Gson();
    JsonParser json = new JsonParser("data1.json");

    FileWriter writer;
    try {
      writer = new FileWriter(newJson);
      writer.write(gson.toJson(json.parse()));
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
