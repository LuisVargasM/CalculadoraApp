import java.util.Scanner;

public class CalculadoraApp{
public static void main(String[] args){


    while(true){
        System.out.println("En Git");
        System.out.println("**** Aplicacion Calculadora ****");
        mostrarMenu();
        Scanner consola = new Scanner(System.in);

        System.out.println("Operacion a realizar? ");


        try {


            var operacion = Integer.parseInt(consola.nextLine());
            if (operacion >= 1 && operacion <= 4) {
                //realizar operacion deseada
                ejectuarOperacion(operacion, consola);

            } else if (operacion == 5) {
                System.out.println("Hasta pronto...");
                break;
            } else {
                System.out.println("Opcion erronea: " + operacion);
            }


            System.out.println("");
        } //fin try
        catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }// fin catch
    } //fin de while







}
    public static void mostrarMenu(){

        System.out.println("""
            1. Suma.
            2. Resta.
            3. Multiplicacion.
            4. Division.
            5. Salir
            """);
    }

    private static void ejectuarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona Valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado = 0;
        switch (operacion) {
            case 1 -> { //suma
                resultado = operando1 + operando2;
            }
            case 2 -> {//resta
                resultado = operando1 - operando2;
            }
            case 3 -> {//multiplicacion
                resultado = operando1 * operando2;


            }
            case 4 -> {//division
                resultado = operando1 / operando2;
            }
            default -> {
                System.out.println("Opcion erronea");
            }

        }
        System.out.println("Resultado: " + resultado);
    }
}
