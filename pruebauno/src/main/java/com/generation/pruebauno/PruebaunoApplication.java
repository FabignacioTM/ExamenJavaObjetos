package com.generation.pruebauno;

import java.util.Scanner;  
import java.util.ArrayList;
import java.util.HashMap; 

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.pruebauno.models.Alumno;
import com.generation.pruebauno.models.Profesor;

@SpringBootApplication
public class PruebaunoApplication {

	public static Double promedioNotas(ArrayList<Double> notas){
		Double suma = 0.0; 
		for(int i = 0; i < notas.size(); i++){
			suma += notas.get(i); 
		}
		return suma/notas.size(); 
	}
	

	public static void main(String[] args) {

		
	
		Scanner teclado = new Scanner(System.in); 

		

	// Solicitamos al profesor que indique la cantidad de alumnos 

		String nombreAlum =""; 
	
		int cantidadAlum;
		int cantidadNotas;

		do{
		System.out.println("Indique la cantidad de alumnos de la clase: "); 
		cantidadAlum = teclado.nextInt();
		if(cantidadAlum<=0){
			System.out.println("La cantidad de alumnos debe ser mayor a cero, por favor vuelva a intentar");
		
		}
		}while(cantidadAlum <=0); 

		do{
		System.out.println("Indique la cantidad de notas por alumno de la clase: "); 
		cantidadNotas = teclado.nextInt();
		if(cantidadNotas<=0){
		System.out.println("La cantidad de notas debe ser mayor a cero, por favor vuelva a intentar");
		
		}
		}while(cantidadNotas <=0); 
		

		
		HashMap <String, ArrayList<Double>> LibroDeClase = new HashMap<String, ArrayList<Double>>(); 
		

		for(int i =1; i <= cantidadAlum; i++){
			teclado.nextLine(); 
			ArrayList <Double> notasAlumnos = new ArrayList<Double>(); 
			System.out.println("Ingrese el nombre del Alumno: ");
			nombreAlum = teclado.nextLine(); 
			for(int x = 1; x <= cantidadNotas; x++){
				System.out.println("Ingrese nota " +x+ " Del alumno " +nombreAlum +": ");
				Double nota = teclado.nextDouble(); 
				notasAlumnos.add(nota); 
		}
		LibroDeClase.put(nombreAlum, notasAlumnos);
	}
			for(String i : LibroDeClase.keySet()){

		
				/// Aqui se puede visualizar el arreglo de notas y alumnos 
			System.out.println("Key: "+ i  + " valor:" + LibroDeClase.get(i));
			
		}

		int opcion = 1; 

		while(opcion != 0){

			do{
				System.out.println("\n**********Aqui comienza el menú*********\n");
				System.out.println("Seleccione 1 si quiere obtener el priomedio de notas por alumno");
				System.out.println("Seleccione 2 si quiere ver el promedio de notas final de los alumnos");
				System.out.println("Seleccione 0 si quiere Salir del menú");
				System.out.println("Seleccione su opción: ");
				
				opcion = teclado.nextInt();

			}while(opcion < 0 || opcion > 4);
			
			if(opcion == 1 ){
				for(String i : LibroDeClase.keySet()){
					Double promAlum = promedioNotas(LibroDeClase.get(i)); 
					System.out.println("El promedio del Alumno: "+ i  + " Es de: " + promAlum); 
			}
		}else if(opcion == 2){
			Double sumaPromedio = 0.0;
			for(String i : LibroDeClase.keySet()){
				sumaPromedio += sumaPromedio + promedioNotas(LibroDeClase.get(i)); 
		}
			Double promedioGeneral = (sumaPromedio / cantidadAlum); 
			
			System.out.println("El promedio General es de: " + promedioGeneral); 

		}else{
			System.out.println("Gracias por su preferencia"); 
		}
	}

	

	// Creación de alumnos y profesores

	Alumno nuevoAlumno = new Alumno(); 
	Profesor nuevoProfesor = new Profesor();

	}

	
}

