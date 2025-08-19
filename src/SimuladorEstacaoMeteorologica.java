// src/SimuladorEstacaoMeteorologica.java
public class SimuladorEstacaoMeteorologica {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        // Criamos os displays e os registramos na estação
        DisplayCondicoesAtuais displayCondicoes = new DisplayCondicoesAtuais(estacao);
        DisplayEstatisticas displayEstatisticas = new DisplayEstatisticas(estacao);

        // Simulação 1: Primeira Mudança de Temperatura
        System.out.println("--- PRÉ-ATUALIZAÇÃO 1: Estado dos Displays ---");
        displayCondicoes.mostrarEstadoAtual();
        displayEstatisticas.mostrarEstadoAtual();

        System.out.println("\n--- ATUALIZANDO TEMPERATURA PARA 25.5 °C ---");
        estacao.setTemperatura(25.5f);

        System.out.println("\n--- PÓS-ATUALIZAÇÃO 1: Estado dos Displays ---");
        displayCondicoes.mostrarEstadoAtual();
        displayEstatisticas.mostrarEstadoAtual();

        // Simulação 2: Segunda Mudança de Temperatura
        System.out.println("\n--- PRÉ-ATUALIZAÇÃO 2: Estado dos Displays ---");
        displayCondicoes.mostrarEstadoAtual();
        displayEstatisticas.mostrarEstadoAtual();

        System.out.println("\n--- ATUALIZANDO TEMPERATURA PARA 26.0 °C ---");
        estacao.setTemperatura(26.0f);

        System.out.println("\n--- PÓS-ATUALIZAÇÃO 2: Estado dos Displays ---");
        displayCondicoes.mostrarEstadoAtual();
        displayEstatisticas.mostrarEstadoAtual();

        // Simulação 3: Removendo um display
        System.out.println("\n--- REMOVENDO O DISPLAY DE ESTATISTICAS ---");
        estacao.removerObservador(displayEstatisticas);

        System.out.println("\n--- PRÉ-ATUALIZAÇÃO 3: Estado dos Displays ---");
        displayCondicoes.mostrarEstadoAtual();
        displayEstatisticas.mostrarEstadoAtual();

        System.out.println("\n--- ATUALIZANDO TEMPERATURA PARA 27.2 °C ---");
        estacao.setTemperatura(27.2f);

        System.out.println("\n--- PÓS-ATUALIZAÇÃO 3: Estado dos Displays ---");
        displayCondicoes.mostrarEstadoAtual();
        displayEstatisticas.mostrarEstadoAtual();
    }
}