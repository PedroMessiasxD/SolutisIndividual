public class Elefante extends AnimalAB{

    public Elefante() {
        super();
        this.tipoAnimal = "Elefante";
        this.quantidadePatas = 4;
        this.altura = 3.0;
        this.peso = 5000.0;
    }

    public Elefante(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Elefante", idade, habitat, 4, 0, 0.0, altura, peso);
    }



    public void emitirSom(){
        System.out.println("Elefante faz um som grave.");
    }

}
