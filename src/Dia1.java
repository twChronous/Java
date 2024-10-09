public class Dia1 {
    public static void main(String[] args) {
        System.out.print("Hello world! \n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("loop");
        }

        int num;
        int anotherNum;

        System.out.println("Digite um numero: ");
        String number = System.console().readLine();
        num = Integer.parseInt(number);

        System.out.println("Digite outro numero: ");
        number = System.console().readLine();
        anotherNum = Integer.parseInt(number);

        System.out.println("Soma dos numeros:");
        System.out.println(num+anotherNum);
        int sub = num - anotherNum;
        System.out.println("Subtração dos numeros");
        System.out.println(sub);
        int div = num / anotherNum;
        System.out.println("Divisão dos numeros");
        System.out.println(div);
        System.out.println("A divisão é impar? ");
        
        if (div % 2 != 0) System.out.println("sim");
        else System.out.println("não");

    }
}