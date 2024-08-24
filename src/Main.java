//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // Instanciando um Cachorro
        Cachorro cachorro = new Cachorro("Rex", 4, "Casa", 0.6, 15.0);
        cachorro.comer(70);
        cachorro.dormir(8);
        cachorro.moverse(20);
        cachorro.emitirSom();
        printInformacoesAnimal(cachorro);

        // Instanciando um Gato
        Gato gato = new Gato("Whiskers", 3, "Apartamento", 0.3, 5.0);
        gato.comer(30);
        gato.dormir(12);
        gato.moverse(5);
        gato.emitirSom();
        printInformacoesAnimal(gato);

        // Instanciando um Elefante
        Elefante elefante = new Elefante("Dumbo", 10, "Selva", 3.0, 5000.0);
        elefante.comer(200);
        elefante.dormir(6);
        elefante.moverse(50);
        elefante.emitirSom();
        printInformacoesAnimal(elefante);

        // Instanciando um Peixe
        Peixe peixe = new Peixe("Nemo", 1, "Recife", 0.2, 0.1);
        peixe.comer(10);
        peixe.dormir(2);
        peixe.nadar(30);
        peixe.emitirSom();
        printInformacoesAnimal(peixe);

        // Instanciando um Pombo
        Pombo pombo = new Pombo("Pipoca", 2, "Praia", 0.4, 0.3, 2, 1.0);
        pombo.comer(15);
        pombo.dormir(5);
        pombo.voar(100);
        pombo.emitirSom();
        printInformacoesAnimal(pombo);
    }

    // Método para imprimir informações dos animais
    public static void printInformacoesAnimal(AnimalAB animal) {
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Tipo de Animal: " + animal.getTipoAnimal());
        System.out.println("Idade: " + animal.getIdade());
        System.out.println("Habitat: " + animal.getHabitat());
        System.out.println("Quantidade de Patas: " + animal.getQuantidadePatas());
        System.out.println("Quantidade de Asas: " + animal.getQuantidadeAsas());
        System.out.println("Envergadura da Asa: " + animal.getEnvergaduraAsa());
        System.out.println("Altura: " + animal.getAltura());
        System.out.println("Peso: " + animal.getPeso());
        System.out.println("Quantidade de comida ingerida: " + animal.getQuantidadeComida());
        System.out.println("Distância percorrida: " + animal.getDistanciaPercorrida());
        System.out.println("Horas dormidas: " + animal.getHorasDormidas());
        System.out.println();
    }
}