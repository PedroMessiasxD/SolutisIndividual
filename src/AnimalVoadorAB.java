public abstract class AnimalVoadorAB extends AnimalAB{
    protected int quantidadeAsas;
    protected double envergaduraAsa;

    public AnimalVoadorAB() {
        super();
    }

    public AnimalVoadorAB(String nome, int idade, String habitat, double altura, double peso,
                          int quantidadeAsas, double envergaduraAsa) {
        super(nome, "Voador", idade, habitat, 0, quantidadeAsas, envergaduraAsa, altura, peso);
    }

    //Só para voadores
    public abstract void voar(int distancia);
}
