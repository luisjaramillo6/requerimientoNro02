package clase;

import java.util.ArrayList;

public class RegistroAcademico {

    ArrayList<Persona> lstPersona = new ArrayList();

    ArrayList<ComponenteEducativo> lstComponente = new ArrayList();

    public void agregarDatos(Persona a, ComponenteEducativo b) {
        lstPersona.add(a);
        lstComponente.add(b);
    }

    public void mostrarDatos() {
        for (int i = 0; i < lstPersona.size(); i++) {
            System.out.println(lstPersona.get(i).toString() + lstComponente.get(i).toString());

        }

    }
}
