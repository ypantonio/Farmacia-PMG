package funcion;

import java.util.Scanner;

public class formula {
				public static void datos() {
			
			
			Scanner preguntaPeso = new Scanner(System.in);
			System.out.println("____________________________________________________");
			System.out.println("Peso: ");
			
			double peso = preguntaPeso.nextDouble();
			
			 
			Scanner datoAltura = new Scanner(System.in);
			System.out.println("Altura: ");
			double altura = datoAltura.nextDouble();
			
			double kilogramos = peso / 2.205;
			double tamaño= altura * altura;
			double resultado;
			/*DATOS DE CONVERSION*/
			resultado = kilogramos / tamaño;
			System.out.println("Tu IMC es de: " + resultado);
			
			if(resultado<=18.5) {
				System.out.println("Tu peso es inferior a lo normal."+ "\n"+" Te recomendamos ir a un nutricionista para mejorar tu salud.");
			}
			else if(resultado<=24.9) {
				System.out.println("Tu peso es normal.");
			}
			else if(resultado<=29.9) {
				System.out.println("Te encuentras en sobrepeso."+ "\n"+ "Te recomendamos mejorar tus comidas y volverlas más valanceadas.");
			}
			else if(resultado>=30.0) {
				System.out.println("Tienes obesidad."+ "\n"+ "Es recomendable ir con nutricionistas para controlar \n tu alimentación y evitar enfermedades.");
			}
	}
}
