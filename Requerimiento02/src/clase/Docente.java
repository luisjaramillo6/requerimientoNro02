package clase;

public class Docente extends Persona {

    private String strIdDocente;

    public Docente(String strId, String strNombre, String strEmail, String strIdDocente) {
        super(strId, strNombre, strEmail);
        this.strIdDocente = strIdDocente;
    }

    public String getStrIdDocente() {
        return strIdDocente;
    }

    public void setStrIdDocente(String strIdDocente) {
        this.strIdDocente = strIdDocente;
    }

    @Override
    public String toString() {
        return String.format("%s IdDocente: %s\n", super.toString(), strIdDocente);
    }

}
