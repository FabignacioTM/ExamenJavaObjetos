package com.generation.pruebauno.models;

public class Alumno extends DatosPersona{
    public Integer promedioFinal;

    public Alumno(){
        super(); 
    
}

    public Alumno(String nombre, String apellido, Integer edad, String curso, Integer promedioFinal) {
        super(nombre, apellido, edad, curso);
        this.promedioFinal = promedioFinal;
    }

    public Integer getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(Integer promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno [promedioFinal=" + promedioFinal + "]";
    }
    
    
}