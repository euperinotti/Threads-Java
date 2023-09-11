package br.com.fag;

public class App {
    public static void main(String[] args) throws InterruptedException {
        NoThreads noThreads = new NoThreads("data.json");
        WithThreads thread = new WithThreads("data.json");
        
        new Thread(thread).start();
        noThreads.run();

    }
}
