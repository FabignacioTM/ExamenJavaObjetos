package com.generation.pruebauno.models;

public class Profesor extends DatosPersona{
    public String carrera;

    public Profesor() {
         super();

        
    
}

    public Profesor(String nombre, String apellido, Integer edad, String curso, String carrera) {
        super(nombre, apellido, edad, curso);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor [carrera=" + carrera + "]";
    }

    

}

