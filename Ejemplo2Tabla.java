package es.Studium.Ejemplo2Tabla;

import java.util.Scanner;

public class Ejemplo2Tabla
{

	public static void main(String[] args)
	{
		final int TAM=5;
		int i;
		Scanner teclado=new Scanner(System.in);
		int tabla[] = new int[TAM];
		for (i=0;i<TAM;i++)
		{
			System.out.println("Dame el valor de tabla ["+i+"]");
			tabla[i]=teclado.nextInt();
		}
		teclado.close();
		for (i=0;i<TAM;i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
