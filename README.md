# Conta Bancária - Simulação de Terminal

Este projeto é um simulador de terminal de conta bancária, desenvolvido em Java. Ele permite que o usuário insira o número da conta e, se correto, exibe uma mensagem de boas-vindas com os detalhes da conta.

## Funcionalidades

- Solicita ao usuário que digite o número da conta.
- Valida o número da conta inserido.
- Exibe os detalhes da conta (nome do cliente, agência, número da conta e saldo) se a validação for bem-sucedida.
- Mostra uma mensagem de erro caso a conta seja inválida.

## Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone <url-do-seu-repositorio>
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd ContaBanco
    ```
3.  **Compile os arquivos Java:**
    Localize o diretório `src` e compile os arquivos:
    ```bash
    javac src/Main.java src/models/ContaTerminal.java
    ```
4.  **Execute o programa:**
    A partir do diretório `src`, execute a classe `Main`:
    ```bash
    java Main
    ```
    Ou, se estiver na raiz do projeto:
     ```bash
    java -cp src Main
    ```

5.  **Siga as instruções no terminal:**
    O programa solicitará que você digite o número da conta. O número de conta codificado no programa é `1021`.

## Tecnologias Utilizadas

-   **Java**: Linguagem de programação principal.
-   **Scanner**: Classe do Java para captura de entrada do usuário no console. 
