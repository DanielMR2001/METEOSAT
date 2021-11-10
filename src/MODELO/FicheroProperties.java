package MODELO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

public class FicheroProperties {
    
    public static void main(String[] args) throws Exception{  
    
    	Properties propiedades = new Properties();
        FileReader entrada = null;
        entrada = new FileReader("fichero.properties");
        propiedades.load(entrada);
        FicheroProperties main = new FicheroProperties ();
        
        //ALMERIA
        String tempAlmeria = propiedades.getProperty("Almeria");
        main.recogerInfoURL(tempAlmeria); 
        
        //BURGOS
        String tempBurgos = propiedades.getProperty("Burgos");
        main.recogerInfoURL(tempBurgos);
        
        //CANARIAS
        String tempCanarias = propiedades.getProperty("Canarias");
        main.recogerInfoURL(tempCanarias);
        
        //CIUDAD REAL
        String tempCiudadReal = propiedades.getProperty("CiudadReal");
        main.recogerInfoURL(tempCiudadReal);
        
        //HUELVA
        String tempHuelva = propiedades.getProperty("Huelva");
        main.recogerInfoURL(tempHuelva);
        
        //LLEIDA
        String tempLleida = propiedades.getProperty("Lleida");
        main.recogerInfoURL(tempLleida);
        
        //LUGO
        String tempLugo = propiedades.getProperty("Lugo");
        main.recogerInfoURL(tempLugo);
        
        //MALLORCA
        String tempMallorca = propiedades.getProperty("Mallorca");
        main.recogerInfoURL(tempMallorca);
        
        //SALAMANCA
        String tempSalamanca = propiedades.getProperty("Salamanca");
        main.recogerInfoURL(tempSalamanca);
         
        //TERUEL
        String  tempTeruel = propiedades.getProperty("Teruel");
        main.recogerInfoURL(tempTeruel);
    
    }
    
 public void recogerInfoURL (String temp) {
        
        try {
        	
            URL url = new URL (temp);
            URLConnection connection = (URLConnection)url.openConnection();
            connection.connect();
            Reader read = new InputStreamReader(connection.getInputStream());
            BufferedReader br = new BufferedReader(read);
            String lineaDatos = br.readLine();
            System.out.println(lineaDatos);
           
        }catch (Exception e) {  e.printStackTrace();  }
     }
  }