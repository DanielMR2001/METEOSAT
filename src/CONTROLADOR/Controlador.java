package CONTROLADOR;

import VISTA.interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener {
	interfaz vista = new interfaz();

	public Controlador(interfaz v) {
		this.vista = v;
		this.vista.comboBox.addActionListener(interfaz.class);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	

	};

	public void comboBox() {
		String cambiarColor =vista.comboBox.getSelectedItem().toString);

		if (cambiarColor.equals("Almeria")) {
			vista.txtAlmeria.setBackground(Color.yellow);
			vista.textField_2.setBackground(Color.white);
			vista.textField_1.setBackground(Color.white);
			vista.textField.setBackground(Color.white);
			vista.txtLugo.setBackground(Color.white);
			vista.txtHuelva.setBackground(Color.white);
			vista.txtLleida.setBackground(Color.white);
			vista.txtMallorca.setBackground(Color.white);
			vista.txtTeruel.setBackground(Color.white);
			vista.txtSalamanca.setBackground(Color.white);
			vista.ciudad.setText("ALMERIA");

		}

		if (cambiarColor.equals("Burgos")) {
			vista.txtAlmeria.setBackground(Color.white);
			vista.textField_2.setBackground(Color.yellow);
			vista.textField_1.setBackground(Color.white);
			vista.textField.setBackground(Color.white);
			vista.txtLugo.setBackground(Color.white);
			vista.txtHuelva.setBackground(Color.white);
			vista.txtLleida.setBackground(Color.white);
			vista.txtMallorca.setBackground(Color.white);
			vista.txtTeruel.setBackground(Color.white);
			vista.txtSalamanca.setBackground(Color.white);
			vista.ciudad.setText("BURGOS");

		}

		if (cambiarColor.equals("Canarias")) {
			vista.txtAlmeria.setBackground(Color.white);
			vista.textField_2.setBackground(Color.white);
			vista.textField_1.setBackground(Color.yellow);
			vista.textField.setBackground(Color.white);
			vista.txtLugo.setBackground(Color.white);
			vista.txtHuelva.setBackground(Color.white);
			vista.txtLleida.setBackground(Color.white);
			vista.txtMallorca.setBackground(Color.white);
			vista.txtTeruel.setBackground(Color.white);
			vista.txtSalamanca.setBackground(Color.white);
			vista.ciudad.setText("CANARIAS");

		}

		if (cambiarColor.equals("Ciudad Real")) {
			vista.txtAlmeria.setBackground(Color.white);
			vista.textField_2.setBackground(Color.white);
			vista.textField_1.setBackground(Color.white);
			vista.textField.setBackground(Color.yellow);
			vista.txtLugo.setBackground(Color.white);
			vista.txtHuelva.setBackground(Color.white);
			vista.txtLleida.setBackground(Color.white);
			vista.txtMallorca.setBackground(Color.white);
			vista.txtTeruel.setBackground(Color.white);
			vista.txtSalamanca.setBackground(Color.white);
			vista.ciudad.setText("CIUDAD REAL");

		}

		if (cambiarColor.equals("Lugo")) {
			vista.txtAlmeria.setBackground(Color.white);
			vista.textField_2.setBackground(Color.white);
			vista.textField_1.setBackground(Color.white);
			vista.textField.setBackground(Color.white);
			vista.txtLugo.setBackground(Color.yellow);
			vista.txtHuelva.setBackground(Color.white);
			vista.txtLleida.setBackground(Color.white);
			vista.txtMallorca.setBackground(Color.white);
			vista.txtTeruel.setBackground(Color.white);
			vista.txtSalamanca.setBackground(Color.white);
			vista.ciudad.setText("LUGO");

		}

		if (cambiarColor.equals("Huelva")) {
			vista.txtAlmeria.setBackground(Color.white);
			vista.textField_2.setBackground(Color.white);
			vista.textField_1.setBackground(Color.white);
			vista.textField.setBackground(Color.white);
			vista.txtLugo.setBackground(Color.white);
			vista.txtHuelva.setBackground(Color.yellow);
			vista.txtLleida.setBackground(Color.white);
			vista.txtMallorca.setBackground(Color.white);
			vista.txtTeruel.setBackground(Color.white);
			vista.txtSalamanca.setBackground(Color.white);
			vista.ciudad.setText("HUELVA");

		}

		if (cambiarColor.equals("Lleida")) {
			vista.txtAlmeria.setBackground(Color.white);
			vista.textField_2.setBackground(Color.white);
			vista.textField_1.setBackground(Color.white);
			vista.textField.setBackground(Color.white);
			vista.txtLugo.setBackground(Color.white);
			vista.txtHuelva.setBackground(Color.white);
			vista.txtLleida.setBackground(Color.yellow);
			vista.txtMallorca.setBackground(Color.white);
			vista.txtTeruel.setBackground(Color.white);
			vista.txtSalamanca.setBackground(Color.white);
			vista.ciudad.setText("LLEIDA");

		}

		if (cambiarColor.equals("Mallorca")) {
			vista.txtAlmeria.setBackground(Color.white);
			vista.textField_2.setBackground(Color.white);
			vista.textField_1.setBackground(Color.white);
			vista.textField.setBackground(Color.white);
			vista.txtLugo.setBackground(Color.white);
			vista.txtHuelva.setBackground(Color.white);
			vista.txtLleida.setBackground(Color.white);
			vista.txtMallorca.setBackground(Color.yellow);
			vista.txtTeruel.setBackground(Color.white);
			vista.txtSalamanca.setBackground(Color.white);
			vista.ciudad.setText("MALLORCA");

		}

		if (cambiarColor.equals("Teruel")) {
			vista.txtAlmeria.setBackground(Color.white);
			vista.textField_2.setBackground(Color.white);
			vista.textField_1.setBackground(Color.white);
			vista.textField.setBackground(Color.white);
			vista.txtLugo.setBackground(Color.white);
			vista.txtHuelva.setBackground(Color.white);
			vista.txtLleida.setBackground(Color.white);
			vista.txtMallorca.setBackground(Color.white);
			vista.txtTeruel.setBackground(Color.yellow);
			vista.txtSalamanca.setBackground(Color.white);
			vista.ciudad.setText("TERUEL");

		}

		if (cambiarColor.equals("Salamanca")) {
			vista.txtAlmeria.setBackground(Color.white);
			vista.textField_2.setBackground(Color.white);
			vista.textField_1.setBackground(Color.white);
			vista.textField.setBackground(Color.white);
			vista.txtLugo.setBackground(Color.white);
			vista.txtHuelva.setBackground(Color.white);
			vista.txtLleida.setBackground(Color.white);
			vista.txtMallorca.setBackground(Color.white);
			vista.txtTeruel.setBackground(Color.white);
			vista.txtSalamanca.setBackground(Color.yellow);
			vista.ciudad.setText("SALAMANCA");

		}
	}

}
