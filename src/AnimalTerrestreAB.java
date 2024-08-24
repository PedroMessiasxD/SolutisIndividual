public abstract class AnimalTerrestreAB extends AnimalAB{
    public AnimalTerrestreAB() {
        super("Desconhecido", "Desconhecido", 0, "Desconhecido", 4, 0, 0.0, 0.0, 0.0);
    }

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat,
                             int quantidadePatas, int quantidadeAsas, double envergaduraAsa,
                             double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, quantidadeAsas, envergaduraAsa, altura, peso);
    }
}

