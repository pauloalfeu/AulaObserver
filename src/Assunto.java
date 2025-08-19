// Criando a interface Assunto.java


public interface Assunto {
    void registrarObservador(Observador o);
    void removerObservador(Observador o);
    void notificarObservadores();
}