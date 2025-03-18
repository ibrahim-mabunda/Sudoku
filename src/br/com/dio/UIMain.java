package br.com.dio;

import br.com.dio.ui.Custom.screen.MainScreen;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UIMain {

    public static void main(String[] args) {
        // Validação e criação da configuração do jogo
        Map<String, String> gameConfig = Stream.of(args)
                .filter(arg -> arg.contains(";")) // Garante que o argumento contém um ponto e vírgula
                .map(arg -> arg.split(";"))
                .filter(parts -> parts.length == 2) // Garante que há exatamente duas partes (chave e valor)
                .collect(Collectors.toMap(
                        parts -> parts[0], // Chave
                        parts -> parts[1], // Valor
                        (existing, replacement) -> existing // Em caso de duplicatas, mantém o valor existente
                ));

        // Verifica se a configuração está vazia e exibe uma mensagem
        if (gameConfig.isEmpty()) {
            System.out.println("Nenhuma configuração válida foi fornecida. Usando configuração padrão.");
        } else {
            System.out.println("Configuração do jogo carregada: " + gameConfig);
        }

        try {
            // Inicializa a tela principal do jogo
            var mainScreen = new MainScreen(gameConfig);
            mainScreen.buildMainScreen();
        } catch (Exception e) {
            // Captura e exibe erros inesperados
            System.err.println("Erro ao inicializar a interface do jogo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}