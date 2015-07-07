package xmlLogic;

import java.util.ArrayList;

/**
 * @author @param <Claves> recibe la clave del String
 * @param <Valores> recibe el dialogo o descripción perteneciente a cada clave o
 * personaje
 */
public class ImitacionHashtable<Claves, Valores> {

    /**
     * Se crean dos listas, una que contiene las claves que corresponden a cada
     * valor. Lista valores, contiene los datos contenidas en las claves.
     */
    ArrayList<Claves> claves = new ArrayList<>();
    ArrayList<Valores> valores = new ArrayList<>();

    /**
     * Método que valida si está o no vacía la lista ImitacionHashtable
     *
     * @return true, si esta vacía, false si contiene elementos
     */
    public boolean isEmpty() {
        return claves.isEmpty() && valores.isEmpty();
    }

    /**
     * Método que verifica que el tamaño de ambas listas(claves, valores) sean
     * iguales porque de esa manera se obtiene el tamaño de la lista de
     * imitación
     *
     * @return 0, si los tamaños no son iguales, sino retorna el valor de
     * cualquiera de ambas listas, ya que son iguales
     */
    public int size() {
        if (claves.size() == valores.size()) {
            int tamanno = claves.size();
            return tamanno;
        }
        return 0;
    }

    /**
     * Método que agrega la clave y los datos Cursos a las listas
     *
     * @param clave, recibe la clave para ser agregada a la lista clave
     * @param valor, recibe los valores o datos de Cursos, para ser agregados a
     * otra lista llamada valores
     */
    public void put(Claves clave, Valores valor) {
        if (claves.isEmpty() && valores.isEmpty()) {
            claves.add(clave);
            valores.add(valor);
        } else {
            if (ClaveRepetida(clave) != true) {
                claves.add(clave);
                valores.add(valor);
            }
        }
    }

    /**
     * Método que valida la existencia de una clave repetida
     *
     * @param clave, recibe una clave para compararla con las que están en la
     * lista.
     * @return true, si la clave está repetida
     */
    public boolean ClaveRepetida(Claves clave) {
        for (int i = 0; i < claves.size(); i++) {
            if (claves.get(i) == clave) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método get, se encarga de obtener el valor asociado a una clave
     *
     * @param indice, recibe la clave o llave a la cual se le va a buscar el
     * valor asociado
     * @return devuelve el id y el dialogo del personaje
     */
    public String get(int indice) {
        return claves.get(indice) + "-" + valores.get(indice);
    }

    /**
<<<<<<< HEAD
=======
     * Obtiene una valor por indice
     */
    public Valores getValor(int i) {
        return valores.get(i);
    }

    /**
     * Obtiene una clase por indice
     */
    public Claves getClave(int i) {
        return claves.get(i);
    }

    /**
>>>>>>> origin/Rama-JSP
     * Método que verifica si existe un valor, perteneciente a una clave en la
     * lista
     *
     * @param valor, recibe un valor, es decir los datos de algún Curso
     * @return true; si encuentra el valor asociado a una clave
     */
    public boolean contains(Valores valor) {
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) == valor) {
                System.out.println("La clave asociada al valor es: " + claves.get(i));
                return true;
            }
        }
        return false;
    }

    /**
     * Método que se encarga de remover elementos en la lista
     *
     * @param clave, recibe la clave que se desea eliminar
     */
    public void remove(Claves clave) {
        for (int i = 0; i < claves.size(); i++) {
            if (claves.get(i) == clave) {
                claves.remove(i);
                valores.remove(i);
            }
        }
    }
<<<<<<< HEAD
    
    
=======
>>>>>>> origin/Rama-JSP

} // Fin de la clase
