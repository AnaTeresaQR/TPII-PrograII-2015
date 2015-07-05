package xmlLogic;

public class Main {

    public static void main(String[] args) {

        ManejadorXMLPersonajes xml = new ManejadorXMLPersonajes("web/xml/personajes.xml");
        xml.listaPersonajes();
        System.out.println("" + xml.imprimir());

        ManejadorXMLHistorietas xmlH = new ManejadorXMLHistorietas("web/xml/historietas.xml");
        Lista_Historietas historietas = xmlH.ListaHistorietas();
        System.out.println(historietas.getHistorietas(0).imprimirCuadros());

        System.out.println(historietas.getHistorietas(1).imprimirCuadros());

        System.out.println(historietas.getHistorietas(1).obtenerCuadro(0).obtenerPersonaje(1)[1]);

    }
}
