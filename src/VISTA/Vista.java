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

@SuppressWarnings("serial")
public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField txtAlmeria;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtLugo;
	private JTextField txtHuelva;
	private JTextField txtLleida;
	private JTextField txtMallorca;
	private JTextField txtTeruel;
	private JTextField txtSalamanca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Vista() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 625);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 844, 596);
		ImageIcon icon = new ImageIcon(getClass().getResource("mapa.gif"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
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
				}
				
				
				//holla
				

			}
		});
		comboBox.setBounds(721, 372, 99, 22);
		lblNewLabel.add(comboBox);
		
		txtAlmeria = new JTextField();
		lblNewLabel.add(txtAlmeria);
		txtAlmeria.setHorizontalAlignment(SwingConstants.CENTER);
		txtAlmeria.setEditable(false);
		txtAlmeria.setText("Almeria");
		txtAlmeria.setBounds(457, 445, 55, 20);
		
		textField_2 = new JTextField();
		lblNewLabel.add(textField_2);
		textField_2.setText("Burgos");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setBounds(396, 92, 48, 20);
		
		textField_1 = new JTextField();
		lblNewLabel.add(textField_1);
		textField_1.setText("Canarias");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setBounds(142, 536, 58, 20);
		
		textField = new JTextField();
		lblNewLabel.add(textField);
		textField.setText("Ciudad Real");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(391, 331, 75, 20);
		
		txtLugo = new JTextField();
		lblNewLabel.add(txtLugo);
		txtLugo.setText("Lugo");
		txtLugo.setHorizontalAlignment(SwingConstants.CENTER);
		txtLugo.setEditable(false);
		txtLugo.setBounds(208, 51, 38, 20);
		
		txtHuelva = new JTextField();
		txtHuelva.setText("Huelva");
		txtHuelva.setHorizontalAlignment(SwingConstants.CENTER);
		txtHuelva.setEditable(false);
		txtHuelva.setBounds(241, 424, 47, 20);
		lblNewLabel.add(txtHuelva);
		
		txtLleida = new JTextField();
		txtLleida.setText("Lleida");
		txtLleida.setHorizontalAlignment(SwingConstants.CENTER);
		txtLleida.setEditable(false);
		txtLleida.setBounds(657, 116, 45, 20);
		lblNewLabel.add(txtLleida);
		
		txtMallorca = new JTextField();
		lblNewLabel.add(txtMallorca);
		txtMallorca.setText("Mallorca");
		txtMallorca.setHorizontalAlignment(SwingConstants.CENTER);
		txtMallorca.setEditable(false);
		txtMallorca.setBounds(696, 260, 55, 20);
		
		txtTeruel = new JTextField();
		lblNewLabel.add(txtTeruel);
		txtTeruel.setText("Teruel");
		txtTeruel.setHorizontalAlignment(SwingConstants.CENTER);
		txtTeruel.setEditable(false);
		txtTeruel.setBounds(541, 224, 40, 20);
		
		txtSalamanca = new JTextField();
		txtSalamanca.setText("Salamanca");
		txtSalamanca.setHorizontalAlignment(SwingConstants.CENTER);
		txtSalamanca.setEditable(false);
		txtSalamanca.setBounds(280, 210, 75, 20);
		lblNewLabel.add(txtSalamanca);
		
	}
}
