package br.com.fag;

public class App {
    public static void main(String[] args) {
        NoThreads noThreads = new NoThreads();

        new Thread(new WithThreads()).start();
        
        noThreads.run();
        
    }
}
