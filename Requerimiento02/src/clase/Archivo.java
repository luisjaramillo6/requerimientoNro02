package clase;

import java.io.*;

public class Archivo {

    public void agregarAlumno(Alumno a, ComponenteEducativo c) {
        try {
            File f = new File("Registro.csv");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("Alumno" + ";" + a.getStrId() + ";" + a.getStrNombre() + ";" + a.getStrEmail() + ";" + a.getStrIdAlumno() + ";" + ";" + c.getStrcodigo() + ";" + c.getStrnombre() + ";" + c.getStrNumCreditos());
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("Tipo;" + "Identificacion;" + "Nombre;" + "Email;" + "Id Docente/Alumno;" + "Cod. Materia;" + "Nombre Materia;" + "Creditos Materia;");
                bw.newLine();
                bw.write("Alumno" + ";" + a.getStrId() + ";" + a.getStrNombre() + ";" + a.getStrEmail() + ";" + a.getStrIdAlumno() + ";" + ";" + c.getStrcodigo() + ";" + c.getStrnombre() + ";" + c.getStrNumCreditos());

            }
            bw.close();
        } catch (Exception e) {
            System.out.println("Error en el Archivo");

        }

    }

    public void agregarDocentAuxiliar(DocenteAuxiliar a, ComponenteEducativo c) {
        try {
            File f = new File("Registro.csv");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("Docente Auxiliar" + ";" + a.getStrId() + ";" + a.getStrNombre() + ";" + a.getStrEmail() + ";" + a.getStrIdDocente() + ";" + a.getStrHorarioTutoria() + ";" + c.getStrcodigo() + ";" + c.getStrnombre() + ";" + c.getStrNumCreditos());
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("Tipo;" + "Identificacion;" + "Nombre;" + "Email;" + "Id Docente/Alumno;" + "Horario Tutoria;" + "Cod. Materia;" + "Nombre Materia;" + "Creditos Materia;");
                bw.newLine();
                bw.write("Docente Auxiliar" + ";" + a.getStrId() + ";" + a.getStrNombre() + ";" + a.getStrEmail() + ";" + a.getStrIdDocente() + ";" + a.getStrHorarioTutoria() + ";" + c.getStrcodigo() + ";" + c.getStrnombre() + ";" + c.getStrNumCreditos());

            }
            bw.close();
        } catch (Exception e) {
            System.out.println("Error en el Archivo");

        }

    }

    public void agregarDocentTitular(DocenteTitular a, ComponenteEducativo c) {
        try {
            File f = new File("Registro.csv");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("Docente Titular" + ";" + a.getStrId() + ";" + a.getStrNombre() + ";" + a.getStrEmail() + ";" + a.getStrIdDocente() + ";" + a.getStrHorarioClases() + ";" + c.getStrcodigo() + ";" + c.getStrnombre() + ";" + c.getStrNumCreditos());
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("Tipo;" + "Identificacion;" + "Nombre;" + "Email;" + "Id Docente/Alumno;" + "Horario Tutoria;" + "Cod. Materia;" + "Nombre Materia;" + "Creditos Materia;");
                bw.newLine();
                bw.write("Docente Titular" + ";" + a.getStrId() + ";" + a.getStrNombre() + ";" + a.getStrEmail() + ";" + a.getStrIdDocente() + ";" + a.getStrHorarioClases() + ";" + c.getStrcodigo() + ";" + c.getStrnombre() + ";" + c.getStrNumCreditos());

            }
            bw.close();
        } catch (Exception e) {
            System.out.println("Error en el Archivo");

        }

    }
}
