package br.com.fag;

import java.io.FileNotFoundException;

import br.com.fag.adapter.receive.Enterprise;

public class JsonParserTest {

  public static void main() throws FileNotFoundException {
    JsonParser jsonParser = new JsonParser("data1.json");
    Enterprise[] empresas = jsonParser.parse();
    System.out.println(empresas[0].toString());
  }
  
}