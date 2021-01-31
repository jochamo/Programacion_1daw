package ud7_xml;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class AparcamientosVLC_LecturaXML {

	
	//  Datos abiertos VLC
	//  http://gobiernoabierto.valencia.es/es/data/?q=
	
	
	public static void main(String[] args) {

		//1.- Descargar y crear fichero
		descargar_crear_XML();

		//2.- Mostrar información
		informacionXML();
	}

	public static void descargar_crear_XML() {

		try {			
			URL url   = new URL("http://mapas.valencia.es/lanzadera/opendata/Tra-aparcamientos/KML");
			Scanner s = new Scanner( url.openStream() );

			String fichero = "parking.xml";
			PrintWriter pw = new PrintWriter(new File(fichero));
			
			String linea;

			//Leer del scanner
			while(s.hasNext()) {

				//Leer linea del fichero de Internet
				linea = s.nextLine();

				//Escribir linea en el fichero Local
				pw.println( linea );				   
			}

			pw.close();
		}
		catch(IOException ex) {
			// there was some connection problem, or the file did not exist on the server,
			// or your URL was not in the right format.
			// think about what to do now, and put it here.
			ex.printStackTrace(); // for now, simply output it.
		}
		
	}

	public static void informacionXML() {

		try {

			File fXmlFile = new File("parking.xml");			

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			//getDocumentElement() - Accede al nodo raíz del documento
			
			//normalize() - Opcional, pero recomendado. 
			//Elimina nodos vacíos y combina adyacentes en caso de que los hubiera
			//Leer - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();
			
			//Leer elemento ROOT
			//System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			
			/*
					<origen>
						<productor>Agencia Estatal de Meteorologia - AEMET. Gobierno de España</productor>
						<web>http://www.aemet.es</web>
						<enlace>http://www.aemet.es/es/eltiempo/prediccion/municipios/paiporta-id46186</enlace>
						<language>es</language>
						<copyright>&#169; AEMET. Autorizado el uso de la informacion y su reproduccion citando a AEMET como autora de la misma.</copyright>
						<nota_legal>http://www.aemet.es/es/nota_legal</nota_legal>
					</origen>
					
					<elaborado>2018-04-19T12:44:02</elaborado>
					<nombre>Paiporta</nombre>
					<provincia>Valencia/Valencia</provincia>
			*/
		
			
			//Recuperar una lista con los elementos DIA
			NodeList listaDias = doc.getElementsByTagName("Placemark");

			//Recorrer lista de los elementos DIA
			for (int i = 0; i < listaDias.getLength(); i++) {

				System.out.println("----------------------------");
				
				Node elementoDia = listaDias.item(i);

				//Imprime el nombre del elemento actual
				//System.out.println("\nElemento actual:" + elementoDia.getNodeName());

				//
				if (elementoDia.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) elementoDia;

					//Valor del atributo 'fecha' del nodo 'dia'
					System.out.println("Fecha: " + eElement.getAttribute("fecha"));
					System.out.println("");
					
					//Estado del cielo
					NodeList cieloLista = doc.getElementsByTagName("estado_cielo");
					Node cieloNodo = cieloLista.item(2);
					Element cieloElement = (Element) cieloNodo;
					System.out.println("Estado cielo: " + cieloElement.getAttribute("descripcion") );
					System.out.println("");
										
					//Temperatura
					NodeList nTemp =  eElement.getElementsByTagName("temperatura");
					for (int j = 0; j < nTemp.getLength(); j++) {
					
						Node temperatura = nTemp.item(j);
						Element eTemp= (Element) temperatura;
						
						System.out.println("Temperatura Max: " + eTemp.getElementsByTagName("maxima").item(0).getTextContent() + "ºC" );
						System.out.println("Temperatura Min: " + eTemp.getElementsByTagName("minima").item(0).getTextContent() + "ºC" );
					}
					System.out.println("");
					
					//Humedad relativa
					NodeList nHumRel =  eElement.getElementsByTagName("humedad_relativa");
					for (int j = 0; j < nHumRel.getLength(); j++) {
					
						Node h = nHumRel.item(j);
						
						Element fff = (Element) h;
						
						System.out.println("Humedad rel Max: " + fff.getElementsByTagName("maxima").item(0).getTextContent() + "%" );
						System.out.println("Humedad rel Min: " + fff.getElementsByTagName("minima").item(0).getTextContent() + "%" );
					}
					System.out.println("");
					
					//TODO Indice ultravioleta máximo
					//<uv_max>6</uv_max>			
					//Node nRayos =  eElement.getElementsByTagName("uv_max").item(0);					
					//if (nRayos.  getNodeType() == Node.ELEMENT_NODE) {
					//	System.out.println("UV max: " + eElement.getElementsByTagName("uv_max").item(0).getTextContent() );
					//}

				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}