public class Gato extends AnimalAB{

    public Gato() {
        super();
        this.tipoAnimal = "Gato";
        this.quantidadePatas = 4;
    }

    public Gato(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Gato", idade, habitat, 4, 0, 0.0, altura, peso);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau!");
    }

}
