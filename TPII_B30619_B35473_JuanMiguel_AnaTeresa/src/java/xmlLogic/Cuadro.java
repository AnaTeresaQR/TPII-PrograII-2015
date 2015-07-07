package xmlLogic;

<<<<<<< HEAD
=======
/**
 * Clase que se encarga del manejo de la Imitación de Hashtable para almacenar
 * tanto el id del personaje como el diálogo
 *
 * @author Juan Miguel Arias Mejias
 * @author Ana Teresa Quesada Ramirez
 */
>>>>>>> origin/Rama-JSP
public class Cuadro {

    ImitacionHashtable<Integer, String> table;

    public Cuadro() {
        table = new ImitacionHashtable();
    }

<<<<<<< HEAD
=======
    /**
     * Agrega un personaje con diálogo a la imitación de hash
     *
     * @param id número del personaje
     * @param dialogo diálogo de cada personaje
     */
>>>>>>> origin/Rama-JSP
    public void agregarPersonaje(int id, String dialogo) {
        table.put(id, dialogo);
    }

<<<<<<< HEAD
=======
    /**
     * Se encarga de setear la tabla
     *
     * @param table recibe la tabla hash
     */
>>>>>>> origin/Rama-JSP
    public void setTable(ImitacionHashtable<Integer, String> table) {
        this.table = table;
    }

<<<<<<< HEAD
    public String[] obtenerPersonaje(int id) {
        String[] personaje = table.get(id).split("-");
        return personaje;
    }

=======
    /**
     * Obtiene las direcciones de las imagenes de los personajes de un cuadro
     *
     * @return el vector con los id de los personajes
     */
    public int[] obtenerPersonaje() {
        int[] personaje = new int[table.size()];
        for (int i = 0; i < table.size(); i++) {
            personaje[i] = table.getClave(i);
        }

        return personaje;
    }

    /**
     * Obtiene los dialogos de las imagenes de los personajes de un cuadro
     *
     * @return el vector con los diálogos
     */
    public String[] obtenerDialogos() {
        String[] dialogos = new String[table.size()];
        for (int i = 0; i < table.size(); i++) {
            dialogos[i] = table.getValor(i);
        }

        return dialogos;
    }

    /**
     * Método que imprime el contenido
     *
     * @return la hilera con la tabla con diálogos y con los id del personaje
     */
>>>>>>> origin/Rama-JSP
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.size(); i++) {
            sb.append("\n");
            sb.append(table.get(i));
        }
        return sb.toString();
    }

}
