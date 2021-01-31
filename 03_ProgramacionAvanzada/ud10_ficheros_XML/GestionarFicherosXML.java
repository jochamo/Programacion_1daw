package ud10_ficheros_XML;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.nio.charset.StandardCharsets;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GestionarFicherosXML {

	public static void guardarFicheroXML_2() {
		
		try {
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();

			// definimos el elemento raíz del documento
			Element eRaiz = doc.createElement("concesionario");
			doc.appendChild(eRaiz);

			// definimos el nodo que contendrá los elementos
			Element eCoche = doc.createElement("coche");
			eRaiz.appendChild(eCoche);

			// atributo para el nodo coche
			Attr attr = doc.createAttribute("id");
			attr.setValue("1");
			eCoche.setAttributeNode(attr);

			// definimos cada uno de los elementos y le asignamos un valor
			Element eMarca = doc.createElement("marca");
			eMarca.appendChild(doc.createTextNode("Renault"));
			eCoche.appendChild(eMarca);

			Element eModelo = doc.createElement("modelo");
			eModelo.appendChild(doc.createTextNode("Megano"));
			eCoche.appendChild(eModelo);

			Element eCilindrada = doc.createElement("cilindrada");
			eCilindrada.appendChild(doc.createTextNode("1.5"));
			eCoche.appendChild(eCilindrada);

			// clases necesarias finalizar la creación del archivo XML
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("ejercicioCoches.xml"));

			transformer.transform(source, result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean guardarFicheroXML() {

		try {
			File fileXML = new File("fichero.xml");

			FileOutputStream fos = new FileOutputStream(fileXML);
			OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
			PrintWriter output = new PrintWriter(osw, true);

			output.print("<semana primerDia='2018-11-19'>");
			output.print(" <guardia>");

			output.print(" </guardia>");
			output.print("</semana>");
			output.close();

		} catch (IOException e1) {
			return false;
		}
		return true;
	}

	public static void obtenerSemanaDeXML(File fileXML) {

		try {
			// Analizar "parsear" el documento XML
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fileXML);

			// getDocumentElement()
			// 		Accede al nodo raíz del documento

			// normalize()
			// 		La normalización es la reducción de las redundancias.
			// 		Ejemplos de redundancias:
			// 			a) espacios en blanco fuera de las etiquetas raíz / documento (... <document> </document> ...)
			// 			b) espacios en blanco dentro de la etiqueta inicial (<...>) y la etiqueta final (</ ...>)
			// 			c) espacios en blanco entre los atributos y sus valores (es decir, espacios entre el nombre de clave y = ")
			// 			d) declaraciones de espacio de nombres superfluas
			// 			e) Saltos de línea / espacios en blanco en textos de atributos y etiquetas
			// 			f) Eliminar comentarios etc ...
			// 			g) Eliminar nodos vacíos

			doc.getDocumentElement().normalize();

			// Recuperar ATRIBUTO primerDia del elemento raiz llamado SEMANA
			NodeList primerDia = doc.getElementsByTagName("semana");
			Node elementoDia = primerDia.item(0);
			Element eElementD = (Element) elementoDia;

			String dia1 = eElementD.getAttribute("primerDia");

			// Recuperar una lista con los elementos GUARDIA
			NodeList listaGuardias = doc.getElementsByTagName("guardia");

			// Recorrer lista de los elementos GUARDIA
			for (int i = 0; i < listaGuardias.getLength(); i++) {

				Node elementoGuardia = listaGuardias.item(i);
				NodeList elementosDeLaGuardia = elementoGuardia.getChildNodes();

				for (int j = 0; j < elementosDeLaGuardia.getLength(); j++) {
					// Obtener datos

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
