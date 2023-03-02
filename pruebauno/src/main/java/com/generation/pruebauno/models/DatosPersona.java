package com.generation.pruebauno.models;

// Esta es la herencia//
public class DatosPersona {
    public String nombre;
    public String Apellido;
    public Integer edad;
    public String curso;
    public DatosPersona() {
    }
    public DatosPersona(String nombre, String apellido, Integer edad, String curso) {
        this.nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public String toString() {
        return "DatosPersona [nombre=" + nombre + ", Apellido=" + Apellido + ", edad=" + edad + ", curso=" + curso
                + "]";
    } 
    
}
