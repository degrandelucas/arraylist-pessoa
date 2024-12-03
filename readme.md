# Projeto de Estudo - Manipulação de ArrayList com Classe Pessoa

Este projeto explora conceitos fundamentais de manipulação de listas em Java utilizando a classe `ArrayList`, com foco na criação e gerenciamento de objetos personalizados. O objetivo é aplicar princípios básicos da Orientação a Objetos, como encapsulamento e a utilização do método `toString()` para facilitar a visualização de objetos.

## Funcionalidades Principais

1. **Criação de Objetos Pessoa:**
    - Representação de pessoas com atributos como `nome` e `idade`.

2. **Manipulação de Listas:**
    - Adição de objetos do tipo `Pessoa` em um `ArrayList`.
    - Exibição do tamanho da lista utilizando o método `size()`.
    - Acesso a elementos específicos utilizando o método `get()`.

3. **Exibição Personalizada:**
    - Uso do método sobrescrito `toString()` para exibir os detalhes de cada pessoa de forma legível.

## Estrutura do Projeto

### Pacotes

- `com.practice.arraylist`
    - Contém a classe principal `App` responsável por executar as operações.

- `com.practice.arraylist.model`
    - Contém a classe de domínio `Pessoa`, que encapsula os atributos e comportamentos de uma pessoa.

### Classes

- **`App`**
    - Classe principal do projeto. Realiza operações com a lista de pessoas, como adicionar, acessar e exibir elementos.

- **`Pessoa`**
    - Representa uma pessoa com os atributos:
        - `nome` (String)
        - `idade` (int)
    - Inclui métodos para acesso aos atributos e uma implementação personalizada do método `toString()`.

## Como Executar o Projeto

1. **Clone este repositório:**
   ```bash
   git clone https://github.com/seuusuario/arraylist-pessoa-demo.git
   ```

2. **Configure o ambiente Java:**

- Certifique-se de ter o **Java 8 ou superior** instalado.

3. **Compile os arquivos:**

- Compile as classes localizadas nos pacotes:
    - `com.practice.arraylist`
    - `com.practice.arraylist.model`

4. **Execute a aplicação:**

- Execute a classe `App` para visualizar as funcionalidades.

---

## Tecnologias Utilizadas

- **Java 8 ou superior:** Linguagem utilizada para o desenvolvimento.
- **Paradigma Orientado a Objetos:** Aplicado na modelagem da classe `Pessoa`.

---

## Autor

Lucas Degrande