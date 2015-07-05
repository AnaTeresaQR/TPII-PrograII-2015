package xmlLogic;

public class Cuadro {

    ImitacionHashtable<Integer, String> table;

    public Cuadro() {
        table = new ImitacionHashtable();
    }

    public void agregarPersonaje(int id, String dialogo) {
        table.put(id, dialogo);
    }

    public void setTable(ImitacionHashtable<Integer, String> table) {
        this.table = table;
    }

    public String[] obtenerPersonaje(int id) {
        String[] personaje = table.get(id).split("-");
        return personaje;
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.size(); i++) {
            sb.append("\n");
            sb.append(table.get(i));
        }
        return sb.toString();
    }

}
