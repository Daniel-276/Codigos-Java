package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true){
        System.out.println(" **** Aplicacion Calculadora **** ");
        //Menu de opciones con switch
        mostrarMenu();
        try{
        var operacion = Integer.parseInt(consola.nextLine());
        //Revisar si esta en las operaciones mencionadas
        if (operacion >= 1 && operacion <= 4) {
         //Llamamos la operacion
            ejecutarOperacion(operacion, consola);
        }else if (operacion == 5){
            System.out.println("Gracias, vuelve pronto...");
            break;
        }
        
        else {
            System.out.println("Opcion erronea: " + operacion);
        }
            
        } catch (Exception e){
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        System.out.println();
    }//Fin del while
    }//Fin del main
    private static void mostrarMenu(){
     //->esta es una opcion que se puede hacer //System.out.println("1.-SUMA \n 2.-RESTA \n 3.-MULTIPLICACION \n 4.-DIVISION");
        System.out.println("""
                           1.-SUMA
                           2.-RESTA
                           3.-MULTIPLICACION
                           4.-DIVISION
                           5.-SALIR
                           """);
        System.out.print("¿Cual es la operacion a realizar? ");        
    }
    
    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona el valor de operando1: ");
            var operador1 = Double.parseDouble(consola.nextLine());

            System.out.print("Proporciona el valor de operando2: ");
            var operador2 = Double.parseDouble(consola.nextLine());

            double resultado;

            switch (operacion) {
                case 1 -> {
                    resultado = operador1 + operador2;
                    System.out.println("resultado de la suma: " + resultado);
                }

                case 2 -> {
                    resultado = operador1 - operador2;
                    System.out.println("resultado de la resta: " + resultado);
                }

                case 3 -> {
                    resultado = operador1 * operador2;
                    System.out.println("resultado de la multiplicacion: " + resultado);
                }

                case 4 -> {
                    resultado = operador1 / operador2;
                    System.out.println("resultado de la division: " + resultado);
                }

                default -> {
                    System.out.println("Opcion erronea: " + operacion);
                }
            }

    }
}//Fin de la class 
