package tutorialjava;

public class Variaveis {
    public static void main(String[] args) {

        // Declarando variaveis
        int idade;
        double peso;
        String name;
        char myLetter;
        float myFloatNumber;
        boolean myBoolean;
        boolean myBoolean2;
        
        // Atribuindo valores
        idade = 20;
        peso = 80.5;
        name = "João";
        myLetter = 'a';
        myFloatNumber = 1.5f;
        myBoolean = true;
        myBoolean2 = false;

        // Imprimindo valores
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Nome: " + name);
        System.out.println("Letra: " + myLetter);
        System.out.println("Float: " + myFloatNumber);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Boolean2: " + myBoolean2);

        final int numero = 20; // final não pode ser alterado
        
    }
}
