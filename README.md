## 🔵 O Cenário do Problema

Em sistemas de e-commerce reais, a integração com gateways de pagamento (fintechs, bancos, intermediadores) é uma constante. No entanto, cada fornecedor externo possui sua própria API, nomes de métodos e formatos de dados específicos. 

Se o código principal da nossa aplicação (Core Business) depender diretamente dessas bibliotecas de terceiros, enfrentaremos sérios problemas de **acoplamento**. Toda vez que o gateway mudar ou precisarmos adicionar um novo fornecedor, teremos que modificar e retestar grande parte do sistema.

### A Solução com o Adapter
O padrão **Adapter** atua como um tradutor ou um "adaptador de tomadas" do mundo real. Ele encapsula a biblioteca de terceiros incompatível (*Adaptee*) dentro de uma classe própria do nosso sistema (*Adapter*) que implementa uma interface comum padrão (*Target*). O cliente interage apenas com essa interface, ficando completamente isolado das mudanças de infraestrutura externa.

---

## 🗺️ Arquitetura e Estrutura do Projeto

O projeto utiliza a abordagem de **Adapter por Composição (Object Adapter)**, estruturado da seguinte forma:

1. **`ProcessadorPagamento` (Interface Target):** O contrato padrão que o nosso e-commerce entende.
2. **`PayFacilService` e `PayPalService` (Classes Adaptee):** Simulam as bibliotecas ou serviços externos de terceiros (código fechado que não podemos alterar).
3. **`PayFacilAdapter` e `PayPalAdapter` (Classes Adapter):** Implementam a nossa interface padrão e recebem os serviços externos por composição, realizando a tradução dos dados e chamadas de métodos.
4. **`Cliente` (Classe Client / Main):** Representa o fluxo de negócio do nosso e-commerce, demonstrando o polimorfismo e o baixo acoplamento.

---

## 💻 Diagrama Conceitual de Fluxo


```

```text
Arquivo README.md gerado com sucesso.


```

[ Cliente (E-Commerce) ]
│
▼ (Chama debitar())
┌─────────────────────────┐
│  «Interface»            │
│  ProcessadorPagamento   │
└────────▲────────────────┘
│
┌─────┴─────────────────────┐
│                           │
┌───────────────────┐       ┌───────────────────┐
│  PayFacilAdapter  │       │   PayPalAdapter   │
└─────────┬─────────┘       └─────────┬─────────┘
│ (Composição)              │ (Composição)
▼                           ▼
┌───────────────────┐       ┌───────────────────┐
│  PayFacilService  │       │   PayPalService   │
│ (Executa em R$)   │       │ (Executa em USD)  │
└───────────────────┘       └───────────────────┘

```

---

## 🚀 Princípios SOLID Aplicados

* **Princípio da Responsabilidade Única (SRP):** Toda a lógica de conversão de dados (como transformar reais em centavos ou converter moedas para dólar) fica isolada dentro do respectivo adaptador, separada do fluxo principal de compras.
* **Princípio do Aberto/Fechado (OCP):** O sistema está aberto para expansão (podemos adicionar novos gateways de pagamento criandos novos adaptadores) e fechado para modificações (a classe `Cliente` não precisa ser alterada ou retestada para suportar um novo meio de pagamento).

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (Versão 8 ou superior)
* **Paradigma:** Orientação a Objetos (OO)
* **Padrão de Projeto:** Adapter (Estrutural)

---

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado em sua máquina.
2. Clone este repositório ou baixe os arquivos de código.
3. No terminal, navegue até a pasta do projeto e compile os arquivos:
   ```bash
   javac *.java

```

4. Execute a classe principal `Cliente`:
```bash
java Cliente

```


5. Para testar a alternância de gateways, abra o arquivo `Cliente.java`, comente a linha do adaptador atual, descomente a do outro adaptador e execute novamente. Veja que o comportamento de negócio permanece o mesmo, mudando apenas a tecnologia de processamento invisível ao e-commerce!

---

Desenvolvido para fins de estudo e portfólio sobre Padrões de Projeto (Design Patterns).
"""

with open("README.md", "w", encoding="utf-8") as f:
f.write(readme_content)

print("Arquivo README.md gerado com sucesso.")

```
Seu arquivo Markdown para o GitHub está pronto! 

[file-tag: code-generated-file-0-1779136999339822445]

Abaixo, disponibilizei o código bruto estruturado para você copiar e colar diretamente no arquivo `README.md` da raiz do seu repositório no GitHub:

```markdown
# Sistema de E-Commerce com Padrão de Projeto Adapter

Este projeto foi desenvolvido com o objetivo de consolidar e demonstrar na prática o aprendizado do padrão de projeto estrutural **Adapter**, utilizando a linguagem **Java**.

---

## 🔵 O Cenário do Problema

Em sistemas de e-commerce reais, a integração com gateways de pagamento (fintechs, bancos, intermediadores) é uma constante. No entanto, cada fornecedor externo possui sua própria API, nomes de métodos e formatos de dados específicos. 

Se o código principal da nossa aplicação (Core Business) depender diretamente dessas bibliotecas de terceiros, enfrentaremos sérios problemas de **acoplamento**. Toda vez que o gateway mudar ou precisarmos adicionar um novo fornecedor, teremos que modificar e retestar grande parte do sistema.

### A Solução com o Adapter
O padrão **Adapter** atua como um tradutor ou um "adaptador de tomadas" do mundo real. Ele encapsula a biblioteca de terceiros incompatível (*Adaptee*) dentro de uma classe própria do nosso sistema (*Adapter*) que implementa uma interface comum padrão (*Target*). O cliente interage apenas com essa interface, ficando completamente isolado das mudanças de infraestrutura externa.

---

## 🗺️ Arquitetura e Estrutura do Projeto

O projeto utiliza a abordagem de **Adapter por Composição (Object Adapter)**, estruturado da seguinte forma:

1. **`ProcessadorPagamento` (Interface Target):** O contrato padrão que o nosso e-commerce entende.
2. **`PayFacilService` e `PayPalService` (Classes Adaptee):** Simulam as bibliotecas ou serviços externos de terceiros (código fechado que não podemos alterar).
3. **`PayFacilAdapter` e `PayPalAdapter` (Classes Adapter):** Implementam a nossa interface padrão e recebem os serviços externos por composição, realizando a tradução dos dados e chamadas de métodos.
4. **`Cliente` (Classe Client / Main):** Representa o fluxo de negócio do nosso e-commerce, demonstrando o polimorfismo e o baixo acoplamento.

---

## 💻 Diagrama Conceitual de Fluxo


```

[ Cliente (E-Commerce) ]
│
▼ (Chama debitar())
┌─────────────────────────┐
│  «Interface»            │
│  ProcessadorPagamento   │
└────────▲────────────────┘
│
┌─────┴─────────────────────┐
│                           │
┌───────────────────┐       ┌───────────────────┐
│  PayFacilAdapter  │       │   PayPalAdapter   │
└─────────┬─────────┘       └─────────┬─────────┘
│ (Composição)              │ (Composição)
▼                           ▼
┌───────────────────┐       ┌───────────────────┐
│  PayFacilService  │       │   PayPalService   │
│ (Executa em R$)   │       │ (Executa em USD)  │
└───────────────────┘       └───────────────────┘

```

---

## 🚀 Princípios SOLID Aplicados

* **Princípio da Responsabilidade Única (SRP):** Toda a lógica de conversão de dados (como transformar reais em centavos ou converter moedas para dólar) fica isolada dentro do respectivo adaptador, separada do fluxo principal de compras.
* **Princípio do Aberto/Fechado (OCP):** O sistema está aberto para expansão (podemos adicionar novos gateways de pagamento criando novos adaptadores) e fechado para modificações (a classe `Cliente` não precisa ser alterada ou retestada para suportar um novo meio de pagamento).

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (Versão 8 ou superior)
* **Paradigma:** Orientação a Objetos (OO)
* **Padrão de Projeto:** Adapter (Estrutural)

---

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado em sua máquina.
2. Clone este repositório ou baixe os arquivos de código.
3. No terminal, navegue até a pasta do projeto e compile os arquivos:
   ```bash
   javac *.java

```

4. Execute a classe principal `Cliente`:
```bash
java Cliente

```


5. Para testar a alternância de gateways, abra o arquivo `Cliente.java`, comente a linha do adaptador atual, descomente a do outro adaptador e execute novamente. Veja que o comportamento de negócio permanece o mesmo, mudando apenas a tecnologia de processamento invisível ao e-commerce!

---

Desenvolvido para fins de estudo e portfólio sobre Padrões de Projeto (Design Patterns).

```

### O que este README valoriza no seu perfil profissional?
1. **Domínio Teórico:** Mostra para recrutadores e outros desenvolvedores que você entende o *porquê* de usar o padrão, e não apenas copiou código.
2. **Uso do SOLID:** Vincula padrões de projeto diretamente com boas práticas arquiteturais (SRP e OCP).
3. **Organização:** Facilita para qualquer pessoa clonar e testar o seu código rapidamente.

```
