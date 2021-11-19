package CONTROLADOR;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import MODELO.FicheroProperties;
import VISTA.interfazMapa;

public class Controlador implements ActionListener{
	interfazMapa in=new interfazMapa();
	
	public Controlador(VISTA.interfazMapa frame) {
		this.in=frame;
		this.in.comboBox.addActionListener(this);
		this.in.diasMapa.addActionListener(this);
	}	
	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		String ciudad = (String) in.comboBox.getSelectedItem();
		String dia = (String) in.diasMapa.getSelectedItem();
		try {
		if (ciudad.equals("Almeria")) {		
			FicheroProperties conexionAlmeria = new FicheroProperties();	
			in.txtAlmeria.setBackground(Color.yellow);
			in.textBurgos.setBackground(Color.white);
			in.textCanarias.setBackground(Color.white);
			in.textCiudadReal.setBackground(Color.white); 
			in.txtLugo.setBackground(Color.white);
			in.txtHuelva.setBackground(Color.white);
			in.txtLleida.setBackground(Color.white);
			in.txtMallorca.setBackground(Color.white);
			in.txtTeruel.setBackground(Color.white);
			in.txtSalamanca.setBackground(Color.white);
			in.ciudad.setText("ALMERIA");		
				conexionAlmeria.properties("Almeria");
				sacarDatos(conexionAlmeria);
				iconos(conexionAlmeria, "Almeria", in.dibujo_Almeria, 0);
				in.dibujo_Burgos.setIcon(null);in.dibujo_CiudadReal.setIcon(null);in.dibujo_Canarias.setIcon(null);in.dibujo_Lugo.setIcon(null);in.dibujo_Lleida.setIcon(null);in.dibujo_Salamanca.setIcon(null);in.dibujo_Mallorca.setIcon(null);in.dibujoTeruel.setIcon(null);in.dibujo_Huelva.setIcon(null);
				conexionAlmeria.gettiempoDia().clear();
		} else if (ciudad.equals("Burgos")) {
			FicheroProperties conexionBurgos = new FicheroProperties();
			in.txtAlmeria.setBackground(Color.white);
			in.textBurgos.setBackground(Color.yellow);
			in.textCanarias.setBackground(Color.white);
			in.textCiudadReal.setBackground(Color.white);
			in.txtLugo.setBackground(Color.white);
			in.txtHuelva.setBackground(Color.white);
			in.txtLleida.setBackground(Color.white);
			in.txtMallorca.setBackground(Color.white);
			in.txtTeruel.setBackground(Color.white);
			in.txtSalamanca.setBackground(Color.white);
			in.ciudad.setText("BURGOS");
				conexionBurgos.properties("Burgos");
				sacarDatos(conexionBurgos);	
				iconos(conexionBurgos, "Burgos", in.dibujo_Burgos, 0);
				in.dibujo_Almeria.setIcon(null);in.dibujo_CiudadReal.setIcon(null);in.dibujo_Canarias.setIcon(null);in.dibujo_Lugo.setIcon(null);in.dibujo_Lleida.setIcon(null);in.dibujo_Salamanca.setIcon(null);in.dibujo_Mallorca.setIcon(null);in.dibujoTeruel.setIcon(null);in.dibujo_Huelva.setIcon(null);
				conexionBurgos.gettiempoDia().clear();
		} else if (ciudad.equals("Canarias")) {
			FicheroProperties conexionCanarias = new FicheroProperties();
			in.txtAlmeria.setBackground(Color.white);
			in.textBurgos.setBackground(Color.white);
			in.textCanarias.setBackground(Color.yellow);
			in.textCiudadReal.setBackground(Color.white);
			in.txtLugo.setBackground(Color.white);
			in.txtHuelva.setBackground(Color.white);
			in.txtLleida.setBackground(Color.white);
			in.txtMallorca.setBackground(Color.white);
			in.txtTeruel.setBackground(Color.white);
			in.txtSalamanca.setBackground(Color.white);
			in.ciudad.setText("CANARIAS");
				conexionCanarias.properties("Canarias");
				sacarDatos(conexionCanarias);							
				iconos(conexionCanarias, "Canarias", in.dibujo_Canarias, 0);
				in.dibujo_Burgos.setIcon(null);in.dibujo_CiudadReal.setIcon(null);in.dibujo_Almeria.setIcon(null);in.dibujo_Lugo.setIcon(null);in.dibujo_Lleida.setIcon(null);in.dibujo_Salamanca.setIcon(null);in.dibujo_Mallorca.setIcon(null);in.dibujoTeruel.setIcon(null);in.dibujo_Huelva.setIcon(null);
				conexionCanarias.gettiempoDia().clear();
		} else if (ciudad.equals("Ciudad Real")) {
			FicheroProperties conexionCiudadReal = new FicheroProperties();
			in.txtAlmeria.setBackground(Color.white);
			in.textBurgos.setBackground(Color.white);
			in.textCanarias.setBackground(Color.white);
			in.textCiudadReal.setBackground(Color.yellow);
			in.txtLugo.setBackground(Color.white);
			in.txtHuelva.setBackground(Color.white);
			in.txtLleida.setBackground(Color.white);
			in.txtMallorca.setBackground(Color.white);
			in.txtTeruel.setBackground(Color.white);
			in.txtSalamanca.setBackground(Color.white);
			in.ciudad.setText("CIUDAD REAL");
				conexionCiudadReal.properties("CiudadReal");
				sacarDatos(conexionCiudadReal);				
				iconos(conexionCiudadReal, "CiudadReal", in.dibujo_CiudadReal, 0);
				in.dibujo_Burgos.setIcon(null);in.dibujo_Almeria.setIcon(null);in.dibujo_Canarias.setIcon(null);in.dibujo_Lugo.setIcon(null);in.dibujo_Lleida.setIcon(null);in.dibujo_Salamanca.setIcon(null);in.dibujo_Mallorca.setIcon(null);in.dibujoTeruel.setIcon(null);in.dibujo_Huelva.setIcon(null);
				conexionCiudadReal.gettiempoDia().clear();
		} else if (ciudad.equals("Huelva")) {
			FicheroProperties conexionHuelva = new FicheroProperties();
			in.txtAlmeria.setBackground(Color.white);
			in.textBurgos.setBackground(Color.white);
			in.textCanarias.setBackground(Color.white);
			in.textCiudadReal.setBackground(Color.white);
			in.txtLugo.setBackground(Color.white);
			in.txtHuelva.setBackground(Color.yellow);
			in.txtLleida.setBackground(Color.white);
			in.txtMallorca.setBackground(Color.white);
			in.txtTeruel.setBackground(Color.white);
			in.txtSalamanca.setBackground(Color.white);
			in.ciudad.setText("HUELVA");
				conexionHuelva.properties("Huelva");
				sacarDatos(conexionHuelva);
				iconos(conexionHuelva, "Huelva", in.dibujo_Huelva, 0);
				in.dibujo_Burgos.setIcon(null);in.dibujo_CiudadReal.setIcon(null);in.dibujo_Canarias.setIcon(null);in.dibujo_Lugo.setIcon(null);in.dibujo_Lleida.setIcon(null);in.dibujo_Salamanca.setIcon(null);in.dibujo_Mallorca.setIcon(null);in.dibujoTeruel.setIcon(null);in.dibujo_Almeria.setIcon(null);
				conexionHuelva.gettiempoDia().clear();
		} else if (ciudad.equals("Lleida")) {
			FicheroProperties conexionLleida = new FicheroProperties();
			in.txtAlmeria.setBackground(Color.white);
			in.textBurgos.setBackground(Color.white);
			in.textCanarias.setBackground(Color.white);
			in.textCiudadReal.setBackground(Color.white);
			in.txtLugo.setBackground(Color.white);
			in.txtHuelva.setBackground(Color.white);
			in.txtLleida.setBackground(Color.yellow);
			in.txtMallorca.setBackground(Color.white);
			in.txtTeruel.setBackground(Color.white);
			in.txtSalamanca.setBackground(Color.white);
			in.ciudad.setText("LLEIDA");
				conexionLleida.properties("Lleida");
				sacarDatos(conexionLleida);
				iconos(conexionLleida, "Lleida", in.dibujo_Lleida, 0);
				in.dibujo_Burgos.setIcon(null);in.dibujo_CiudadReal.setIcon(null);in.dibujo_Canarias.setIcon(null);in.dibujo_Lugo.setIcon(null);in.dibujo_Almeria.setIcon(null);in.dibujo_Salamanca.setIcon(null);in.dibujo_Mallorca.setIcon(null);in.dibujoTeruel.setIcon(null);in.dibujo_Huelva.setIcon(null);
				conexionLleida.gettiempoDia().clear();
		} else if (ciudad.equals("Lugo")) {
			FicheroProperties conexionLugo = new FicheroProperties();
			in.txtAlmeria.setBackground(Color.white);
			in.textBurgos.setBackground(Color.white);
			in.textCanarias.setBackground(Color.white);
			in.textCiudadReal.setBackground(Color.white);
			in.txtLugo.setBackground(Color.yellow);
			in.txtHuelva.setBackground(Color.white);
			in.txtLleida.setBackground(Color.white);
			in.txtMallorca.setBackground(Color.white);
			in.txtTeruel.setBackground(Color.white);
			in.txtSalamanca.setBackground(Color.white);
			in.ciudad.setText("LUGO");
				conexionLugo.properties("Lugo");
				sacarDatos(conexionLugo);
				iconos(conexionLugo, "Lugo", in.dibujo_Lugo, 0);
				in.dibujo_Burgos.setIcon(null);in.dibujo_CiudadReal.setIcon(null);in.dibujo_Canarias.setIcon(null);in.dibujo_Almeria.setIcon(null);in.dibujo_Lleida.setIcon(null);in.dibujo_Salamanca.setIcon(null);in.dibujo_Mallorca.setIcon(null);in.dibujoTeruel.setIcon(null);in.dibujo_Huelva.setIcon(null);
				conexionLugo.gettiempoDia().clear();
		} else if (ciudad.equals("Mallorca")) {
			FicheroProperties conexionMallorca = new FicheroProperties();
			in.txtAlmeria.setBackground(Color.white);
			in.textBurgos.setBackground(Color.white);
			in.textCanarias.setBackground(Color.white);
			in.textCiudadReal.setBackground(Color.white);
			in.txtLugo.setBackground(Color.white);
			in.txtHuelva.setBackground(Color.white);
			in.txtLleida.setBackground(Color.white);
			in.txtMallorca.setBackground(Color.yellow);
			in.txtTeruel.setBackground(Color.white);
			in.txtSalamanca.setBackground(Color.white);
			in.ciudad.setText("MALLORCA");
				conexionMallorca.properties("Mallorca");
				sacarDatos(conexionMallorca);
				iconos(conexionMallorca, "Mallorca", in.dibujo_Mallorca, 0);
				in.dibujo_Burgos.setIcon(null);in.dibujo_CiudadReal.setIcon(null);in.dibujo_Canarias.setIcon(null);in.dibujo_Lugo.setIcon(null);in.dibujo_Lleida.setIcon(null);in.dibujo_Salamanca.setIcon(null);in.dibujo_Almeria.setIcon(null);in.dibujoTeruel.setIcon(null);in.dibujo_Huelva.setIcon(null);
				conexionMallorca.gettiempoDia().clear();
		} else if (ciudad.equals("Salamanca")) {
			FicheroProperties conexionSalamanca = new FicheroProperties();
			in.txtAlmeria.setBackground(Color.white);
			in.textBurgos.setBackground(Color.white);
			in.textCanarias.setBackground(Color.white);
			in.textCiudadReal.setBackground(Color.white);
			in.txtLugo.setBackground(Color.white);
			in.txtHuelva.setBackground(Color.white);
			in.txtLleida.setBackground(Color.white);
			in.txtMallorca.setBackground(Color.white);
			in.txtTeruel.setBackground(Color.white);
			in.txtSalamanca.setBackground(Color.yellow);
			in.ciudad.setText("SALAMANCA");
				conexionSalamanca.properties("Salamanca");
				sacarDatos(conexionSalamanca);
				iconos(conexionSalamanca, "Salamanca", in.dibujo_Salamanca, 0);
				in.dibujo_Burgos.setIcon(null);in.dibujo_CiudadReal.setIcon(null);in.dibujo_Canarias.setIcon(null);in.dibujo_Lugo.setIcon(null);in.dibujo_Lleida.setIcon(null);in.dibujo_Almeria.setIcon(null);in.dibujo_Mallorca.setIcon(null);in.dibujoTeruel.setIcon(null);in.dibujo_Huelva.setIcon(null);
				conexionSalamanca.gettiempoDia().clear();
		} else if (ciudad.equals("Teruel")) {
			FicheroProperties conexionTeruel = new FicheroProperties();
			in.txtAlmeria.setBackground(Color.white);
			in.textBurgos.setBackground(Color.white);
			in.textCanarias.setBackground(Color.white);
			in.textCiudadReal.setBackground(Color.white);
			in.txtLugo.setBackground(Color.white);
			in.txtHuelva.setBackground(Color.white);
			in.txtLleida.setBackground(Color.white);
			in.txtMallorca.setBackground(Color.white);
			in.txtTeruel.setBackground(Color.yellow);
			in.txtSalamanca.setBackground(Color.white);
			in.ciudad.setText("TERUEL");
				conexionTeruel.properties("Teruel");
				sacarDatos(conexionTeruel);
				iconos(conexionTeruel, "Teruel", in.dibujoTeruel, 0);
				in.dibujo_Burgos.setIcon(null);in.dibujo_CiudadReal.setIcon(null);in.dibujo_Canarias.setIcon(null);in.dibujo_Lugo.setIcon(null);in.dibujo_Lleida.setIcon(null);in.dibujo_Salamanca.setIcon(null);in.dibujo_Mallorca.setIcon(null);in.dibujo_Almeria.setIcon(null);in.dibujo_Huelva.setIcon(null);
				conexionTeruel.gettiempoDia().clear();
		     }
		if(dia.equals("HOY")) {diasMapa(0);}
		if(dia.equals("MAÑANA")) {diasMapa(1);}
		if(dia.equals("SIGUIENTE")) {diasMapa(2);}
		} catch (Exception Mapa) {Mapa.printStackTrace();}	
	}
	@SuppressWarnings("static-access")
	public void sacarDatos(FicheroProperties ciudad) throws IOException {
		in.fecha1.setText(ciudad.gettiempoDia().get(1).getForecastDate());
		in.Tmin1.setText(ciudad.gettiempoDia().get(1).getMinTemp());
		in.Tmax1.setText(ciudad.gettiempoDia().get(1).getMaxTemp());
		in.dibujo.setText(ciudad.gettiempoDia().get(1).getWeather());
		in.fecha2.setText(ciudad.gettiempoDia().get(2).getForecastDate());
		in.TempMin.setText(ciudad.gettiempoDia().get(2).getMinTemp());
		in.tempMax.setText(ciudad.gettiempoDia().get(2).getMaxTemp());
		in.dibujo_2.setText(ciudad.gettiempoDia().get(2).getWeather());
		in.fecha3.setText(ciudad.gettiempoDia().get(3).getForecastDate());
		in.TEMPmin3.setText(ciudad.gettiempoDia().get(3).getMinTemp());
		in.TEMPMax3.setText(ciudad.gettiempoDia().get(3).getMaxTemp());
		in.dibujo_3.setText(ciudad.gettiempoDia().get(3).getWeather());
		in.fecha4.setText(ciudad.gettiempoDia().get(4).getForecastDate());
		in.tempMIn4.setText(ciudad.gettiempoDia().get(4).getMinTemp());
		in.tempMax4.setText(ciudad.gettiempoDia().get(4).getMaxTemp());
		in.dibujo_4.setText(ciudad.gettiempoDia().get(4).getWeather());
		informacion(ciudad,in.dibujo, 1);
		informacion(ciudad,in.dibujo_2, 2);
		informacion(ciudad,in.dibujo_3, 3);
		informacion(ciudad,in.dibujo_4, 4);
	}
	public void diasMapa(int dia) throws IOException {
		FicheroProperties conexionMapaAlmeria = new FicheroProperties();	
		iconos(conexionMapaAlmeria, "Almeria", in.dibujo_Almeria, dia);	
		FicheroProperties conexionMapaBurgos = new FicheroProperties();	
		iconos(conexionMapaBurgos, "Burgos", in.dibujo_Burgos, dia);	
		FicheroProperties conexionMapaCanarias = new FicheroProperties();
		iconos(conexionMapaCanarias, "Canarias", in.dibujo_Canarias, dia);	
		FicheroProperties conexionMapaCiudadReal = new FicheroProperties();	
		iconos(conexionMapaCiudadReal, "CiudadReal", in.dibujo_CiudadReal, dia);	
		FicheroProperties conexionMapaHuelva = new FicheroProperties();	
		iconos(conexionMapaHuelva, "Huelva", in.dibujo_Huelva, dia);	
		FicheroProperties conexionMapaLleida = new FicheroProperties();	
		iconos(conexionMapaLleida, "Lleida", in.dibujo_Lleida, dia);	
		FicheroProperties conexionMapaLugo = new FicheroProperties();
		iconos(conexionMapaLugo, "Lugo", in.dibujo_Lugo, dia);	
		FicheroProperties conexionMapaSalamanca = new FicheroProperties();	
		iconos(conexionMapaSalamanca, "Salamanca", in.dibujo_Salamanca, dia);	
		FicheroProperties conexionMapaTeruel = new FicheroProperties();	
		iconos(conexionMapaTeruel, "Teruel", in.dibujoTeruel, dia);	
		FicheroProperties conexionMapaMallorca = new FicheroProperties();
		iconos(conexionMapaMallorca, "Mallorca", in.dibujo_Mallorca, dia);	
	  }
	@SuppressWarnings("static-access")
	public void iconos(FicheroProperties conexion, String ciudad, JLabel conexionCiudad, int dia) throws IOException {
		conexion.properties(ciudad);
		if(conexion.gettiempoDia().get(dia).getWeather().equals("Soleado")) {conexionCiudad.setIcon(new ImageIcon("sol.png"));}
		if(conexion.gettiempoDia().get(dia).getWeather().equals("Parcialmente nuboso")||conexion.gettiempoDia().get(dia).getWeather().equals("Intervalos de sol")) {conexionCiudad.setIcon(new ImageIcon("parciamente.png"));}
		if(conexion.gettiempoDia().get(dia).getWeather().equals("Lluvia")) {conexionCiudad.setIcon(new ImageIcon("tormenta.ong.png"));}
		if(conexion.gettiempoDia().get(dia).getWeather().equals("Muy nuboso") || conexion.gettiempoDia().get(dia).getWeather().equals("Cubierto")) {conexionCiudad.setIcon(new ImageIcon("muynuboso.png"));}
		if(conexion.gettiempoDia().get(dia).getWeather().equals("Lluvia débil")) {conexionCiudad.setIcon(new ImageIcon("debil.png"));}
		if(conexion.gettiempoDia().get(dia).getWeather().equals("Chubascos dispersos")) {conexionCiudad.setIcon(new ImageIcon("chubascos.png"));}
		if(conexion.gettiempoDia().get(dia).getWeather().equals("Nieve")) {conexionCiudad.setIcon(new ImageIcon("nieve.png"));}
		conexion.gettiempoDia().clear();
	}
	@SuppressWarnings("static-access")
	public void informacion(FicheroProperties ciudad, JLabel dibujo, int dia) {
		if(ciudad.gettiempoDia().get(dia).getWeather().equals("Soleado")) {dibujo.setIcon(new ImageIcon("sol.png"));}
		if(ciudad.gettiempoDia().get(dia).getWeather().equals("Parcialmente nuboso")||ciudad.gettiempoDia().get(dia).getWeather().equals("Intervalos de sol")) {dibujo.setIcon(new ImageIcon("parciamente.png"));}
		if(ciudad.gettiempoDia().get(dia).getWeather().equals("Lluvia")) {dibujo.setIcon(new ImageIcon("tormenta.ong.png"));}
		if(ciudad.gettiempoDia().get(dia).getWeather().equals("Muy nuboso")||ciudad.gettiempoDia().get(dia).getWeather().equals("Cubierto")) {dibujo.setIcon(new ImageIcon("muynuboso.png"));}
		if(ciudad.gettiempoDia().get(dia).getWeather().equals("Lluvia débil")) {dibujo.setIcon(new ImageIcon("debil.png"));}
		if(ciudad.gettiempoDia().get(dia).getWeather().equals("Chubascos dispersos")) {dibujo.setIcon(new ImageIcon("chubascos.png"));}
		if(ciudad.gettiempoDia().get(dia).getWeather().equals("Nieve")) {dibujo.setIcon(new ImageIcon("nieve.png"));}
	}
}