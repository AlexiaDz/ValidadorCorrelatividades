package domain;

import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {

    @Test
    public void seAceptaLaInscripcion(){
      Alumno unAlumno = new Alumno("Deza","Alexia",2035625);
      Materia disenioDeSistemas = new Materia("Disenio de sistemas",123);
      Materia paradigmas = new Materia("Paradigmas",321);
      Materia algoritmos = new Materia("Algoritmos",111);
      Inscripcion inscripcion = new Inscripcion();
      unAlumno.agregarAprobadas(algoritmos,paradigmas);
      disenioDeSistemas.agregarCorrelativas(paradigmas);
      paradigmas.agregarCorrelativas(algoritmos);
      inscripcion.setAlumno(unAlumno);
      inscripcion.anotarseA(disenioDeSistemas);

        Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void noSeAceptaLaInscripcion(){
        Alumno unAlumno = new Alumno("Deza","Alexia",2035625);
        Materia disenioDeSistemas = new Materia("Disenio de sistemas",123);
        Materia paradigmas = new Materia("Paradigmas",321);
        Materia algoritmos = new Materia("Algoritmos",111);
        Inscripcion inscripcion = new Inscripcion();
        unAlumno.agregarAprobadas(algoritmos);
        disenioDeSistemas.agregarCorrelativas(paradigmas);
        paradigmas.agregarCorrelativas(algoritmos);
        inscripcion.setAlumno(unAlumno);
        inscripcion.anotarseA(disenioDeSistemas);

        Assert.assertFalse(inscripcion.aprobada());
    }
}
