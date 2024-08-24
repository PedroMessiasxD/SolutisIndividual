public class Pombo extends AnimalVoadorAB {

    public Pombo() {
        super("Desconhecido", 0, "Cidade", 0.4, 0.3, 2, 1.0);
    }

    public Pombo(String nome, int idade, String habitat, double altura, double peso, int quantidadeAsas, double envergaduraAsa) {
        super(nome, idade, habitat, altura, peso, quantidadeAsas, envergaduraAsa);
    }

    public void voar(int distancia) {
        distanciaPercorrida += distancia;
        System.out.println("O pombo voa " + distancia + " metros");
    }

    public void emitirSom() {
        System.out.println("Pombo: Coo!");
    }
}
