package clase;

public class Persona {

    private String strId;
    private String strNombre;
    private String strEmail;

    public Persona(String strId, String strNombre, String strEmail) {
        this.strId = strId;
        this.strNombre = strNombre;
        this.strEmail = strEmail;
    }

    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    @Override
    public String toString() {
        return "  - Id: " + strId + " - Nombre: " + strNombre + " - Email: " + strEmail;
    }

}
