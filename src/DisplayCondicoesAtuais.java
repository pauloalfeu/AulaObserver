// src/DisplayCondicoesAtuais.java
public class DisplayCondicoesAtuais implements Observador {
    private float temperatura;
    private Assunto estacaoMeteorologica;

    public DisplayCondicoesAtuais(Assunto estacaoMeteorologica) {
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
        System.out.println("  [Antes da atualização] Display Condições Atuais possui: " + this.temperatura + " °C");
    }
    
    public void exibir() {
        System.out.println("Display Condições Atuais: " + temperatura + " °C");
    }

}