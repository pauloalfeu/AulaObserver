// src/EstacaoMeteorologica.java
import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica implements Assunto {
    private List<Observador> observadores;
    private float temperatura;

    public EstacaoMeteorologica() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(temperatura);
        }
    }

    public void setTemperatura(float novaTemperatura) {
        this.temperatura = novaTemperatura;
        // Quando a temperatura muda, notificamos os observadores
        notificarObservadores();
    }
}