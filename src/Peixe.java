public class Peixe extends AnimalMarinhoAB{

    // Construtor padrão
    public Peixe() {
        super("Desconhecido", 0, "Água", 0.1, 0.5);
    }


    // Construtor sobrecarregado
    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, idade, habitat, altura, peso);
    }

    public void nadar(int distancia) {
        distanciaPercorrida += distancia;
        System.out.println("O peixe nadou" + distancia + "metros.");
    }

    public void emitirSom(){
        System.out.println("O peixe está emitindo um som");
    }

}