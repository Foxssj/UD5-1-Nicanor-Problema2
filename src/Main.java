import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack valoresPila = new IntStack();
        int valor, cantNums = 2, out = 0;
        String operacion;

        System.out.println("Introduzca el primer valor");
        valor = sc.nextInt();
        sc.nextLine();
        valoresPila.push(valor);

        System.out.println("Introduzca el segundo valor valor");
        valor = sc.nextInt();
        sc.nextLine();
        valoresPila.push(valor);

        System.out.println("Ahora elija una operación");
        operacion = sc.nextLine();

        switch (operacion) {
            case "suma":
            case "Suma":
            case "+":
                for (int i = 0; i < cantNums; i++) {
                    out += valoresPila.pop();
                }
                System.out.println(out);
                break;
            case "Resta":
            case "resta":
            case "-":
                out = valoresPila.pop();
                out -= valoresPila.pop();

                System.out.println(out);
                break;
            case "Division":
            case "division":
            case "División":
            case "división":
            case "/":
                out = valoresPila.pop();
                out /= valoresPila.pop();

                System.out.println(out);
                break;
            case "multiplicacion":
            case "Multiplicacion":
            case "multiplicación":
            case "Multiplicación":
            case "*":
                out = valoresPila.pop();
                out *= valoresPila.pop();

                System.out.println(out);
                break;
        }

    }
}
