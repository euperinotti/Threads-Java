package br.com.fag;

public class App {
    public static void main(String[] args) throws InterruptedException {
        NoThreads noThreads = new NoThreads("data.json");
        WithThreads thread = new WithThreads("data.json");
        
        System.out.println("Leitura sem thread");
        noThreads.run();

        System.out.println("Leitura com thread");
        new Thread(thread).start();


    }
}
