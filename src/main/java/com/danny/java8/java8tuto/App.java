package com.danny.java8.java8tuto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


/**
 * Java 8
 * @author Danny Macias Vanegas
 */
public class App 
{

    private List<String> lista;
	private List<String> numeros;
	
	public void ordenar() {
		List<String>lista= new ArrayList<>();
		lista.add("danny");
		lista.add("codigo");
		lista.add("acd");
		lista.add("bdef");
		
		//Lista en orden 
		//lista.sort((x,y)->x.compareTo(y));
		//lambda
		//Collections.sort(lista,(String p1,String p2)-> p1.compareTo(p2) );
		
		//lista.forEach(System.out::println);
		
		//lista.removeIf(x->x.equalsIgnoreCase("codigo"));
		
		lista.forEach(System.out::println);

	}
    public static void main( String[] args )
    {
    	List numbers = Arrays.asList(7, 7, 7, 7, 2, 2, 2, 3, 3, 3, 3, 100, 100, 200, 200);
    	numbers = (List) numbers.stream().distinct().collect(Collectors.toList());
    	System.out.println(numbers);
    	App app= new App();
    	app.ordenar();
    }
    
    
	public App(){
		lista = new ArrayList<>();
		lista.add("Mito");
		lista.add("Code");
		lista.add("Jaime");
		lista.add("MitoCode");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
	}
	public static void seleccion(Integer[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i; j < data.length; j++) {
				if (data[i] > data[j]) {
					Integer aux = data[j];
					data[j] = data[i];
					data[i] = aux;
				}
			}
		}
	}
	public void filtrar(){
		lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
	}
	
	public void ordenarElementos(){

		lista.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
	}
	
	public void transformar(){

		numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}
	
	public void limitar(){
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar(){
		long x = lista.stream().count();
		System.out.println(x);
	}



	public String Llenar(int num) {



		int[][] matriz1 = new int[num][num];
		int[][] D = new int[num][num];

		String pesos = "";
		String caminos = "";

		System.out.println("MATRIZ 1");


		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = (int) (Math.random() * 100 + 1);

				if (i == j) {

					matriz1[i][j] = 0;

				}

				System.out.print(matriz1[i][j] + "  ");
			}
			System.out.println();
		}

		D = matriz1;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				pesos += D[i][j] + " ";

				System.out.print(D[i][j] + "	");

			}
			pesos += "\n";
			System.out.println();

		}


		for (int k = 0; k < matriz1.length; k++) {
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1.length; j++) {

					if (matriz1[j][k] > (matriz1[i][j]) + (matriz1[k][i])) {

						matriz1[j][k] = (matriz1[i][j]) + (matriz1[k][i]);

					}

				}
			}
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				caminos += matriz1[i][j] + "  ";

				System.out.print(matriz1[i][j] + "	 ");

			}
			caminos += "\n";
			System.out.println();

		}


		return "\n la matriz generada aleatoriamente de adyacencias es :\n" + pesos
				+ " La matriz con los caminos minimos del grafo es :\n" + caminos;

	}
}
