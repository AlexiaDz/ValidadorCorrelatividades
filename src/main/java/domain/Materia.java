package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private Integer codigo;
    private List<Materia> correlativas;

    public Materia(String nombre, Integer codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correlativas = new ArrayList<>();
    }

    public List<Materia> getCorrelativas() {return correlativas;}

    public void agregarCorrelativas(Materia ... materias){
        Collections.addAll(this.correlativas, materias);
    }
}
