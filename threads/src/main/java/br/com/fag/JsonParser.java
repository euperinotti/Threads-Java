package br.com.fag;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystems;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import br.com.fag.adapter.Enterprise;

public class JsonParser {

  private String filename;

  public JsonParser(String filename) {
    this.filename = filename;
  }

  public Enterprise[] parse() throws FileNotFoundException {
    JsonReader reader = new JsonReader(new FileReader(this.getPath()));
    Gson gson = new Gson();
    Enterprise[] lista = gson.fromJson(reader, Enterprise[].class);

    return lista;
  }

  public String getPath() {
    return FileSystems.getDefault().getPath("threads/src/main/java/br/com/fag/data/" + this.getFilename()).toAbsolutePath().toString();
  }

  public String getFilename() {
    return this.filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }
  
}