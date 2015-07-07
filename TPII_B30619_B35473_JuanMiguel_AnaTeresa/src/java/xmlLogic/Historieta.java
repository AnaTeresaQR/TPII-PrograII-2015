package xmlLogic;

import java.util.ArrayList;

public class Historieta {

    private String nombre;
    private String autor;
    private String resumen;
    ArrayList<Cuadro> cuadros;

    public Historieta(String nombre, String autor, String resumen) {
        this.nombre = nombre;
        this.autor = autor;
        this.resumen = resumen;
        this.cuadros = new ArrayList<>();
    }

    public Historieta() {
    }

    public void setCuadros(ArrayList<Cuadro> cuadros) {
        this.cuadros = cuadros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public void agregarCuadro(Cuadro cuadro) {
        cuadros.add(cuadro);
    }

    public Cuadro obtenerCuadro(int indice) {
        return cuadros.get(indice);
    }

    public String imprimirCuadros() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cuadros.size(); i++) {
            sb.append("\n");
            sb.append(cuadros.get(i).imprimir());
        }

        return sb.toString();
    }

    public int cantidadCuadros() {
        return this.cuadros.size();
    }

    @Override
    public String toString() {
        return "Historieta{" + "nombre=" + nombre + ", autor=" + autor + ", resumen=" + resumen + ", cuadros=" + this.imprimirCuadros() + '}';
    }

}
