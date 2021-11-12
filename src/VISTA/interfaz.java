package VISTA;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

@SuppressWarnings("serial")
public class interfaz extends JFrame {

	public JPanel contentPane;
	public JTextField txtAlmeria;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField txtLugo;
	public JTextField txtHuelva;
	public JTextField txtLleida;
	public JTextField txtMallorca;
	public JTextField txtTeruel;
	public JTextField txtSalamanca;
	public JTextField ciudad;
	public Object comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
        interfaz frame = new interfaz();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  

}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public interfaz() {
		setResizable(false);
		
		this.setTitle("   - METEO -");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1128, 625);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 10, 834, 565);
		lblNewLabel.setBackground(Color.WHITE);
		ImageIcon icon = new ImageIcon(getClass().getResource("mapa.gif"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		contentPane.setLayout(null);
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(10);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Almeria","Burgos","Canarias","Ciudad Real","Huelva","Lleida","Lugo","Mallorca","Salamanca","Teruel"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cambiarColor=comboBox.getSelectedItem().toString();
				
				if(cambiarColor.equals("Almeria")) {   
					txtAlmeria.setBackground(Color.yellow);  
					textField_2.setBackground(Color.white);
					textField_1.setBackground(Color.white);
					textField.setBackground(Color.white);
					txtLugo.setBackground(Color.white);
					txtHuelva.setBackground(Color.white);
					txtLleida.setBackground(Color.white);
					txtMallorca.setBackground(Color.white);
					txtTeruel.setBackground(Color.white);
					txtSalamanca.setBackground(Color.white);
					ciudad.setText("ALMERIA");

				}
				
				if(cambiarColor.equals("Burgos")) {   
					txtAlmeria.setBackground(Color.white);  
					textField_2.setBackground(Color.yellow);
					textField_1.setBackground(Color.white);
					textField.setBackground(Color.white);
					txtLugo.setBackground(Color.white);
					txtHuelva.setBackground(Color.white);
					txtLleida.setBackground(Color.white);
					txtMallorca.setBackground(Color.white);
					txtTeruel.setBackground(Color.white);
					txtSalamanca.setBackground(Color.white);	
					ciudad.setText("BURGOS");

				}
				
				if(cambiarColor.equals("Canarias")) {   
					txtAlmeria.setBackground(Color.white);  
					textField_2.setBackground(Color.white);
					textField_1.setBackground(Color.yellow);
					textField.setBackground(Color.white);
					txtLugo.setBackground(Color.white);
					txtHuelva.setBackground(Color.white);
					txtLleida.setBackground(Color.white);
					txtMallorca.setBackground(Color.white);
					txtTeruel.setBackground(Color.white);
					txtSalamanca.setBackground(Color.white);	
					ciudad.setText("CANARIAS");

				}
				
				if(cambiarColor.equals("Ciudad Real")) {   
					txtAlmeria.setBackground(Color.white);  
					textField_2.setBackground(Color.white);
					textField_1.setBackground(Color.white);
					textField.setBackground(Color.yellow);
					txtLugo.setBackground(Color.white);
					txtHuelva.setBackground(Color.white);
					txtLleida.setBackground(Color.white);
					txtMallorca.setBackground(Color.white);
					txtTeruel.setBackground(Color.white);
					txtSalamanca.setBackground(Color.white);
					ciudad.setText("CIUDAD REAL");

				}
				
				if(cambiarColor.equals("Lugo")) {   
					txtAlmeria.setBackground(Color.white);  
					textField_2.setBackground(Color.white);
					textField_1.setBackground(Color.white);
					textField.setBackground(Color.white);
					txtLugo.setBackground(Color.yellow);
					txtHuelva.setBackground(Color.white);
					txtLleida.setBackground(Color.white);
					txtMallorca.setBackground(Color.white);
					txtTeruel.setBackground(Color.white);
					txtSalamanca.setBackground(Color.white);	
					ciudad.setText("LUGO");

				}
				
				if(cambiarColor.equals("Huelva")) {   
					txtAlmeria.setBackground(Color.white);  
					textField_2.setBackground(Color.white);
					textField_1.setBackground(Color.white);
					textField.setBackground(Color.white);
					txtLugo.setBackground(Color.white);
					txtHuelva.setBackground(Color.yellow);
					txtLleida.setBackground(Color.white);
					txtMallorca.setBackground(Color.white);
					txtTeruel.setBackground(Color.white);
					txtSalamanca.setBackground(Color.white);
					ciudad.setText("HUELVA");

				}			
				
				if(cambiarColor.equals("Lleida")) {   
					txtAlmeria.setBackground(Color.white);  
					textField_2.setBackground(Color.white);
					textField_1.setBackground(Color.white);
					textField.setBackground(Color.white);
					txtLugo.setBackground(Color.white);
					txtHuelva.setBackground(Color.white);
					txtLleida.setBackground(Color.yellow);
					txtMallorca.setBackground(Color.white);
					txtTeruel.setBackground(Color.white);
					txtSalamanca.setBackground(Color.white);	
					ciudad.setText("LLEIDA");

				}
				
				if(cambiarColor.equals("Mallorca")) {   
					txtAlmeria.setBackground(Color.white);  
					textField_2.setBackground(Color.white);
					textField_1.setBackground(Color.white);
					textField.setBackground(Color.white);
					txtLugo.setBackground(Color.white);
					txtHuelva.setBackground(Color.white);
					txtLleida.setBackground(Color.white);
					txtMallorca.setBackground(Color.yellow);
					txtTeruel.setBackground(Color.white);
					txtSalamanca.setBackground(Color.white);
					ciudad.setText("MALLORCA");

				}
				
				if(cambiarColor.equals("Teruel")) {   
					txtAlmeria.setBackground(Color.white);  
					textField_2.setBackground(Color.white);
					textField_1.setBackground(Color.white);
					textField.setBackground(Color.white);
					txtLugo.setBackground(Color.white);
					txtHuelva.setBackground(Color.white);
					txtLleida.setBackground(Color.white);
					txtMallorca.setBackground(Color.white);
					txtTeruel.setBackground(Color.yellow);
					txtSalamanca.setBackground(Color.white);	
					ciudad.setText("TERUEL");

				}
				
				if(cambiarColor.equals("Salamanca")) {   
					txtAlmeria.setBackground(Color.white);  
					textField_2.setBackground(Color.white);
					textField_1.setBackground(Color.white);
					textField.setBackground(Color.white);
					txtLugo.setBackground(Color.white);
					txtHuelva.setBackground(Color.white);
					txtLleida.setBackground(Color.white);
					txtMallorca.setBackground(Color.white);
					txtTeruel.setBackground(Color.white);
					txtSalamanca.setBackground(Color.yellow);	
					ciudad.setText("SALAMANCA");

				}
								

			}
		});
		comboBox.setBounds(721, 372, 99, 22);
		lblNewLabel.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBounds(849, 0, 255, 577);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "TIEMPO", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		ciudad = new JTextField();
		ciudad.setFont(new Font("Tahoma", Font.BOLD, 17));
		ciudad.setBackground(Color.WHITE);
		ciudad.setEditable(false);
		ciudad.setHorizontalAlignment(SwingConstants.CENTER);
		ciudad.setBounds(10, 23, 235, 25);
		panel.add(ciudad);
		ciudad.setColumns(10);
		
		textField_2 = new JTextField();
		lblNewLabel.add(textField_2);
		textField_2.setText("Burgos");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setBounds(400, 99, 48, 20);
		
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
		
		textField = new JTextField();
		lblNewLabel.add(textField);
		textField.setText("Ciudad Real");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(400, 320, 75, 20);
		
		txtMallorca = new JTextField();
		lblNewLabel.add(txtMallorca);
		txtMallorca.setText("Mallorca");
		txtMallorca.setHorizontalAlignment(SwingConstants.CENTER);
		txtMallorca.setEditable(false);
		txtMallorca.setBounds(737, 242, 55, 20);
		
		textField_1 = new JTextField();
		lblNewLabel.add(textField_1);
		textField_1.setText("Canarias");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setBounds(149, 511, 58, 20);
		
		txtSalamanca = new JTextField();
		lblNewLabel.add(txtSalamanca);
		txtSalamanca.setText("Salamanca");
		txtSalamanca.setHorizontalAlignment(SwingConstants.CENTER);
		txtSalamanca.setEditable(false);
		txtSalamanca.setBounds(289, 206, 75, 20);
		
	}
}
