package br.com.fag;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import br.com.fag.adapter.Enterprise;

public class JsonParserTest {

  public static void main(String[] args) throws FileNotFoundException {
    String path = FileSystems.getDefault().getPath("threads/src/main/java/br/com/fag/data/data1.json").toAbsolutePath().toString();
    JsonReader reader = new JsonReader(new FileReader(path));
    Gson gson = new Gson();
    Enterprise[] lista = gson.fromJson(reader, Enterprise[].class);

    System.out.println(lista[0].toString());
  }
  
}