package CONTROLADOR;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import MODELO.FicheroProperties;
import VISTA.interfazMapa;

public class Controlador implements ActionListener{
	interfazMapa in=new interfazMapa();
	
	public Controlador(VISTA.interfazMapa frame) {
		this.in=frame;
		this.in.comboBox.addActionListener(this);
	}	
	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		String ciudad = (String) in.comboBox.getSelectedItem();
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
				if(conexionAlmeria.gettiempoDia().get(0).getWeather().equals("Soleado")) {in.dibujo_Almeria.setIcon(new ImageIcon("sol.png"));}
				if(conexionAlmeria.gettiempoDia().get(0).getWeather().equals("Parcialmente nuboso")) {in.dibujo_Almeria.setIcon(new ImageIcon("parciamente.png"));}
				if(conexionAlmeria.gettiempoDia().get(0).getWeather().equals("Lluvia")) {in.dibujo_Almeria.setIcon(new ImageIcon("tormenta.ong.png"));}
				if(conexionAlmeria.gettiempoDia().get(0).getWeather().equals("Muy nuboso") || conexionAlmeria.gettiempoDia().get(0).getWeather().equals("Cubierto")) {in.dibujo_Almeria.setIcon(new ImageIcon("muynuboso.png"));}
				if(conexionAlmeria.gettiempoDia().get(0).getWeather().equals("Lluvia débil")) {in.dibujo_Almeria.setIcon(new ImageIcon("debil.png"));}
				if(conexionAlmeria.gettiempoDia().get(0).getWeather().equals("Chubascos dispersos")) {in.dibujo_Almeria.setIcon(new ImageIcon("chubascos.png"));}
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
				if(conexionBurgos.gettiempoDia().get(0).getWeather().equals("Soleado")) {in.dibujo_Burgos.setIcon(new ImageIcon("sol.png"));}
				if(conexionBurgos.gettiempoDia().get(0).getWeather().equals("Parcialmente nuboso")) {in.dibujo_Burgos.setIcon(new ImageIcon("parciamente.png"));}
				if(conexionBurgos.gettiempoDia().get(0).getWeather().equals("Lluvia")) {in.dibujo_Burgos.setIcon(new ImageIcon("tormenta.ong.png"));}
				if(conexionBurgos.gettiempoDia().get(0).getWeather().equals("Muy nuboso")||conexionBurgos.gettiempoDia().get(0).getWeather().equals("Cubierto")) {in.dibujo_Burgos.setIcon(new ImageIcon("muynuboso.png"));}
				if(conexionBurgos.gettiempoDia().get(0).getWeather().equals("Lluvia débil")) {in.dibujo_Burgos.setIcon(new ImageIcon("debil.png"));}
				if(conexionBurgos.gettiempoDia().get(0).getWeather().equals("Chubascos dispersos")) {in.dibujo_Burgos.setIcon(new ImageIcon("chubascos.png"));}	
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
				if(conexionCanarias.gettiempoDia().get(0).getWeather().equals("Soleado")) {in.dibujo_Canarias.setIcon(new ImageIcon("sol.png"));}
				if(conexionCanarias.gettiempoDia().get(0).getWeather().equals("Parcialmente nuboso")) {in.dibujo_Canarias.setIcon(new ImageIcon("parciamente.png"));}
				if(conexionCanarias.gettiempoDia().get(0).getWeather().equals("Lluvia")) {in.dibujo_Canarias.setIcon(new ImageIcon("tormenta.ong.png"));}
				if(conexionCanarias.gettiempoDia().get(0).getWeather().equals("Muy nuboso") || conexionCanarias.gettiempoDia().get(0).getWeather().equals("Cubierto")) {in.dibujo_Canarias.setIcon(new ImageIcon("muynuboso.png"));}
				if(conexionCanarias.gettiempoDia().get(0).getWeather().equals("Lluvia débil")) {in.dibujo_Canarias.setIcon(new ImageIcon("debil.png"));}
				if(conexionCanarias.gettiempoDia().get(0).getWeather().equals("Chubascos dispersos")) {in.dibujo_Canarias.setIcon(new ImageIcon("chubascos.png"));}
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
				if(conexionCiudadReal.gettiempoDia().get(0).getWeather().equals("Soleado")) {in.dibujo_CiudadReal.setIcon(new ImageIcon("sol.png"));}
				if(conexionCiudadReal.gettiempoDia().get(0).getWeather().equals("Parcialmente nuboso")) {in.dibujo_CiudadReal.setIcon(new ImageIcon("parciamente.png"));}
				if(conexionCiudadReal.gettiempoDia().get(0).getWeather().equals("Lluvia")) {in.dibujo_CiudadReal.setIcon(new ImageIcon("tormenta.ong.png"));}
				if(conexionCiudadReal.gettiempoDia().get(0).getWeather().equals("Muy nuboso") || conexionCiudadReal.gettiempoDia().get(0).getWeather().equals("Cubierto")) {in.dibujo_CiudadReal.setIcon(new ImageIcon("muynuboso.png"));}
				if(conexionCiudadReal.gettiempoDia().get(0).getWeather().equals("Lluvia débil")) {in.dibujo_CiudadReal.setIcon(new ImageIcon("debil.png"));}
				if(conexionCiudadReal.gettiempoDia().get(0).getWeather().equals("Chubascos dispersos")) {in.dibujo_CiudadReal.setIcon(new ImageIcon("chubascos.png"));}
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
				if(conexionHuelva.gettiempoDia().get(0).getWeather().equals("Soleado")) {in.dibujo_Huelva.setIcon(new ImageIcon("sol.png"));}
				if(conexionHuelva.gettiempoDia().get(0).getWeather().equals("Parcialmente nuboso")) {in.dibujo_Huelva.setIcon(new ImageIcon("parciamente.png"));}
				if(conexionHuelva.gettiempoDia().get(0).getWeather().equals("Lluvia")) {in.dibujo_Huelva.setIcon(new ImageIcon("tormenta.ong.png"));}
				if(conexionHuelva.gettiempoDia().get(0).getWeather().equals("Muy nuboso") || conexionHuelva.gettiempoDia().get(0).getWeather().equals("Cubierto")) {in.dibujo_Huelva.setIcon(new ImageIcon("muynuboso.png"));}
				if(conexionHuelva.gettiempoDia().get(0).getWeather().equals("Lluvia débil")) {in.dibujo_Huelva.setIcon(new ImageIcon("debil.png"));}
				if(conexionHuelva.gettiempoDia().get(0).getWeather().equals("Chubascos dispersos")) {in.dibujo_Huelva.setIcon(new ImageIcon("chubascos.png"));}
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
				if(conexionLleida.gettiempoDia().get(0).getWeather().equals("Soleado")) {in.dibujo_Lleida.setIcon(new ImageIcon("sol.png"));}
				if(conexionLleida.gettiempoDia().get(0).getWeather().equals("Parcialmente nuboso")) {in.dibujo_Lleida.setIcon(new ImageIcon("parciamente.png"));}
				if(conexionLleida.gettiempoDia().get(0).getWeather().equals("Lluvia")) {in.dibujo_Lleida.setIcon(new ImageIcon("tormenta.ong.png"));}
				if(conexionLleida.gettiempoDia().get(0).getWeather().equals("Muy nuboso") || conexionLleida.gettiempoDia().get(0).getWeather().equals("Cubierto")) {in.dibujo_Lleida.setIcon(new ImageIcon("muynuboso.png"));}
				if(conexionLleida.gettiempoDia().get(0).getWeather().equals("Lluvia débil")) {in.dibujo_Lleida.setIcon(new ImageIcon("debil.png"));}
				if(conexionLleida.gettiempoDia().get(0).getWeather().equals("Chubascos dispersos")) {in.dibujo_Lleida.setIcon(new ImageIcon("chubascos.png"));}
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
				if(conexionLugo.gettiempoDia().get(0).getWeather().equals("Soleado")) {in.dibujo_Lugo.setIcon(new ImageIcon("sol.png"));}
				if(conexionLugo.gettiempoDia().get(0).getWeather().equals("Parcialmente nuboso")) {in.dibujo_Lugo.setIcon(new ImageIcon("parciamente.png"));}
				if(conexionLugo.gettiempoDia().get(0).getWeather().equals("Lluvia")) {in.dibujo_Lugo.setIcon(new ImageIcon("tormenta.ong.png"));}
				if(conexionLugo.gettiempoDia().get(0).getWeather().equals("Muy nuboso") || conexionLugo.gettiempoDia().get(0).getWeather().equals("Cubierto")) {in.dibujo_Lugo.setIcon(new ImageIcon("muynuboso.png"));}
				if(conexionLugo.gettiempoDia().get(0).getWeather().equals("Lluvia débil")) {in.dibujo_Lugo.setIcon(new ImageIcon("debil.png"));}
				if(conexionLugo.gettiempoDia().get(0).getWeather().equals("Chubascos dispersos")) {in.dibujo_Lugo.setIcon(new ImageIcon("chubascos.png"));}
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
				if(conexionMallorca.gettiempoDia().get(0).getWeather().equals("Soleado")) {in.dibujo_Mallorca.setIcon(new ImageIcon("sol.png"));}
				if(conexionMallorca.gettiempoDia().get(0).getWeather().equals("Parcialmente nuboso")) {in.dibujo_Mallorca.setIcon(new ImageIcon("parciamente.png"));}
				if(conexionMallorca.gettiempoDia().get(0).getWeather().equals("Lluvia")) {in.dibujo_Mallorca.setIcon(new ImageIcon("tormenta.ong.png"));}
				if(conexionMallorca.gettiempoDia().get(0).getWeather().equals("Muy nuboso") || conexionMallorca.gettiempoDia().get(0).getWeather().equals("Cubierto")) {in.dibujo_Mallorca.setIcon(new ImageIcon("muynuboso.png"));}
				if(conexionMallorca.gettiempoDia().get(0).getWeather().equals("Lluvia débil")) {in.dibujo_Mallorca.setIcon(new ImageIcon("debil.png"));}
				if(conexionMallorca.gettiempoDia().get(0).getWeather().equals("Chubascos dispersos")) {in.dibujo_Mallorca.setIcon(new ImageIcon("chubascos.png"));}
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
				if(conexionSalamanca.gettiempoDia().get(0).getWeather().equals("Soleado")) {in.dibujo_Salamanca.setIcon(new ImageIcon("sol.png"));}
				if(conexionSalamanca.gettiempoDia().get(0).getWeather().equals("Parcialmente nuboso")) {in.dibujo_Salamanca.setIcon(new ImageIcon("parciamente.png"));}
				if(conexionSalamanca.gettiempoDia().get(0).getWeather().equals("Lluvia")) {in.dibujo_Salamanca.setIcon(new ImageIcon("tormenta.ong.png"));}
				if(conexionSalamanca.gettiempoDia().get(0).getWeather().equals("Muy nuboso") || conexionSalamanca.gettiempoDia().get(0).getWeather().equals("Cubierto")) {in.dibujo_Salamanca.setIcon(new ImageIcon("muynuboso.png"));}
				if(conexionSalamanca.gettiempoDia().get(0).getWeather().equals("Lluvia débil")) {in.dibujo_Salamanca.setIcon(new ImageIcon("debil.png"));}
				if(conexionSalamanca.gettiempoDia().get(0).getWeather().equals("Chubascos dispersos")) {in.dibujo_Salamanca.setIcon(new ImageIcon("chubascos.png"));}
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
				if(conexionTeruel.gettiempoDia().get(0).getWeather().equals("Soleado")) {in.dibujoTeruel.setIcon(new ImageIcon("sol.png"));}
				if(conexionTeruel.gettiempoDia().get(0).getWeather().equals("Parcialmente nuboso")) {in.dibujoTeruel.setIcon(new ImageIcon("parciamente.png"));}
				if(conexionTeruel.gettiempoDia().get(0).getWeather().equals("Lluvia")) {in.dibujoTeruel.setIcon(new ImageIcon("tormenta.ong.png"));}
				if(conexionTeruel.gettiempoDia().get(0).getWeather().equals("Muy nuboso") || conexionTeruel.gettiempoDia().get(0).getWeather().equals("Cubierto")) {in.dibujoTeruel.setIcon(new ImageIcon("muynuboso.png"));}
				if(conexionTeruel.gettiempoDia().get(0).getWeather().equals("Lluvia débil")) {in.dibujoTeruel.setIcon(new ImageIcon("debil.png"));}
				if(conexionTeruel.gettiempoDia().get(0).getWeather().equals("Chubascos dispersos")) {in.dibujoTeruel.setIcon(new ImageIcon("chubascos.png"));}
				conexionTeruel.gettiempoDia().clear();
		     }
		} catch (Exception Mapa) {Mapa.printStackTrace();}	
	}
	@SuppressWarnings("static-access")
	public void sacarDatos(FicheroProperties ciudad) {
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
		if(ciudad.gettiempoDia().get(1).getWeather().equals("Soleado")) {in.dibujo.setIcon(new ImageIcon("sol.png"));}
		if(ciudad.gettiempoDia().get(1).getWeather().equals("Parcialmente nuboso")) {in.dibujo.setIcon(new ImageIcon("parciamente.png"));}
		if(ciudad.gettiempoDia().get(1).getWeather().equals("Lluvia")) {in.dibujo.setIcon(new ImageIcon("tormenta.ong.png"));}
		if(ciudad.gettiempoDia().get(1).getWeather().equals("Muy nuboso")||ciudad.gettiempoDia().get(1).getWeather().equals("Cubierto")) {in.dibujo.setIcon(new ImageIcon("muynuboso.png"));}
		if(ciudad.gettiempoDia().get(1).getWeather().equals("Lluvia débil")) {in.dibujo.setIcon(new ImageIcon("debil.png"));}
		if(ciudad.gettiempoDia().get(1).getWeather().equals("Chubascos dispersos")) {in.dibujo.setIcon(new ImageIcon("chubascos.png"));}
		if(ciudad.gettiempoDia().get(2).getWeather().equals("Soleado")) {in.dibujo_2.setIcon(new ImageIcon("sol.png"));}
		if(ciudad.gettiempoDia().get(2).getWeather().equals("Parcialmente nuboso")) {in.dibujo_2.setIcon(new ImageIcon("parciamente.png"));}
		if(ciudad.gettiempoDia().get(2).getWeather().equals("Lluvia")) {in.dibujo_2.setIcon(new ImageIcon("tormenta.ong.png"));}
		if(ciudad.gettiempoDia().get(2).getWeather().equals("Muy nuboso")||ciudad.gettiempoDia().get(2).getWeather().equals("Cubierto")) {in.dibujo_2.setIcon(new ImageIcon("muynuboso.png"));}
		if(ciudad.gettiempoDia().get(2).getWeather().equals("Lluvia débil")) {in.dibujo_2.setIcon(new ImageIcon("debil.png"));}
		if(ciudad.gettiempoDia().get(2).getWeather().equals("Chubascos dispersos")) {in.dibujo_2.setIcon(new ImageIcon("chubascos.png"));}
		if(ciudad.gettiempoDia().get(3).getWeather().equals("Soleado")) {in.dibujo_3.setIcon(new ImageIcon("sol.png"));}
		if(ciudad.gettiempoDia().get(3).getWeather().equals("Parcialmente nuboso")) {in.dibujo_3.setIcon(new ImageIcon("parciamente.png"));}
		if(ciudad.gettiempoDia().get(3).getWeather().equals("Lluvia")) {in.dibujo_3.setIcon(new ImageIcon("tormenta.ong.png"));}
		if(ciudad.gettiempoDia().get(3).getWeather().equals("Muy nuboso")||ciudad.gettiempoDia().get(3).getWeather().equals("Cubierto")) {in.dibujo_3.setIcon(new ImageIcon("muynuboso.png"));}
		if(ciudad.gettiempoDia().get(3).getWeather().equals("Lluvia débil")) {in.dibujo_3.setIcon(new ImageIcon("debil.png"));}
		if(ciudad.gettiempoDia().get(3).getWeather().equals("Chubascos dispersos")) {in.dibujo_3.setIcon(new ImageIcon("chubascos.png"));}
		if(ciudad.gettiempoDia().get(4).getWeather().equals("Soleado")) {in.dibujo_4.setIcon(new ImageIcon("sol.png"));}
		if(ciudad.gettiempoDia().get(4).getWeather().equals("Parcialmente nuboso")) {in.dibujo_4.setIcon(new ImageIcon("parciamente.png"));}
		if(ciudad.gettiempoDia().get(4).getWeather().equals("Lluvia")) {in.dibujo_4.setIcon(new ImageIcon("tormenta.ong.png"));}
		if(ciudad.gettiempoDia().get(4).getWeather().equals("Muy nuboso")||ciudad.gettiempoDia().get(4).getWeather().equals("Cubierto")) {in.dibujo_4.setIcon(new ImageIcon("muynuboso.png"));}
		if(ciudad.gettiempoDia().get(4).getWeather().equals("Lluvia débil")) {in.dibujo_4.setIcon(new ImageIcon("debil.png"));}
		if(ciudad.gettiempoDia().get(4).getWeather().equals("Chubascos dispersos")) {in.dibujo_4.setIcon(new ImageIcon("chubascos.png"));}
	}
}

