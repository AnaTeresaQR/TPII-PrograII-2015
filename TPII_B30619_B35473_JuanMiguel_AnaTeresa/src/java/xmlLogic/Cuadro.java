package xmlLogic;

/**
 * Clase que se encarga del manejo de la Imitación de Hashtable para almacenar
 * tanto el id del personaje como el diálogo
 *
 * @author Juan Miguel Arias Mejias
 * @author Ana Teresa Quesada Ramirez
 */
public class Cuadro {

    ImitacionHashtable<Integer, String> table;

    public Cuadro() {
        table = new ImitacionHashtable();
    }

    /**
     * Agrega un personaje con diálogo a la imitación de hash
     *
     * @param id número del personaje
     * @param dialogo diálogo de cada personaje
     */
    public void agregarPersonaje(int id, String dialogo) {
        table.put(id, dialogo);
    }

    /**
     * Se encarga de setear la tabla
     *
     * @param table recibe la tabla hash
     */
    public void setTable(ImitacionHashtable<Integer, String> table) {
        this.table = table;
    }

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
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.size(); i++) {
            sb.append("\n");
            sb.append(table.get(i));
        }
        return sb.toString();
    }

}
