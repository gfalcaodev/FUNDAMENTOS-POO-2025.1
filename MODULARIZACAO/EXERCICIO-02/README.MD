# 🎲 Simulador do Jogo de Craps

Este exercício propõe a criação de um programa que simula o famoso jogo de azar **Craps**, amplamente jogado em cassinos ao redor do mundo. A proposta é aplicar **lógica de decisão** e **laços de repetição** para recriar as regras básicas do jogo de dados.

---

## 📋 Regras do Jogo

1. O jogador lança **dois dados**, cada um com **6 lados (1 a 6)**.
2. Soma-se os valores obtidos nos dois dados.

### 🥇 Resultado do Primeiro Lance

- **Ganha** se a soma for:
  - `7` → *SEVEN*
  - `11` → *YO LEVEN*

- **Perde** se a soma for:
  - `2` → *SNAKE EYES*
  - `3` → *TREY*
  - `12` → *BOX CARS*

- ❗ Caso a soma seja:
  - `4, 5, 6, 8, 9 ou 10`, esse número se torna a **"pontuação"** do jogador.

---

## 🔁 Continuando o Jogo

- Após obter a **pontuação**, o jogador continua lançando os dados até:
  - **Ganhar** se repetir sua pontuação 🎯
  - **Perder** se tirar `7` antes disso 💥

---

## 🧠 Conceitos Envolvidos

- Uso de **variáveis aleatórias** (`Math.random()` ou `Random`)
- **Condicionais** (`if`, `else`, `switch`)
- **Laços de repetição** (`while`, `do-while`)
- Simulação de jogos por meio da lógica de programação

---

## 📦 Objetivo do Exercício
  
Desenvolver a capacidade de aplicar regras complexas com estruturas condicionais e repetição, além de melhorar a habilidade de criar simulações interativas com lógica clara e bem estruturada.
