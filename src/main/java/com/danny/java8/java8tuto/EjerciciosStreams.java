package com.danny.java8.java8tuto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.Collectors;

import com.danny.java8.entity.Curso;

public class EjerciciosStreams {
	
	public void ejerciciosCurso() {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
		cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
		cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
		cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
		cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
		
		//Obtener la cantidad de cursos con una duración mayor a 5 horas.
		
		List<Curso> mayores= cursos.stream().filter(elemento->
				elemento.getDuracion()>5
				).collect(Collectors.toList());
		
		System.out.println("La cantidad de cursos con una duración mayor a 5 horas son: "+mayores.size());
		
		//Obtener la cantidad de cursos con una duración menor a 2 horas.
		List<Curso> menores= cursos.stream().filter(elemento->
		elemento.getDuracion()<2
		).collect(Collectors.toList());
		
		System.out.println("La cantidad de cursos con una duración menor a 2 horas son: "+menores.size());
		
		long cantidad = cursos.stream()
		        .filter(curso -> curso.getDuracion() < 2) // Filtra los cursos menores a 2 horas
		        .count(); // Cuenta los elementos directamente

		System.out.println("La cantidad de cursos con una duración menor a 2 horas es: " + cantidad);
		
		//Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.
		List<Curso>videosMayora5= cursos.stream().filter(elemento->
		elemento.getVideos()>50).collect(Collectors.toList());
		
		videosMayora5.stream().forEach(elementos->
		System.out.println("Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50: "+elementos.getTitulo()));
		
		List <String> titulos= cursos.stream().filter(elemento->
		elemento.getVideos()>50)
				.map(Curso::getTitulo)
				.collect(Collectors.toList());
		
		titulos.forEach(System.out::println);
		
		
		 // Obtener los 3 cursos con mayor duración usando Streams
        List<String> top3Cursos = cursos.stream()
                .sorted(Comparator.comparing(Curso::getDuracion)// Ordena de mayor a menor
                .reversed()) //Invierte el orden
                .limit(3) // Toma los primeros 3 elementos
                .map(Curso::getTitulo) // Extrae solo el título
                .collect(Collectors.toList()); // Convierte a lista

        // Imprimir los títulos en consola
        top3Cursos.forEach(curso -> System.out.println("los 3 cursos con mayor duración son: " + curso));
		
        //Mostrar en consola la duración total de todos los cursos.
        
        Optional<Float>sumaDuracion= cursos.stream()
        		.map(Curso::getDuracion)// Convertir a un stream de duracione
        		.reduce(Float::sum);
        
        System.out.println("La suma de las duraciones es: " + sumaDuracion.get());
        
      //  Mostrar en consola todos aquellos Cursos que superen el promedio en cuanto a duración se refiere.
        OptionalDouble promedio= cursos.stream()
        		.mapToDouble(Curso::getDuracion)
        		.average();
        
        double promedioCast = promedio.getAsDouble();
        System.out.println("Promedio duración de los cursos:"+promedioCast);
        cursos.stream()
        .filter(curso-> curso.getDuracion()>promedioCast)
        .forEach(System.out::println);
        
        //Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.
        cursos.stream()
        .filter(curso->curso.getAlumnos()>500)
        .map(Curso::getDuracion)
        .forEach(System.out::println);
        
        //Obtener el curso con mayor duración.
        Optional<Curso> mayorDuracion=cursos.stream().max(Comparator.comparing(Curso::getDuracion));
        
        System.out.println("El curso con mayor duración es: " + mayorDuracion.get());
        
        //Crear una lista de Strings con todos los titulos de los cursos.
        List<String> tituloCursos = cursos.stream()
        		.map(Curso::getTitulo)//Se toman solo los atributos de getTitulo
        		.collect(Collectors.toList());

        System.out.println("lista de Strings con todos los titulos de los cursos: ");
        tituloCursos.stream().forEach(System.out::println);
	}
	

}
