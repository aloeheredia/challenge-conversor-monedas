package com.alura.convertidorMonedas.principal;

import com.alura.convertidorMonedas.conexion.ConexionJson;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leer = new Scanner(System.in);

        int opcion=0;
        double valorInicial=0;
        double valorFinal=0;
        do {
            System.out.println("*********************");
            System.out.println("Sea bienvenido/a al Conversor de Monedas");
            System.out.println("");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida:");
            System.out.println("***********************");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    valorInicial = leer.nextDouble();
                    ConexionJson conexionJson = new ConexionJson();
                    valorFinal = conexionJson.obtenerValorFinal("USD","ARS",valorInicial);
                    System.out.println("El valor "+valorInicial+" [USD]"+" corresponde al valor final de =>>>"+ valorFinal+ " [ARS]");
                    break;

                case 2:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    valorInicial = leer.nextDouble();
                    ConexionJson conexionJson1 = new ConexionJson();
                    valorFinal = conexionJson1.obtenerValorFinal("ARS","USD",valorInicial);
                    System.out.println("El valor "+valorInicial+" [ARS]"+" corresponde al valor final de =>>>"+valorFinal+ " [USD]");
                    break;

                case 3:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    valorInicial = leer.nextDouble();
                    ConexionJson conexionJson2 = new ConexionJson();
                    valorFinal = conexionJson2.obtenerValorFinal("USD","BRL",valorInicial);
                    System.out.println("El valor "+valorInicial+" [USD]"+" corresponde al valor final de =>>>"+valorFinal+" [BRL]");
                    break;

                case 4:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    valorInicial = leer.nextDouble();
                    ConexionJson conexionJson3 = new ConexionJson();
                    valorFinal = conexionJson3.obtenerValorFinal("BRL","USD",valorInicial);
                    System.out.println("El valor "+valorInicial+" [BRL]"+" corresponde al valor final de =>>>"+valorFinal+" [USD]");
                    break;
                case 5:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    valorInicial = leer.nextDouble();
                    ConexionJson conexionJson4 = new ConexionJson();
                    valorFinal = conexionJson4.obtenerValorFinal("USD","COP",valorInicial);
                    System.out.println("El valor "+valorInicial+" [USD]"+" corresponde al valor final de =>>>"+valorFinal+ " [COP]");
                    break;
                case 6:
                    System.out.println("Ingrese el valor que deseas convertir:");
                    valorInicial = leer.nextDouble();
                    ConexionJson conexionJson5 = new ConexionJson();
                    valorFinal = conexionJson5.obtenerValorFinal("COP","USD",valorInicial);
                    System.out.println("El valor "+valorInicial+" [COP]"+" corresponde al valor final de =>>>"+valorFinal+ " [USD]");
                    break;

                case 7:
                    System.out.println("Finalizando el programa!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 7);

    }

}



