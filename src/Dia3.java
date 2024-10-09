import java.util.Arrays;

public class Dia3 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        String number = System.console().readLine();
        String[] numberarray = number.split("");
        System.out.println("Esse numero possui: "+ numberarray.length + " digitos");
    }
}
