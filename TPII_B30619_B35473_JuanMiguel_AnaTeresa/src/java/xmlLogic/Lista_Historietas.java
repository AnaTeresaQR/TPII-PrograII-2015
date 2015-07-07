package xmlLogic;

import java.util.ArrayList;

public class Lista_Historietas {

    private ArrayList<Historieta> listaHistorietas;

    public Lista_Historietas() {
        listaHistorietas = new ArrayList();
    }

    public void agregar(Historieta historieta) {
        listaHistorietas.add(historieta);
    }

    public Historieta getHistorietas(int indice) {
        return listaHistorietas.get(indice);
    }

    public int size() {
        return listaHistorietas.size();
    }

    /**
     * Busca una historieta por nombre
     *
     * @return devuelve una historieta
     * @param nombre
     */
    public Historieta buscarPorNombre(String nombre) {
        for (int i = 0; i < listaHistorietas.size(); i++) {
            if (listaHistorietas.get(i).getNombre().equals(nombre)) {
                return listaHistorietas.get(i);
            }
        }
        return null;
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listaHistorietas.size(); i++) {
            sb.append(listaHistorietas.get(i)).append("\n");
        }
        return sb.toString();
    }
}
