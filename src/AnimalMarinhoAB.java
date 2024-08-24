public abstract class AnimalMarinhoAB extends AnimalAB{

    public AnimalMarinhoAB() {
        super();
    }

    public AnimalMarinhoAB(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Marinho", idade, habitat, 0, 0, 0.0, altura, peso);
    }
    // Só para marinhos
    public abstract void nadar(int distancia);
}
