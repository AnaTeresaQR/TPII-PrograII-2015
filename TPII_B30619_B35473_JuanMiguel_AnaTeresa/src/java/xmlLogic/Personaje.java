package xmlLogic;


public class Personaje {

    private int id;
    private String nombre;
    private String descripcion;
    private String personalidad;
    private String foto;

    public Personaje(int id, String nombre, String descripcion, String personalidad, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.personalidad = personalidad;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", personalidad=" + personalidad + ", foto=" + foto + '}';
    }

}
