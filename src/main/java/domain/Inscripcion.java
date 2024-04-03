package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {

    private Alumno alumno;

    private List<Materia> materias;

    public Inscripcion() {
        this.materias = new ArrayList<>();
    }

    public void setAlumno(Alumno alumno) { this.alumno = alumno; }

    public boolean aprobada(){
        return this.materias.stream().allMatch(this.alumno::correlativasAprobadas);
    }

    public void anotarseA(Materia ... materias){
        Collections.addAll(this.materias, materias);
    }
}
