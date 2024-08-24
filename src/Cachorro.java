public class Cachorro extends AnimalTerrestreAB {

    public Cachorro() {
        super("Desconhecido", "Cachorro", 0, "Desconhecido", 4, 0, 0.0, 0.6, 15.0);
    }

    public Cachorro(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Cachorro", idade, habitat, 4, 0, 0.0, altura, peso);
    }

    public void emitirSom(){
        System.out.println("Au! Au!");
    }

}
