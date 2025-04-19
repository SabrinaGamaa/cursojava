# Alguns exercícios dos meus estudos de JAVA.


## 💳 Sistema de Parcelamento de Cursos
**Estrutura de Pastas**
- **interfaces**
  - **exercicios2**

Projeto desenvolvido em Java com objetivo de simular um sistema de parcelamento de cursos. O programa recebe os dados de um curso e o número de parcelas desejadas, e retorna a lista de parcelas com os valores atualizados conforme regras de juros e taxas de pagamento.

---

### 🛠️ Tecnologias Utilizadas

- Java 17+
- Paradigma Orientado a Objetos (POO)
- Interface
- LocalDate / DateTimeFormatter
- Conceitos de injeção de dependência e composição de objetos

---

### 📁 Estrutura do Projeto

```
application/
│
└── PrestacaoServico.java         # Classe principal (ponto de entrada do programa)

entities/
│
├── Course.java                   # Representa os dados do curso (contrato)
└── InstallmentCourse.java        # Representa cada parcela gerada

entities/services/
│
├── ContractCourse.java           # Serviço responsável por gerar as parcelas
├── OnlinePayment.java            # Interface com métodos de pagamento
└── PaypalServiceCourse.java      # Implementação da interface de pagamento (simula PayPal)
```

---

### 🧠 Lógica de Negócio

O cálculo das parcelas é feito considerando:

- Divisão do valor total do curso igualmente entre as parcelas.
- Aplicação de **juros simples de 1% ao mês** sobre o valor base da parcela.
- Adição de uma **taxa de 2%** sobre o valor com juros.

Fórmulas utilizadas:

```java
interest = amount * 0.01 * month;
paymentFee = (amount + interest) * 0.02;
```

---

### 🧪 Exemplo de Entrada e Saída

**Entrada:**
```
Número do curso: 1010
Data de início: 10/05/2023
Valor total do curso: 900.0
Número de parcelas: 3
```

**Saída:**
```
Parcelas:
10/06/2023 - 309.06
10/07/2023 - 312.12
10/08/2023 - 315.18
```

---

### 📌 Conceitos Praticados

- Interfaces
- Programação orientada a objetos
- Reutilização de código (abstração)
- Injeção de dependência (contrato de serviço)
- Boas práticas com organização em pacotes

---

### ✍️ Autora

Desenvolvido por **Sabrina Gama** como parte dos estudos em Java e orientação a objetos.

 
