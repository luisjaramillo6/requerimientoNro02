package clase;

public class ComponenteEducativo {

    private String strcodigo;
    private String strnombre;
    private String strNumCreditos;

    public ComponenteEducativo(String strcodigo, String strnombre, String strNumCreditos) {
        this.strcodigo = strcodigo;
        this.strnombre = strnombre;
        this.strNumCreditos = strNumCreditos;
    }

    public String getStrcodigo() {
        return strcodigo;
    }

    public void setStrcodigo(String strcodigo) {
        this.strcodigo = strcodigo;
    }

    public String getStrnombre() {
        return strnombre;
    }

    public void setStrnombre(String strnombre) {
        this.strnombre = strnombre;
    }

    public String getStrNumCreditos() {
        return strNumCreditos;
    }

    public void setStrNumCreditos(String strNumCreditos) {
        this.strNumCreditos = strNumCreditos;
    }

    @Override
    public String toString() {
        return "Componente Educativo: " + " - Codigo: " + strcodigo + " - Nombre del Componete: " + strnombre + " - Numero de Creditos: " + strNumCreditos;
    }

}
