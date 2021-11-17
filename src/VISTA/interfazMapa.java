package VISTA;

import java.awt.Color;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import CONTROLADOR.Controlador;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class interfazMapa extends JFrame {

	public JPanel contentPane;
	public JTextField txtAlmeria;
	public JTextField textCiudadReal;
	public JTextField textCanarias;
	public JTextField textBurgos; 
	public JTextField txtLugo;
	public JTextField txtHuelva;
	public JTextField txtLleida;
	public JTextField txtMallorca;
	public JTextField txtTeruel;
	public JTextField txtSalamanca;
	public JTextField ciudad;
	public JPanel panel_1;
	public JPanel panel_2;
	public JPanel panel_3;
	public JPanel panel_4;
	@SuppressWarnings("rawtypes")
	public JComboBox comboBox;
	public JTextField txtTemperaturaMax1;
	public JTextField txtTemperaturaMin1;
	public JTextField fecha1;
	public JTextField Tmax1;
	public JTextField Tmin1;
	public JLabel dibujo;
	public JLabel lblNewLabel;
	public JTextField fecha2;
	public JTextField Tmax2;
	public JTextField tempMax;
	public JTextField Tmin2;
	public JTextField TempMin;
	public JTextField fecha3;
	public JTextField textField_1;
	public JTextField TEMPMax3;
	public JTextField textField_3;
	public JTextField TEMPmin3;
	public JLabel dibujo_3;
	public JTextField fecha4;
	public JTextField textField_2;
	public JTextField tempMax4;
	public JTextField textField_5;
	public JTextField tempMIn4;
	public JLabel dibujo_4;
	public JLabel dibujo_2;
	public JPanel panel;
	public JLabel dibujo_Canarias;
	public JLabel dibujo1;
	public JLabel dibujo_Burgos;
	public JLabel dibujo_Lleida;
	public JLabel dibujo_Mallorca;
	public JLabel dibujoTeruel;
	public JLabel dibujo_Salamanca;
	public JLabel dibujo_CiudadReal;
	public JLabel dibujo_Huelva;
	public JLabel dibujo_Almeria;
	public JLabel dibujo_Lugo;	
	public JComboBox diasMapa;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					interfazMapa frame = new interfazMapa();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					@SuppressWarnings("unused")
					Controlador controlador=new Controlador(frame);
	}
	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public interfazMapa() {		
		this.setTitle("   - METEO -");	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1128, 625);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 10, 834, 565);
		lblNewLabel.setBackground(Color.WHITE);
		ImageIcon icon = new ImageIcon(getClass().getResource("mapa.gif"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		contentPane.setLayout(null);
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(849, 10, 255, 567);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "TIEMPO", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		ciudad = new JTextField();
		ciudad.setFont(new Font("Tahoma", Font.BOLD, 25));
		ciudad.setBackground(Color.WHITE);
		ciudad.setEditable(false);
		ciudad.setHorizontalAlignment(SwingConstants.CENTER);
		ciudad.setBounds(10, 23, 235, 37);
		panel.add(ciudad);
		ciudad.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panel_1.setForeground(Color.BLACK);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 71, 235, 112);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtTemperaturaMax1 = new JTextField();
		txtTemperaturaMax1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		txtTemperaturaMax1.setBackground(Color.WHITE);
		txtTemperaturaMax1.setText("T\u00AA MAX");
		txtTemperaturaMax1.setBackground(Color.RED);
		txtTemperaturaMax1.setForeground(Color.WHITE);
		txtTemperaturaMax1.setHorizontalAlignment(SwingConstants.CENTER);
		txtTemperaturaMax1.setEditable(false);
		txtTemperaturaMax1.setBounds(10, 63, 106, 20);
		panel_1.add(txtTemperaturaMax1);
		
		txtTemperaturaMin1 = new JTextField();
		txtTemperaturaMin1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		txtTemperaturaMin1.setBackground(Color.WHITE);
		txtTemperaturaMin1.setText("T\u00AA MIN");
		txtTemperaturaMin1.setBackground(Color.BLUE);
		txtTemperaturaMin1.setForeground(Color.WHITE);
		txtTemperaturaMin1.setHorizontalAlignment(SwingConstants.CENTER);
		txtTemperaturaMin1.setEditable(false);
		txtTemperaturaMin1.setBounds(119, 63, 106, 20);
		panel_1.add(txtTemperaturaMin1);
		
		dibujo = new JLabel("");
		dibujo.setBounds(143, 8, 54, 52);
		panel_1.add(dibujo);
		
		fecha1 = new JTextField();
		fecha1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 21));
		fecha1.setHorizontalAlignment(SwingConstants.CENTER);
		fecha1.setEditable(false);
		fecha1.setBackground(Color.WHITE);
		fecha1.setBounds(10, 8, 106, 44);
		panel_1.add(fecha1);
		
		Tmax1 = new JTextField();
		Tmax1.setHorizontalAlignment(SwingConstants.CENTER);
		Tmax1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		Tmax1.setEditable(false);
		Tmax1.setColumns(10);
		Tmax1.setBackground(Color.WHITE);
		Tmax1.setBounds(10, 81, 106, 20);
		panel_1.add(Tmax1);
		
		Tmin1 = new JTextField();
		Tmin1.setHorizontalAlignment(SwingConstants.CENTER);
		Tmin1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		Tmin1.setEditable(false);
		Tmin1.setColumns(10);
		Tmin1.setBackground(Color.WHITE);
		Tmin1.setBounds(119, 81, 106, 20);
		panel_1.add(Tmin1);
		
		panel_2 = new JPanel();
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 194, 235, 112);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		fecha2 = new JTextField();
		fecha2.setHorizontalAlignment(SwingConstants.CENTER);
		fecha2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 21));
		fecha2.setEditable(false);
		fecha2.setBackground(Color.WHITE);
		fecha2.setBounds(10, 11, 106, 44);
		panel_2.add(fecha2);
		
		dibujo_2 = new JLabel("");
		dibujo_2.setBounds(145, 11, 54, 52);
		panel_2.add(dibujo_2);
		
		Tmax2 = new JTextField();
		Tmax2.setText("T\u00AA MAX");
		Tmax2.setHorizontalAlignment(SwingConstants.CENTER);
		Tmax2.setForeground(Color.WHITE);
		Tmax2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		Tmax2.setEditable(false);
		Tmax2.setBackground(Color.RED);
		Tmax2.setBounds(10, 66, 106, 20);
		panel_2.add(Tmax2);
		
		tempMax = new JTextField();
		tempMax.setHorizontalAlignment(SwingConstants.CENTER);
		tempMax.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		tempMax.setEditable(false);
		tempMax.setColumns(10);
		tempMax.setBackground(Color.WHITE);
		tempMax.setBounds(10, 84, 106, 18);
		panel_2.add(tempMax);
		
		Tmin2 = new JTextField();
		Tmin2.setText("T\u00AA MIN");
		Tmin2.setHorizontalAlignment(SwingConstants.CENTER);
		Tmin2.setForeground(Color.WHITE);
		Tmin2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		Tmin2.setEditable(false);
		Tmin2.setBackground(Color.BLUE);
		Tmin2.setBounds(119, 66, 106, 20);
		panel_2.add(Tmin2);
		
		TempMin = new JTextField();
		TempMin.setHorizontalAlignment(SwingConstants.CENTER);
		TempMin.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		TempMin.setEditable(false);
		TempMin.setColumns(10);
		TempMin.setBackground(Color.WHITE);
		TempMin.setBounds(119, 84, 106, 18);
		panel_2.add(TempMin);
		
		panel_3 = new JPanel();
		panel_3.setForeground(Color.BLACK);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 317, 235, 112);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		fecha3 = new JTextField();
		fecha3.setHorizontalAlignment(SwingConstants.CENTER);
		fecha3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 21));
		fecha3.setEditable(false);
		fecha3.setBackground(Color.WHITE);
		fecha3.setBounds(10, 11, 106, 44);
		panel_3.add(fecha3);
		
		textField_1 = new JTextField();
		textField_1.setText("T\u00AA MAX");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		textField_1.setEditable(false);
		textField_1.setBackground(Color.RED);
		textField_1.setBounds(10, 66, 106, 20);
		panel_3.add(textField_1);
		
		TEMPMax3 = new JTextField();
		TEMPMax3.setHorizontalAlignment(SwingConstants.CENTER);
		TEMPMax3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		TEMPMax3.setEditable(false);
		TEMPMax3.setColumns(10);
		TEMPMax3.setBackground(Color.WHITE);
		TEMPMax3.setBounds(10, 84, 106, 18);
		panel_3.add(TEMPMax3);
		
		textField_3 = new JTextField();
		textField_3.setText("T\u00AA MIN");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		textField_3.setEditable(false);
		textField_3.setBackground(Color.BLUE);
		textField_3.setBounds(119, 66, 106, 20);
		panel_3.add(textField_3);
		
		TEMPmin3 = new JTextField();
		TEMPmin3.setHorizontalAlignment(SwingConstants.CENTER);
		TEMPmin3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		TEMPmin3.setEditable(false);
		TEMPmin3.setColumns(10);
		TEMPmin3.setBackground(Color.WHITE);
		TEMPmin3.setBounds(119, 84, 106, 18);
		panel_3.add(TEMPmin3);
		
		dibujo_3 = new JLabel("");
		dibujo_3.setBounds(142, 11, 54, 52);
		panel_3.add(dibujo_3);
		
		panel_4 = new JPanel();
		panel_4.setForeground(Color.BLACK);
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 440, 235, 112);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		fecha4 = new JTextField();
		fecha4.setHorizontalAlignment(SwingConstants.CENTER);
		fecha4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 21));
		fecha4.setEditable(false);
		fecha4.setBackground(Color.WHITE);
		fecha4.setBounds(10, 11, 106, 44);
		panel_4.add(fecha4);
		
		textField_2 = new JTextField();
		textField_2.setText("T\u00AA MAX");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		textField_2.setEditable(false);
		textField_2.setBackground(Color.RED);
		textField_2.setBounds(10, 66, 106, 20);
		panel_4.add(textField_2);
		
		tempMax4 = new JTextField();
		tempMax4.setHorizontalAlignment(SwingConstants.CENTER);
		tempMax4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		tempMax4.setEditable(false);
		tempMax4.setColumns(10);
		tempMax4.setBackground(Color.WHITE);
		tempMax4.setBounds(10, 84, 106, 18);
		panel_4.add(tempMax4);
		
		textField_5 = new JTextField();
		textField_5.setText("T\u00AA MIN");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.WHITE);
		textField_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		textField_5.setEditable(false);
		textField_5.setBackground(Color.BLUE);
		textField_5.setBounds(119, 66, 106, 20);
		panel_4.add(textField_5);
		
		tempMIn4 = new JTextField();
		tempMIn4.setHorizontalAlignment(SwingConstants.CENTER);
		tempMIn4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		tempMIn4.setEditable(false);
		tempMIn4.setColumns(10);
		tempMIn4.setBackground(Color.WHITE);
		tempMIn4.setBounds(119, 84, 106, 18);
		panel_4.add(tempMIn4);
		
		dibujo_4 = new JLabel("");
		dibujo_4.setBounds(141, 11, 54, 52);
		panel_4.add(dibujo_4);
		
		textBurgos = new JTextField();
		lblNewLabel.add(textBurgos);
		textBurgos.setText("Burgos");
		textBurgos.setHorizontalAlignment(SwingConstants.CENTER);
		textBurgos.setEditable(false);
		textBurgos.setBounds(400, 99, 48, 20);
		
		txtLugo = new JTextField();
		lblNewLabel.add(txtLugo);
		txtLugo.setText("Lugo");
		txtLugo.setHorizontalAlignment(SwingConstants.CENTER);
		txtLugo.setEditable(false);
		txtLugo.setBounds(209, 53, 38, 20);
		
		txtLleida = new JTextField();
		lblNewLabel.add(txtLleida);
		txtLleida.setText("Lleida");
		txtLleida.setHorizontalAlignment(SwingConstants.CENTER);
		txtLleida.setEditable(false);
		txtLleida.setBounds(661, 119, 45, 20);
		
		txtTeruel = new JTextField();
		lblNewLabel.add(txtTeruel);
		txtTeruel.setText("Teruel");
		txtTeruel.setHorizontalAlignment(SwingConstants.CENTER);
		txtTeruel.setEditable(false);
		txtTeruel.setBounds(544, 219, 40, 20);
		
		txtHuelva = new JTextField();
		lblNewLabel.add(txtHuelva);
		txtHuelva.setText("Huelva");
		txtHuelva.setHorizontalAlignment(SwingConstants.CENTER);
		txtHuelva.setEditable(false);
		txtHuelva.setBounds(247, 408, 47, 20);
		
		txtAlmeria = new JTextField();
		lblNewLabel.add(txtAlmeria);
		txtAlmeria.setHorizontalAlignment(SwingConstants.CENTER);
		txtAlmeria.setEditable(false);
		txtAlmeria.setText("Almeria");
		txtAlmeria.setBounds(456, 429, 55, 20);
		
		textCiudadReal = new JTextField();
		lblNewLabel.add(textCiudadReal);
		textCiudadReal.setText("Ciudad Real");
		textCiudadReal.setHorizontalAlignment(SwingConstants.CENTER);
		textCiudadReal.setEditable(false);
		textCiudadReal.setBounds(400, 320, 75, 20);
		
		txtMallorca = new JTextField();
		lblNewLabel.add(txtMallorca);
		txtMallorca.setText("Mallorca");
		txtMallorca.setHorizontalAlignment(SwingConstants.CENTER);
		txtMallorca.setEditable(false);
		txtMallorca.setBounds(737, 242, 55, 20);
		
		textCanarias = new JTextField();
		lblNewLabel.add(textCanarias);
		textCanarias.setText("Canarias");
		textCanarias.setHorizontalAlignment(SwingConstants.CENTER);
		textCanarias.setEditable(false);
		textCanarias.setBounds(149, 511, 58, 20);
		
		txtSalamanca = new JTextField();
		lblNewLabel.add(txtSalamanca);
		txtSalamanca.setText("Salamanca");
		txtSalamanca.setHorizontalAlignment(SwingConstants.CENTER);
		txtSalamanca.setEditable(false);
		txtSalamanca.setBounds(289, 206, 75, 20);
		
		comboBox = new JComboBox();
		lblNewLabel.add(comboBox);
		comboBox.setMaximumRowCount(11);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Almeria", "Burgos", "Canarias", "Ciudad Real", "Huelva", "Lleida", "Lugo", "Mallorca", "Salamanca", "Teruel"}));
		comboBox.setBounds(714, 353, 99, 22);
		
		dibujo_Canarias = new JLabel("");
		dibujo_Canarias.setBounds(160, 471, 55, 49);
		lblNewLabel.add(dibujo_Canarias);
		
		dibujo_Burgos = new JLabel("");
		dibujo_Burgos.setBounds(406, 56, 55, 49);
		lblNewLabel.add(dibujo_Burgos);
		
		dibujo_Lleida = new JLabel("");
		dibujo_Lleida.setBounds(665, 77, 55, 49);
		lblNewLabel.add(dibujo_Lleida);
		
		dibujo_Mallorca = new JLabel("");
		dibujo_Mallorca.setBounds(747, 200, 55, 49);
		lblNewLabel.add(dibujo_Mallorca);
		
		dibujoTeruel = new JLabel("");
		dibujoTeruel.setBounds(546, 178, 55, 49);
		lblNewLabel.add(dibujoTeruel);
		 
		dibujo_Salamanca = new JLabel("");
		dibujo_Salamanca.setBounds(308, 165, 55, 49);
		lblNewLabel.add(dibujo_Salamanca);
		
		dibujo_CiudadReal = new JLabel("");
		dibujo_CiudadReal.setBounds(419, 279, 55, 49);
		lblNewLabel.add(dibujo_CiudadReal);
		
		dibujo_Huelva = new JLabel("");
		dibujo_Huelva.setBounds(253, 366, 55, 49);
		lblNewLabel.add(dibujo_Huelva);
		
		dibujo_Almeria = new JLabel("");
		dibujo_Almeria.setBounds(465, 389, 55, 49);
		lblNewLabel.add(dibujo_Almeria);
		
		dibujo_Lugo = new JLabel("");
		dibujo_Lugo.setBounds(210, 10, 55, 49);
		lblNewLabel.add(dibujo_Lugo);
		
		diasMapa = new JComboBox();
		lblNewLabel.add(diasMapa);
		diasMapa.setModel(new DefaultComboBoxModel(new String[] {"", "HOY", "MA\u00D1ANA", "SIGUIENTE"}));
		diasMapa.setMaximumRowCount(10);
		diasMapa.setBounds(10, 10, 99, 22);
		
	}
}
