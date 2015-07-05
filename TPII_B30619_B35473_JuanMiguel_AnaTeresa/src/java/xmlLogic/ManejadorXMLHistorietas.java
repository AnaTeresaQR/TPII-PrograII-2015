package xmlLogic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ManejadorXMLHistorietas {

    Lista_Historietas listaHistorietas;
    final String expresion = "/historietas/historieta";
    FileInputStream file;
    DocumentBuilderFactory factory;
    DocumentBuilder builder;
    Document document;
    XPath xPath;

    public ManejadorXMLHistorietas(String ruta) {
        try {
            listaHistorietas = new Lista_Historietas();
            file = new FileInputStream(ruta);
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();
            document = builder.parse(file);
            xPath = XPathFactory.newInstance().newXPath();
        } catch (FileNotFoundException ex) {
            System.out.println("XML no encontrado");
        } catch (SAXException | IOException ex) {
            System.out.println("Error IO init clase ManejadorXMLPersonajes\n" + ex.getMessage());
        } catch (ParserConfigurationException ex) {
            System.out.println("Error al parsear la configuración");
        }
    }

    public Lista_Historietas ListaHistorietas() {
        try {
            NodeList listaNodos = (NodeList) xPath.compile(expresion).evaluate(document, XPathConstants.NODESET);

            Lista_Historietas lista_Historietas = new Lista_Historietas();

            // Itera entre Historieta
            for (int i = 0; i < listaNodos.getLength(); i++) {
                Historieta historieta = new Historieta();
                ArrayList<Cuadro> cuadros = new ArrayList<>();
                Element element = (Element) listaNodos.item(i);

                // Agarra el nombre
                String nombre = element.getElementsByTagName("nombre").item(0).getFirstChild().getNodeValue();
                // Agarra el autor
                String autor = element.getElementsByTagName("autor").item(0).getFirstChild().getNodeValue();
                // Agarra el resumen
                String resumen = element.getElementsByTagName("resumen").item(0).getFirstChild().getNodeValue();

                // Lista de cuadros
                NodeList cuadrosNodes = element.getElementsByTagName("cuadro");
                // Cuadro donde se colocaran los personajes y dialogos

                // Itera entre los cuadros
                for (int j = 0; j < cuadrosNodes.getLength(); j++) {
                    Cuadro cuadro = new Cuadro();
                    // Agarra un cuadro
                    Element c = (Element) cuadrosNodes.item(j);

                    // Obtiene la lista de persones
                    NodeList personajes = c.getElementsByTagName("personaje");
                    // Obtiene la lista de dialogos
                    NodeList dialogos = c.getElementsByTagName("dialogo");

                    // Obtenes todos los personajes
                    ArrayList<Integer> ids = new ArrayList<>();
                    for (int k = 0; k < personajes.getLength(); k++) {
                        Integer id = Integer.parseInt(personajes.item(k).getFirstChild().getNodeValue());
                        ids.add(id);
                    }

                    // Obtengo todos los dialogos
                    ArrayList<String> dialogs = new ArrayList<>();
                    for (int k = 0; k < dialogos.getLength(); k++) {
                        String dialog = dialogos.item(k).getFirstChild().getNodeValue();
                        dialogs.add(dialog);
                    }

                    // Lleno la tabla hash
                    cuadro.setTable(this.fillHash(ids, dialogs));
                    cuadros.add(cuadro);
                }
                historieta.setCuadros(cuadros);
                historieta.setAutor(autor);
                historieta.setNombre(nombre);
                historieta.setResumen(resumen);

                lista_Historietas.agregar(historieta);
            }

            return lista_Historietas;
        } catch (XPathExpressionException ex) {
            System.out.println("Error al compilar documento XML");
        }
        return listaHistorietas;
    }

    public String imprimir() {
        return listaHistorietas.imprimir();
    }

    private ImitacionHashtable fillHash(ArrayList<Integer> ids, ArrayList<String> dialogos) {

        ImitacionHashtable<Integer, String> ht = new ImitacionHashtable<>();

        if (ids.size() == dialogos.size()) {

            for (int i = 0; i < ids.size(); i++) {

                ht.put(ids.get(i), dialogos.get(i));
            }
            return ht;
        }
        return null;
    }

}
