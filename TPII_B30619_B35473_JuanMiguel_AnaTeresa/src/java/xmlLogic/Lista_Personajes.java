package xmlLogic;

import java.util.ArrayList;

public class Lista_Personajes {

    private ArrayList<Personaje> listaPersonajes;

    public Lista_Personajes() {
        this.listaPersonajes = new ArrayList<>();
    }

<<<<<<< HEAD
=======
    /**
     * Agrega un personaje a la lista
     *
     * @param personaje es el personaje que sera registrado
     */
>>>>>>> origin/Rama-JSP
    public void agregar(Personaje personaje) {
        listaPersonajes.add(personaje);
    }

<<<<<<< HEAD
=======
    /**
     * Indica si hay un nombre repetido en la lista de personajes
     *
     * @param nombre es el nombre del personaje que se busca
     * @return si efectivamente esta repetido
     */
>>>>>>> origin/Rama-JSP
    public boolean nombreRepetido(String nombre) {
        for (int i = 0; i < listaPersonajes.size(); i++) {
            if (nombre.equalsIgnoreCase(listaPersonajes.get(i).getNombre())) {
                return true;
            }
        }
        return false;
    }

<<<<<<< HEAD
=======
    /**
     * Obtiene la informacion de un personaje por id
     *
     * @return el personaje encontrado y sino null
     * @param id del personaje que se busca
     */
>>>>>>> origin/Rama-JSP
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

<<<<<<< HEAD
=======
    /**
     * Cantidad de personajes
     *
     * @return cantidad de personajes
     */
>>>>>>> origin/Rama-JSP
    public int size() {
        return listaPersonajes.size();
    }

<<<<<<< HEAD
=======
    /**
     * Contenido de la lista
     *
     * @return contenido de la lista
     */
>>>>>>> origin/Rama-JSP
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listaPersonajes.size(); i++) {
            sb.append(listaPersonajes.get(i)).append("\n");
        }
        return sb.toString();
    }
}
