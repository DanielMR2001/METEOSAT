package MODELO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Properties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class FicheroProperties {
    
     public static ArrayList<TiempoDia>tiempoDia=new ArrayList<TiempoDia>();;
        
        public static ArrayList<TiempoDia> gettiempoDia() {
            return tiempoDia;
        }

        public static void settiempoDia(ArrayList<TiempoDia>tiempoDia) {
            FicheroProperties.tiempoDia=tiempoDia;
        }

    public static void properties(String ciudad) throws IOException {    
        Properties propiedades = new Properties();
        FileReader entrada = null;
        entrada = new FileReader("fichero.properties");
        propiedades.load(entrada);
        FicheroProperties main=new FicheroProperties();
        String tempCiudad = propiedades.getProperty(ciudad);
        main.recogerInfoURL(tempCiudad);
    }

    public static void pasarGson(String datos) throws Exception {        
        Gson gson=new Gson();
        FicheroProperties conexion=new FicheroProperties();
        Ciudad ciudad=gson.fromJson(datos, Ciudad.class);
        String crearConexion="";        
        crearConexion=conexion.objetoToString(ciudad.getCity());        
        Forecast ciudad2=gson.fromJson(crearConexion, Forecast.class);
        String dias="";
        dias=conexion.objetoToString(ciudad2.getForecast());
        ListaDias ciudad3=gson.fromJson(dias, ListaDias.class);
        for(int i=0; i<ciudad3.getForecastDay().size(); i++) {
            String convertir=conexion.objetoToString(ciudad3.getForecastDay().get(i));
            TiempoDia ciudad4=gson.fromJson(convertir, TiempoDia.class);
            tiempoDia.add(ciudad4);
        }
    }
    
        public void recogerInfoURL (String temp) {      
            try {         
                URL url = new URL (temp);
                URLConnection connection = (URLConnection)url.openConnection();
                connection.connect();
                Reader read = new InputStreamReader(connection.getInputStream());
                BufferedReader br = new BufferedReader(read);
                String lineaDatos = br.readLine();
                pasarGson(lineaDatos);
            }catch (Exception e) {  e.printStackTrace();  }
        }    
  
       public String objetoToString (Object datos) throws Exception{
            String resultado="";
            try {
                ObjectMapper mapper = new ObjectMapper();
                resultado = mapper.writeValueAsString(datos);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            return resultado;
        }
}