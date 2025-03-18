package com.danny.java8.java8tuto;

import com.danny.java8.java8tuto.Arreglos;
import com.danny.java8.java8tuto.Pilas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import com.danny.java8.java8tuto.EjerciciosStreams;


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
		
	//	lista.forEach(System.out::println);
		
		Arreglos arreglos=new Arreglos();
		arreglos.mostrarMensaje();
		
		EjerciciosStreams ejerciciosStreams = new EjerciciosStreams();
		ejerciciosStreams.ejerciciosCurso();
	//	Pilas pilas= new Pilas();
	//	pilas.mostrarPila();
	
	}
    public static void main( String[] args )
    {
    	List numbers = Arrays.asList(7, 7, 7, 7, 2, 2, 2, 3, 3, 3, 3, 100, 100, 200, 200);
    	numbers = (List) numbers.stream().distinct().collect(Collectors.toList());
    	System.out.println(numbers);
    	App app= new App();
    	app.ordenar();
    	app.metodoNoStatico();
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
	
	public void metodoNoStatico() {
		
	//	System.out.println("Lista: " + lista);
	//    System.out.println("Números: " + numeros);
		
	}
}
