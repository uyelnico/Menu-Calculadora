package calculadora;

import java.util.Scanner;

public class calculadora {
	
	static void Menu () {
		Scanner leer = new Scanner (System.in);
		
		String op = "nada";

		do {
		System.out.println("Eligue la opcion");
		System.out.println("A _ Sumar 2 numeros");
		System.out.println("B _ ¿Es Par o Impar?");
		System.out.println("C _ ¿Es un cuadrado perfecto?");
		System.out.println("D _ Sumatorio");
		System.out.println("X _ Salir");
		
        op = leer.nextLine().toUpperCase();

		switch (op) {
		case "A": Suma();
		break;
		case "B": Par();
		break;
		case "C": Cuadrado();
		break;
		case "D": Sumatorio();
		break;
		case "X": Salir(); 
		break;
		default: 
			System.out.println("La opcion " + op + " no es valida");
		}
		} while (!op.equals("A") && (!op.equals("B") && !op.equals("C") && !op.equals("D") && !op.equals("X")));
		
		leer.close();
		
		
	}
	
	static void Elegir () {
		
		Scanner leer = new Scanner (System.in);
		
		String op = "nada";
		
		do {
		System.out.println("M _ Volver al menu");
		System.out.println("X _ Salir");
		
        op = leer.nextLine().toUpperCase();
		
		switch (op) {
		case "M": Menu();
		break;
		case "X": Salir();
		default: 
			System.out.println("La opcion " + op + " no es valida");
		}
		
		} while (!op.equals("M") && (!op.equals("X")));	
		
		leer.close();
	}

	public static void main(String[] args) {
Menu();
	}
	
	static int Suma () {
		
		Scanner leer = new Scanner (System.in);
		
		int resultadoSuma = 0;
		
		int num1 = 0;
		int num2 = 0;
		
        do {
            System.out.println("Ingrese el primer valor");
            while (!leer.hasNextInt()) {
                System.out.println("Ingresa el primer valor (numerico)");
                leer.next();
            }
            num1 = leer.nextInt();
        } while (num1 <= 0);
		
        do {
            System.out.println("Ingresa el segundo valor");
            while (!leer.hasNextInt()) {
                System.out.println("Ingresa el segundo valor (numerico)");
                leer.next();
            }
            num2 = leer.nextInt();
        } while (num2 <= 0);
		
		
		resultadoSuma = num1+num2;
		System.out.println(resultadoSuma);
		
        Elegir();
		
		leer.close();
		
		return resultadoSuma;
		
	}
	static int Par () {
		
		Scanner leer = new Scanner (System.in);
		
		int num = 0;
		
        do {
            System.out.println("Ingrese el valor para saber si es par o impar");
            while (!leer.hasNextInt()) {
                System.out.println("Ingrese el valor (numerico) para saber si es par o impar");
                leer.next();
            }
            num = leer.nextInt();
        } while (num <= 0);		
		
        if (num%2 == 0) {
        System.out.println("El valor " + num + " es par");	
        } else {
            System.out.println("El valor " + num + " es impar");	
        }
        
        Elegir();
        
		leer.close();
		
		return num;

	}

	static int Cuadrado () {
		
		Scanner leer = new Scanner (System.in);
		
		int num = 0;
		
        do {
            System.out.println("Ingrese el valor para saber si es un cuadrado perfecto");
            while (!leer.hasNextInt()) {
                System.out.println("Ingrese el valor (numerico) para saber si es un cuadrado perfecto");
                leer.next();
            }
            num = leer.nextInt();
        } while (num <= 0);		
		
		int x = (int) Math.sqrt(num);
		
		if (x * x == num) {
			System.out.println("El valor " + num + " forma un cuadrado perfecto");
		} else {
			System.out.println("El valor " + num + " no forma un cuadrado perfecto");
		}
		
        Elegir();
		
		leer.close();
		
		return num;
	}
	
	static int Sumatorio () {
		
		Scanner leer = new Scanner (System.in);
		
		int num = 0;
		int suma = 0;
		
        do {
            System.out.println("Ingrese el valor para el sumatorio");
            while (!leer.hasNextInt()) {
                System.out.println("Ingrese el valor (numerico) para el sumatorio");
                leer.next();
            }
            num = leer.nextInt();
        } while (num <= 0);	
		
        for (int x = 1; x <= num; x++ ) {
        	
        	System.out.print(x + " + ");
        	suma += x;
        }
        
        System.out.println("= "  +suma);
        
        Elegir();
        
        leer.close();
        
		return num;
		
	}
	
	static void Salir () {
		System.out.println("Saliste del programa");
		System.exit(0);

		
	}
	
}

/**
 * @author Nicolay Chiazzaro
 *
 */
