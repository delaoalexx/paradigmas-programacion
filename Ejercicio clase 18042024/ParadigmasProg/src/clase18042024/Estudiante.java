package clase18042024;

public class Estudiante 
{

    String nombre, apellido, carrera, turno;
    int semestre;
    static int materiasAprobadas = 0;
    boolean aprobo;
    static double promedio;
    double[] calificaciones;

    public Estudiante(String nombre, String apellido, String carrera, String turno, int semestre) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.turno = turno;
        this.semestre = semestre;
        this.calificaciones = new double[6];
    }

    public void asignarCalificacion(int i, double calificacion) 
    {
        if (i >= 0 && i < 6) {
            calificaciones[i] = calificacion;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public void aproboSemestre() 
    {
        materiasAprobadas = 0; 
        promedio = 0;

        for (double calificacion : calificaciones) 
        {
            if (calificacion > 5.9) 
            {
                materiasAprobadas++;
            }
            promedio += calificacion;
        }

        if (calificaciones.length > 0) 
        { 
            promedio /= calificaciones.length;
        }

        aprobo = materiasAprobadas == calificaciones.length && promedio >= 6.0;
    }

    public static void main(String[] args) 
    {
        Estudiante estudiante = new Estudiante("Juan", "Pérez", "Ingeniería", "Matutino", 3);

        estudiante.asignarCalificacion(0, 6);
        estudiante.asignarCalificacion(1, 6);
        estudiante.asignarCalificacion(2, 9);
        estudiante.asignarCalificacion(3, 10);
        estudiante.asignarCalificacion(4, 6);
        estudiante.asignarCalificacion(5, 10);

        estudiante.aproboSemestre();
        
        System.out.println("Materias: 6 \nCalificacion minima: 6 \nAlumno: " + 
        estudiante.nombre + " " + estudiante.apellido + " de " + estudiante.carrera + "\n");

        if (estudiante.aprobo) 
        { 
            System.out.println("El estudiante aprobó el semestre con promedio de " 
            		+ promedio + " y " + materiasAprobadas + " materias aprobadas.");
            
        } else 
        {
            System.out.println("El estudiante no aprobó el semestre con promedio de " 
            		+ promedio + " y " + materiasAprobadas + " materias aprobadas.");
        }
    }
}