package clase;

public class DocenteTitular extends Docente {

    private String strHorarioClases;

    public DocenteTitular(String strIdDocente, String strId, String strNombre, String strEmail, String strHorarioTutoria) {
        super(strIdDocente, strId, strNombre, strEmail);
        this.strHorarioClases = strHorarioTutoria;
    }

    public String getStrHorarioClases() {
        return strHorarioClases;
    }

    public void setStrHorarioClases(String strHorarioClases) {
        this.strHorarioClases = strHorarioClases;
    }

    @Override
    public String toString() {
        return String.format("Docente Titular: %s - Horario Clases: %s\n", super.toString(), strHorarioClases);
    }

}
