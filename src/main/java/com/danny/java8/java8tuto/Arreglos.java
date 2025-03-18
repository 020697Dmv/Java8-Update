package com.danny.java8.java8tuto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;


public class Arreglos {

	
	 public void mostrarMensaje() {
		 
	      //  System.out.println("Hola desde OtraClase");
	        
	        List<String> list_Strings = new ArrayList<String>();
	        list_Strings.add("Red");
	        list_Strings.add("Green");
	        list_Strings.add("Orange");
	        list_Strings.add("White");
	        list_Strings.add("Black");
	     //   System.out.println(list_Strings);
	        
	        list_Strings.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);;
	        
	        
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("blue");
	        colors.add("red");
	        colors.add("green");
	        System.out.println("ArrayList: " + colors);
	        String color = colors.remove(1);
	        System.out.println("ArrayList post Delete: " + colors);
	        System.out.println("Removed Element: " + color);
	        
	        
	        //Acceso a los elementos
	        List<String> clothes = new ArrayList<>();
	        clothes.add("jacket");
	        clothes.add("shirt");
	        clothes.add("pullover");
	        
	        List<String> nombreMayuscula=clothes.stream().map(String::toUpperCase).collect(Collectors.toList());
	        System.out.println("ArrayList en Mayuscula: " + nombreMayuscula);

	        System.out.println("ArrayList: " + clothes);
	        String str = clothes.get(2);
	        System.out.println("Element at index 2: " + str);
	        
	        
	        List<Integer> valores = Arrays.asList(1500, 200000, 2500, 35000, 4000,115000);
	        
	        //se ordenan todos los elementos
	        // [[1500, 2500, 4000, 35000, 115000, 200000]]
	        List<Integer> mayor=valores.stream().sorted().collect(Collectors.toList());
	        System.out.println("Mayor elemento at index 2: " + mayor);
	        
	        //Se suman todos los elementos
	        // 358000
	        int suma=valores.stream().reduce(0,Integer::sum);
	        System.out.println("Suma de todos los valores: " + suma);

	        int []sumaP= {0};
	        int []contadorP= {0};

	        //Calcular promerdio
	        valores.stream().forEach(
	        		valor->{
	        			sumaP[0]+=valor;
	        			contadorP[0]++;
	        		}
	        		);
	        
	        // Calculamos el promedio
	        if (contadorP[0] > 0) {
	            double promedio = (double) sumaP[0] / contadorP[0];
	            System.out.println("El promedio es: " + promedio);
	        } else {
	            System.out.println("La lista está vacía, no se puede calcular el promedio.");
	        }	
	        
	        
	        OptionalDouble promedio = valores.stream()
                    .mapToInt(Integer::intValue)
                    .average();

			if (promedio.isPresent()) {
			System.out.println("El promedio con Average es: " + promedio.getAsDouble());
			} else {
			System.out.println("La lista está vacía, no se puede calcular el promedio.");
			}
			
			
			Optional<Integer> maximo = valores.stream()
                    .max(Integer::compareTo);
			
            System.out.println("El número mayor es: " + maximo.get());
            
            Optional<Integer> minimo = valores.stream()
                    .min(Integer::compareTo);
            
            System.out.println("El número menor es: " + minimo.get());


	    }
}
