# Sudoku
# Jogo de Tabuleiro Interativo 🎲

## Introdução
Este programa, escrito em Java, gerencia um jogo baseado em tabuleiro 9x9, onde o usuário pode interagir com as posições, inserir ou remover números, verificar o status do jogo, e muito mais!

## Funcionalidades 🌟
1. **Iniciar Novo Jogo**: Configura o tabuleiro para uma nova partida.
2. **Inserir Número**: Permite adicionar um número em uma posição específica.
3. **Remover Número**: Remove um número de uma posição, caso seja permitido.
4. **Visualizar Jogo Atual**: Exibe o estado atual do tabuleiro.
5. **Verificar Status**: Indica se o jogo contém erros ou está completo.
6. **Limpar Jogo**: Reinicia o tabuleiro, perdendo o progresso.
7. **Finalizar Jogo**: Verifica se o jogo foi concluído com sucesso.

---

## Menu de Opções 🖥️

| **Opção** | **Descrição**                                  |
|-----------|----------------------------------------------|
| 1         | Iniciar um novo jogo                         |
| 2         | Inserir número em uma posição                |
| 3         | Remover número de uma posição                |
| 4         | Visualizar o estado atual do tabuleiro       |
| 5         | Verificar o status do jogo                  |
| 6         | Limpar todo o progresso                     |
| 7         | Finalizar jogo com validação do progresso    |
| 8         | Sair do programa                            |

---

## Fluxo do Programa 🔄
1. Exibe um menu com opções para o usuário.
2. Executa a funcionalidade selecionada:
   - Inicia ou reinicia o jogo usando `startGame`.
   - Permite entrada de números usando `inputNumber`.
   - Remove números com `removeNumber`.
   - Checa erros ou progresso no tabuleiro.
3. Sai do programa com a opção "Sair".

---

## Destaques Técnicos ⚙️
- **Streams e Mapas**: Usa `Stream` e `Collectors.toMap` para processar posições do tabuleiro.
- **Validadores**: Método `runUntilGetValidNumber` para garantir que entradas são válidas.
- **Mensagens Interativas**: Mensagens personalizadas para melhorar a experiência do usuário.

