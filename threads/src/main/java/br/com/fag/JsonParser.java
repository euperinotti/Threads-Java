package br.com.fag;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import br.com.fag.adapter.Enterprise;

public class JsonParser {

  public Enterprise parse() throws FileNotFoundException {
    JsonReader reader = new JsonReader(new FileReader("./data/data1.json"));
    Gson gson = new Gson();
    ArrayList<Enterprise> lista = gson.fromJson(reader, Enterprise.class);

    return null;
  }
  
}