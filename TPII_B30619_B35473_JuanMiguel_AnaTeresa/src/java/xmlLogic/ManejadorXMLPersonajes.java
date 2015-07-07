package xmlLogic;

<<<<<<< HEAD
=======
import java.io.File;
>>>>>>> origin/Rama-JSP
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
<<<<<<< HEAD
=======
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
>>>>>>> origin/Rama-JSP
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
<<<<<<< HEAD
import org.w3c.dom.Document;
import org.w3c.dom.Element;
=======
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
>>>>>>> origin/Rama-JSP
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ManejadorXMLPersonajes {

    Lista_Personajes listaPersonajes;
    final String expresion = "/personajes/personaje";
    FileInputStream file;
    DocumentBuilderFactory factory;
    DocumentBuilder builder;
    Document document;
    XPath xPath;

    public ManejadorXMLPersonajes(String ruta) {
        try {
            listaPersonajes = new Lista_Personajes();
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

<<<<<<< HEAD
    public Lista_Personajes listaPersonajes() {
        try {
=======
    /**
     * Carga u archivo xml para extraer la informacion de los personajes
     *
     * @return lista con los personajes cargados
     */
    public Lista_Personajes listaPersonajes() {
        Lista_Personajes lista = new Lista_Personajes();
        try {

>>>>>>> origin/Rama-JSP
            NodeList listaNodos = (NodeList) xPath.compile(expresion).evaluate(document, XPathConstants.NODESET);
            for (int i = 0; i < listaNodos.getLength(); i++) {
                Element element = (Element) listaNodos.item(i);
                int id = Integer.parseInt(element.getAttribute("id"));
                String nombre = element.getElementsByTagName("nombre").item(0).getFirstChild().getNodeValue();
                String descripcion = element.getElementsByTagName("descripcion").item(0).getFirstChild().getNodeValue();
                String personalidad = element.getElementsByTagName("personalidad").item(0).getFirstChild().getNodeValue();
                String img = element.getElementsByTagName("img").item(0).getFirstChild().getNodeValue();
<<<<<<< HEAD
                listaPersonajes.agregar(new Personaje(id, nombre, descripcion, personalidad, img));
            }
        } catch (XPathExpressionException ex) {
            System.out.println("Error al compilar documento XML");
        }
        return listaPersonajes;
=======
                lista.agregar(new Personaje(id, nombre, descripcion, personalidad, img));
            }
        } catch (XPathExpressionException ex) {
            System.out.println("Error al compilar documento XML");
        } finally {
            this.listaPersonajes = lista;
        }
        return lista;
    }

    /**
     * Agrega un personaje al archivo xml
     *
     * @param personaje es el personaje a agregar
     * @param ruta es la dirrecion del archivo en donde sera agregado el
     * personaje
     *
     * @throws TransformerException error al guardar
     */
    public void agregarPersonaje(Personaje personaje, String ruta) throws TransformerException {

        try {

            Node root = document.getElementsByTagName("personajes").item(0);
            Element nueva = document.createElement("personaje");
            Attr id = document.createAttribute("id");
            id.setValue(listaPersonajes().size() + "");
            nueva.setAttributeNode(id);

            Element nombre = document.createElement("nombre");
            nombre.appendChild(document.createTextNode(personaje.getNombre()));
            Element descripcion = document.createElement("descripcion");
            descripcion.appendChild(document.createTextNode(personaje.getDescripcion()));
            Element personalidad = document.createElement("personalidad");
            personalidad.appendChild(document.createTextNode(personaje.getPersonalidad()));
            Element foto = document.createElement("img");
            foto.appendChild(document.createTextNode(personaje.getFoto()));

            nueva.appendChild(nombre);
            nueva.appendChild(descripcion);
            nueva.appendChild(personalidad);
            nueva.appendChild(foto);

            root.appendChild(nueva);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            StreamResult streamResult = new StreamResult(new File(ruta));
            transformer.transform(domSource, streamResult);

        } catch (TransformerException e) {
            System.err.println("ManejadorXMLPersonajes - agregarPersonaje" + e);
        }
>>>>>>> origin/Rama-JSP
    }

    public String imprimir() {
        return listaPersonajes.imprimir();
    }
<<<<<<< HEAD
=======

    public Lista_Personajes getListaPersonajes() {
        return listaPersonajes;
    }

>>>>>>> origin/Rama-JSP
}
