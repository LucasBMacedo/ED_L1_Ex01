📁 Projeto: Soma de N Números Naturais (Recursivo)
📌 Descrição: >
  Essa aplicação em Java calcula o somatório dos N primeiros números naturais
  usando uma função recursiva. Se o número fornecido for negativo, o resultado será 0.

🗂️ Arquivos:
  - 🧾 src/controller/SomaController.java: Contém a função recursiva `somannatural`.
  - 🧾 src/view/Principal.java: Responsável por obter o valor de entrada e exibir o resultado final.

🧠 Lógica do Método:
  método: somannatural(int n, int contador, int soma)
  explicação:
    - ✋ Condição de parada 1: Se `n < 0`, retorna 0 (números negativos não são naturais).
    - 🛑 Condição de parada 2: Se `contador > n`, a recursão termina e retorna a soma acumulada.
    - 🔁 Relação recursiva: Adiciona `contador` à `soma`, incrementa `contador` e chama o método novamente.

🎯 Objetivo:
  - Praticar recursividade com parâmetros auxiliares (contador e acumulador).
  - Trabalhar com estruturas simples e reforçar o conceito de função recursiva.

💻 Exemplo de Execução:
  entrada: 5  
  cálculo: 1 + 2 + 3 + 4 + 5 = 15  
  saída: "A soma dos números naturais de 1 a 5 é igual a 15"

📥 Entrada:
  - Usuário insere um número através de `JOptionPane`.

📤 Saída:
  - Resultado exibido em caixa de diálogo.

👨‍💻 Autor:
  Criado por **Lucas Bezerra de Macedo**.
