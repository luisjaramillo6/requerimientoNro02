package clase;

public class Alumno extends Persona {

    private String strIdAlumno;

    public Alumno(String strId, String strNombre, String strEmail, String strIdAlumno) {
        super(strId, strNombre, strEmail);
        this.strIdAlumno = strIdAlumno;
    }

    public String getStrIdAlumno() {
        return strIdAlumno;
    }

    public void setStrIdAlumno(String strIdAlumno) {
        this.strIdAlumno = strIdAlumno;
    }

    @Override
    public String toString() {
        return String.format("Alumno: %s - IdAlumno: %s\n", super.toString(), strIdAlumno);
    }

}
