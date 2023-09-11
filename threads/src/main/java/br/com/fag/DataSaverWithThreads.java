package br.com.fag;

import java.util.ArrayList;

import br.com.fag.adapter.save.EnterpriseResult;

public class DataSaverWithThreads extends Thread {

  private ArrayList<EnterpriseResult> data;

  public DataSaverWithThreads(ArrayList<EnterpriseResult> data) {
    this.data = data;
  }

  @Override
  public void run() {
    DataSaver saveJson = new DataSaver();
    saveJson.save(this.data);
  }
}
