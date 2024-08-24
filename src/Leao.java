public class Leao extends AnimalAB {

    public Leao() {
        super();
        this.tipoAnimal = "Leão";
        this.quantidadePatas = 4;
        this.altura = 1.2; // Altura média de um leão adulto
        this.peso = 190.0; // Peso médio de um leão adulto
    }

    public Leao(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Leão", idade, habitat, 4, 0, 0.0, altura, peso);
    }

    public void emitirSom(){
        System.out.println("Leão emitindo o som: Auuuu!");
    }

}
