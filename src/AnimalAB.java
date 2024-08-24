import com.solutis.lista04.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    // Atributos comuns
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected int quantidadePatas;
    protected int quantidadeAsas;
    protected double envergaduraAsa;
    protected double altura;
    protected double peso;


    // Estado interno
    protected int quantidadeComida;
    protected int distanciaPercorrida;
    protected int horasDormidas;

    // Construtor padrão
    public AnimalAB() {
        this.nome = "Desconhecido";
        this.tipoAnimal = "Desconhecido";
        this.idade = 0;
        this.habitat = "Desconhecido";
        this.quantidadePatas = 0;
        this.quantidadeAsas = 0;
        this.envergaduraAsa = 0.0;
        this.altura = 0.0;
        this.peso = 0.0;
    }
    // Construtor sobrecarregado
    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat,
                    int quantidadePatas, int quantidadeAsas, double envergaduraAsa,
                    double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = quantidadePatas;
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
        this.altura = altura;
        this.peso = peso;
    }

    //metodo comer
    @Override
    public void comer(int quantidade) {
        quantidadeComida += quantidade;
        System.out.println("O animal comeu" + quantidade + "pedaços de comida.");
    }

    //metodo dormir
    @Override
    public void dormir(int horas) {
        horasDormidas = horas;
        System.out.println("O animal dormiu por" + horas + "horas");
    }

    //metodo moverse
    @Override
    public void moverse(int distancia) {
        distanciaPercorrida += distancia;
        System.out.println("O animal andou" + distancia + "metros");
    }



    // Métodos getter para acessar os atributos
    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }


    public String getNome() {
        return nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public abstract void emitirSom();
}