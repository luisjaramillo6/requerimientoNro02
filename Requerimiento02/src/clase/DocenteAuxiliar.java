package clase;

public class DocenteAuxiliar extends Docente {

    private String strHorarioTutoria;

    public DocenteAuxiliar(String strHorarioTutoria, String strId, String strNombre, String strEmail, String strIdDocente) {
        super(strId, strNombre, strEmail, strIdDocente);
        this.strHorarioTutoria = strHorarioTutoria;
    }

    public String getStrHorarioTutoria() {
        return strHorarioTutoria;
    }

    public void setStrHorarioTutoria(String strHorarioTutoria) {
        this.strHorarioTutoria = strHorarioTutoria;
    }

    @Override
    public String toString() {
        return String.format("Docente Auxiliar: %s - Horario Tutoria: %s\n", super.toString(), strHorarioTutoria);
    }

}
