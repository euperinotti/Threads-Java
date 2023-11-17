# Threads-Java

Este README fornece uma visão geral do conceito de threads em Java. As threads são uma parte fundamental da programação concorrente, permitindo que um programa execute várias tarefas simultaneamente. Em Java, a manipulação de threads é feita usando a API de threads fornecida pela linguagem.

## O que são Threads?

Uma thread em Java é uma unidade leve de execução dentro de um programa. É uma forma de realizar multitarefa, permitindo que diferentes partes do programa sejam executadas concorrentemente. Isso é especialmente útil em situações onde certas operações podem ocorrer de forma independente.

## Criando Threads em Java

Existem duas maneiras principais de criar threads em Java:

1. **Estendendo a classe Thread:**
   ```java
   class MinhaThread extends Thread {
       public void run() {
           // Código a ser executado pela thread
       }
   }
   ```

   Para iniciar a thread:
   ```java
   MinhaThread minhaThread = new MinhaThread();
   minhaThread.start();
   ```

2. **Implementando a interface Runnable:**
   ```java
   class MinhaRunnable implements Runnable {
       public void run() {
           // Código a ser executado pela thread
       }
   }
   ```

   Para iniciar a thread:
   ```java
   MinhaRunnable minhaRunnable = new MinhaRunnable();
   Thread minhaThread = new Thread(minhaRunnable);
   minhaThread.start();
   ```

## Ciclo de Vida das Threads

As threads em Java passam por diferentes estados durante seu ciclo de vida, incluindo:

- **Novo (New):** A thread foi criada, mas ainda não foi iniciada.
- **Executável (Runnable):** A thread está pronta para ser executada.
- **Bloqueado (Blocked):** A thread está aguardando por um monitor para entrar em uma seção crítica.
- **Aguardando (Waiting):** A thread está aguardando outra thread realizar uma determinada ação.
- **Terminado (Terminated):** A thread concluiu sua execução.

## Sincronização de Threads

Em ambientes concorrentes, é crucial garantir a sincronização adequada entre as threads para evitar condições de corrida e garantir a consistência dos dados compartilhados. Isso pode ser alcançado usando palavras-chave como `synchronized` ou utilizando classes e métodos específicos da API de threads, como `Lock` e `Semaphore`.
