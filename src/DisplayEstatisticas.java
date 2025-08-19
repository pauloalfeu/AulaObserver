// src/DisplayEstatisticas.java
public class DisplayEstatisticas implements Observador {
    private float temperatura;
    private Assunto estacaoMeteorologica;

    public DisplayEstatisticas(Assunto estacaoMeteorologica) {
        this.estacaoMeteorologica = estacaoMeteorologica;
        estacaoMeteorologica.registrarObservador(this);
    }

    @Override
    public void atualizar(float temperatura) {
        this.temperatura = temperatura;
        exibir();
    }

    // Método para mostrar o estado atual do display
    public void mostrarEstadoAtual() {
        System.out.println("  [Antes da atualização] Display Estatísticas possui: " + this.temperatura + " °C");
    }
    
    public void exibir() {
        System.out.println("Display Estatísticas: Uma nova medição de " + temperatura + " °C foi recebida.");
    }

}