package com.danny.java8.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
	
	private String titulo;
    private float duracion; 
    private int videos;
    private int alumnos;

}
