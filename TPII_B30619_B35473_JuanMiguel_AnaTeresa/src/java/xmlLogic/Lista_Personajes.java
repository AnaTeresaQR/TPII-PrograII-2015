package xmlLogic;

import java.util.ArrayList;

public class Lista_Personajes {

    private ArrayList<Personaje> listaPersonajes;

    public Lista_Personajes() {
        this.listaPersonajes = new ArrayList<>();
    }

    public void agregar(Personaje personaje) {
        listaPersonajes.add(personaje);
    }

    public boolean nombreRepetido(String nombre) {
        for (int i = 0; i < listaPersonajes.size(); i++) {
            if (nombre.equalsIgnoreCase(listaPersonajes.get(i).getNombre())) {
                return true;
            }
        }
        return false;
    }

    public Personaje getPersonajeByid(int id) {
        for (int i = 0; i < listaPersonajes.size(); i++) {
            if (listaPersonajes.get(i).getId() == id) {
                return listaPersonajes.get(i);
            }
        }
        return null;
    }

    public Personaje getPersonajes(int indice) {
        return listaPersonajes.get(indice);
    }

    public int size() {
        return listaPersonajes.size();
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listaPersonajes.size(); i++) {
            sb.append(listaPersonajes.get(i)).append("\n");
        }
        return sb.toString();
    }
}
