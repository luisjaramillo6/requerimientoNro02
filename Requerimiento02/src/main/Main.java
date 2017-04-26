package main;

import clase.Archivo;
import clase.DocenteTitular;
import clase.RegistroAcademico;
import clase.DocenteAuxiliar;
import clase.Alumno;
import clase.ComponenteEducativo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RegistroAcademico objPersona = new RegistroAcademico();
        Scanner entrada = new Scanner(System.in);

        int intOpcion, intContinuar, intClase;
        String strId = null;
        String strNombre = null;
        String strEmail = null;
        String strIdAlumno = null;
        String strCodigo = null;
        String strNombreC = null;
        String strCreditos = null;
        String strTipo = null;
        String strIdDocenteDT = null;
        String strIdDT = null;
        String strEmailDT = null;
        String strNombreDT = null;
        String strHorarioClaseDT = null;
        String strIdDocenteAX = null;
        String strIdAX = null;
        String strNombreAX = null;
        String strEmailAX = null;
        String strHorarioClaseAX = null;
        boolean blBandera = true, blBandera1 = true;
        ComponenteEducativo objComponente = new ComponenteEducativo(strCodigo, strNombreC, strCreditos);
        DocenteAuxiliar objDocenteAuxiliar = new DocenteAuxiliar(strIdAX, strNombreAX, strEmailAX, strIdDocenteAX, strHorarioClaseAX);
        DocenteTitular objDocenteTitular = new DocenteTitular(strIdDT, strNombreDT, strEmailDT, strIdDocenteDT, strHorarioClaseDT);
        Alumno objAlumno = new Alumno(strId, strNombre, strEmail, strIdAlumno);
        Archivo objArchivo = new Archivo();
        
        while (blBandera) {
            System.out.println("------ BIENVENIDO -------");
            System.out.println("Elija una opcion\n[1] Alumno\n[2] Docente ");
            intOpcion = entrada.nextInt();
            switch (intOpcion) {
                case 1:
                    entrada.nextLine();
                    System.out.println("Ingrese su Identificacion");
                    strId = entrada.nextLine();
                    objAlumno.setStrId(strId);
                    System.out.println("Ingrese su Nombre");
                    strNombre = entrada.nextLine();
                    objAlumno.setStrNombre(strNombre);
                    System.out.println("Ingrese su Email");
                    strEmail = entrada.nextLine();
                    objAlumno.setStrEmail(strEmail);
                    System.out.println("Ingrese su Identificacion de Alumno");
                    strIdAlumno = entrada.nextLine();
                    objAlumno.setStrIdAlumno(strIdAlumno);
                    while (blBandera1) {
                        System.out.println("------- REGISTRO COMPONENTE EDUCATIVOS ------");
                        System.out.println("Ingrese el Codigo de la Materia");
                        strCodigo = entrada.nextLine();
                        objComponente.setStrcodigo(strCodigo);
                        System.out.println("Ingrese el Nombre de la Materia");
                        strNombreC = entrada.nextLine();
                        objComponente.setStrnombre(strNombreC);
                        System.out.println("Ingrese el Numero de Creditos de la Materia");
                        strCreditos = entrada.nextLine();
                        objComponente.setStrNumCreditos(strCreditos);
                        objPersona.agregarDatos(objAlumno, objComponente);
                        System.out.println("Desea Agregar otra Materia\n[1] SI\n[2] NO");
                        intContinuar = entrada.nextInt();
                        entrada.nextLine();
                        if (intContinuar == 2) {
                            blBandera1 = false;
                        }
                    }
                    blBandera1 = true;
                    objArchivo.agregarAlumno(objAlumno, objComponente);
                    break;
                case 2:
                    System.out.println("Escoja un tipo de Docente\n[1] Docente Titular\n[2] Docente Auxiliar");
                    intClase = entrada.nextInt();
                    switch (intClase) {
                        case 1:
                            strTipo = "Docente Titular";
                            entrada.nextLine();
                            System.out.println("Ingrese su Identificacion");
                            strIdDT = entrada.nextLine();
                            objDocenteTitular.setStrId(strIdDT);
                            System.out.println("Ingrese su Nombre");
                            strNombreDT = entrada.nextLine();
                            objDocenteTitular.setStrNombre(strNombreDT);
                            System.out.println("Ingrese su Email");
                            strEmailDT = entrada.nextLine();
                            objDocenteTitular.setStrEmail(strEmailDT);
                            System.out.println("Ingrese su Identificacion deDocente");
                            strIdDocenteDT = entrada.nextLine();
                            objDocenteTitular.setStrIdDocente(strIdDocenteDT);
                            System.out.println("Ingrese por favor su Horario de Clase");
                            strHorarioClaseDT = entrada.nextLine();
                            objDocenteTitular.setStrHorarioClases(strHorarioClaseDT);
                            while (blBandera1) {
                                System.out.println("------- REGISTRO COMPONENTE EDUCATIVOS ------");
                                System.out.println("Ingrese el Codigo de la Materia");
                                strCodigo = entrada.nextLine();
                                objComponente.setStrcodigo(strCodigo);
                                System.out.println("Ingrese el Nombre de la Materia");
                                strNombreC = entrada.nextLine();
                                objComponente.setStrnombre(strNombreC);
                                System.out.println("Ingrese el Numero de Creditos de la Materia");
                                strCreditos = entrada.nextLine();
                                objComponente.setStrNumCreditos(strCreditos);
                                objPersona.agregarDatos(objDocenteTitular, objComponente);
                                System.out.println("Desea Agregar otra Materia\n[1] SI\n[2] NO");
                                intContinuar = entrada.nextInt();
                                entrada.nextLine();
                                if (intContinuar == 2) {
                                    objArchivo.agregarDocentTitular(objDocenteTitular, objComponente);
                                    blBandera1 = false;
                                }
                            }
                            blBandera1 = true;
                            //objArchivo.agregarDocentTitular(objDocenteTitular, objComponente);
                            break;
                        case 2:
                            strTipo = "Docente Auxiliar";
                            entrada.nextLine();
                            System.out.println("Ingrese su Identificacion");
                            strIdAX = entrada.nextLine();
                            objDocenteAuxiliar.setStrId(strIdAX);
                            System.out.println("Ingrese su Nombre");
                            strNombreAX = entrada.nextLine();
                            objDocenteAuxiliar.setStrNombre(strNombreAX);
                            System.out.println("Ingrese su Email");
                            strEmailAX = entrada.nextLine();
                            objDocenteAuxiliar.setStrEmail(strEmailAX);
                            System.out.println("Ingrese su Identificacion de Docente");
                            strIdDocenteAX = entrada.nextLine();
                            objDocenteAuxiliar.setStrIdDocente(strIdDocenteAX);
                            System.out.println("Ingrese por favor su Horario de Tutoria");
                            strHorarioClaseAX = entrada.nextLine();
                            objDocenteAuxiliar.setStrHorarioTutoria(strHorarioClaseAX);
                            while (blBandera1) {
                                System.out.println("------- REGISTRO COMPONENTE EDUCATIVOS ------");
                                System.out.println("Ingrese el Codigo de la Materia");
                                strCodigo = entrada.nextLine();
                                objComponente.setStrcodigo(strCodigo);
                                System.out.println("Ingrese el Nombre de la Materia");
                                strNombreC = entrada.nextLine();
                                objComponente.setStrnombre(strNombreC);
                                System.out.println("Ingrese el Numero de Creditos de la Materia");
                                strCreditos = entrada.nextLine();
                                objComponente.setStrNumCreditos(strCreditos);

                                objPersona.agregarDatos(objDocenteAuxiliar, objComponente);
                                System.out.println("Desea Agregar otra Materia\n[1] SI\n[2] NO");
                                intContinuar = entrada.nextInt();
                                entrada.nextLine();
                                if (intContinuar == 2) {
                                    blBandera1 = false;
                                }
                            }
                            blBandera1 = true;
                            objArchivo.agregarDocentAuxiliar(objDocenteAuxiliar, objComponente);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Desea ingresar nuevamente\n[1] SI \n[2] NO");
            intContinuar = entrada.nextInt();
            if (intContinuar == 2) {
                blBandera = false;
                System.out.println("--------- DATOS INGRESADOS -------------");
                objPersona.mostrarDatos();
                System.out.println("---------------------------------------");
            }
        }
    }
}
