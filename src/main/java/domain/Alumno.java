package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {

    private String apellido;
    private String nombre;
    private Integer legajo;
    private List<Materia> aprobadas;

    public Alumno(String apellido, String nombre, Integer legajo){
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
        this.aprobadas = new ArrayList<>();
    }

    public boolean estaAprobada(Materia materia){
        return aprobadas.contains(materia);
    }

    public boolean correlativasAprobadas(Materia materia){
        return materia.getCorrelativas().stream().allMatch(this::estaAprobada);
    }

    public void agregarAprobadas(Materia ... materias){
        Collections.addAll(this.aprobadas, materias);
    }

}
