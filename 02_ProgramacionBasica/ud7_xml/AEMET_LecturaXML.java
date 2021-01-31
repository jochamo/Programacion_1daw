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

public class AEMET_LecturaXML {

	public static void main(String[] args) {

		int opcion;
		boolean opcionCorrecta;
		String localidad = "";

		while (true)		
		{	
			opcionCorrecta = true;
			
			//Mostrar por pantalla el menú
			System.out.printf("\n1.- Algemesí");
			System.out.printf("\n2.- Paiporta");
			System.out.printf("\n3.- Bilbao");
			System.out.printf("\n4.- Sevilla");
			System.out.printf("\n\n9.- Salir");
			System.out.printf("\n\nOpcion: ");

			Scanner sc = new Scanner(System.in);

			//Leer la opción escogida por el usuario
			opcion = sc.nextInt();

			switch(opcion){
			case 1: { localidad = "46029"; break; }
			case 2: { localidad = "46186"; break; }
			case 3: { localidad = "48020"; break; }
			case 4: { localidad = "41091"; break; }			
			case 9:
			{
				System.out.println("\nFIN del programa");				
				System.exit(0);
			}
			default:
			{
				System.out.printf("\n\nOpción incorrecta\n");
				opcionCorrecta = false;
				break;
			}
			}
			
			//
			if (opcionCorrecta) {
				//1.- Descargar y crear fichero
				descargar_crear_XML( localidad );
				
				//otracosa();

				//2.- Mostrar información
				informacionXML( localidad );	
			}						
		}
	}


	public static void otracosa() {

		try {			
			URL url   = new URL("http://informatica.desecundaria.com");
			Scanner s = new Scanner( url.openStream() );

			//Leer del scanner
			while(s.hasNext()) {

				//Leer linea del fichero de Internet
				System.out.println( s.nextLine() );								   
			}

		}
		catch(IOException ex) {
			ex.printStackTrace(); 
		}			

	}




	public static void descargar_crear_XML(String localidad) {

		try {			
			URL url   = new URL("http://www.aemet.es/xml/municipios/localidad_" + localidad + ".xml");
			Scanner s = new Scanner( url.openStream() );
			
			String fichero = "localidad_" + localidad + ".xml";
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

		/*

		---- Otra forma de hacer lo mismo ----

		//URL url = null;
		try {

			// Make a URL to the web page
			URL url = new URL("http://www.aemet.es/xml/municipios/localidad_46186.xml");

			// Get the input stream through URL Connection
			URLConnection con = url.openConnection();
			InputStream is    = con.getInputStream();

			// Once you have the Input Stream, it's just plain old Java IO stuff.

			// For this case, since you are interested in getting plain-text web page
			// I'll use a reader and output the text content to System.out.

			// For binary content, it's better to directly read the bytes from stream and write
			// to the target file.

			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			String line = null;

			// Read each line and write to System.out
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}			

		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		 */
	}

	public static void informacionXML(String localidad) {

		//   Datos abiertos VLC
		//   http://gobiernoabierto.valencia.es/es/data/?q=



		//   https://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/

		//   http://jmoral.es/blog/xml-dom

		//   http://programacion.jias.es/2013/03/jdom-leer-fichero-xml-desde-java/

		//   https://blogdeaitor.wordpress.com/2012/10/18/xml_java/

		//   http://lobosoft-mx.com/2016/02/26/como-leer-un-archivo-xml-en-java-con-jdom/

		try {

			File fXmlFile = new File("localidad_" + localidad + ".xml");			

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
			NodeList listaDias = doc.getElementsByTagName("dia");

			//Recorrer lista de los elementos DIA
			//for (int i = 0; i < listaDias.getLength(); i++) {
			for (int i = 0; i < 1; i++) { //esto solo muestra 1 dia...

				//System.out.println("----------------------------");

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

					//Indice ultravioleta máximo
					Node nRayos =  eElement.getElementsByTagName("uv_max").item(0);					
					System.out.println("UV max: " + eElement.getElementsByTagName("uv_max").item(0).getTextContent() );

					//TODO hacer que no de ERROR cuando un elemento NO existe !!!

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}