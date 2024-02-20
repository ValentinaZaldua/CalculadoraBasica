package Presentacion;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int operacion = 0;
        int n1 = 0;
        int n2 = 0;
        int resultado = 0;

        while (true) {

            System.out.println("Ingrese la operacion que desee realizar");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Factorial");
            System.out.println("6. Potenciacion");
            System.out.println("7. Salir");

            operacion = sc.nextInt();

            if (operacion == 7) {
                break;
            }

            if (operacion != 5 && operacion != 6) {
                System.out.println("\n");
                System.out.println("Inserte el primer numero");
                n1 = sc.nextInt();
                System.out.println("Inserte el segundo numero");
                n2 = sc.nextInt();
            }

            switch (operacion) {
                case 1:
                    resultado = n1 + n2;
                    System.out.println("El resultado de la operacion es:  " + resultado);
                    System.out.println("\n");
                    break;
                case 2:
                    resultado = n1 - n2;
                    System.out.println("El resultado de la operacion es:  " + resultado);
                    System.out.println("\n");
                    break;
                case 3:
                    resultado = n1 * n2;
                    System.out.println("El resultado de la operacion es:  " + resultado);
                    System.out.println("\n");
                    break;
                case 4:
                    resultado = n1 / n2;
                    System.out.println("El resultado de la operacion es:  " + resultado);
                    System.out.println("\n");
                    break;
                case 5:
                    double factorial = 1;
                    int n=0;
                    System.out.println("ingrese el numero:  ");
                    n =sc.nextInt();
                    for (double i = 1; i <= n; i++) {
                        factorial = factorial*i;
                    }
                   
                    System.out.println("El factorial de " + n + " es:  " + factorial);
                    System.out.println("\n");
                    break;
                case 6:
                	int np=0;
                	int p=0;
                	System.out.println("ingrese el numero");
                	np = sc.nextInt();                   
                	System.out.println("ingresela potencia");
                	p = sc.nextInt();
                	resultado = (int) Math.pow(np, p);
                    System.out.println("El resultado de la operacion es:  " + resultado);
                    System.out.println("\n");
                    break;
            }
        }
    }
}