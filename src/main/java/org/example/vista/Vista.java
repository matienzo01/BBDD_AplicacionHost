package org.example.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class Vista extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panelGestionSocios;
	private JPanel panelListaDeGruposFamiliares;
	private JList listaDeGruposFamiliares;
	private JPanel panelFormularioNuevoSocio;
	private JLabel lblNewLabel;
	private JTextField textFieldNombre;
	private JLabel lblNewLabel_1;
	private JTextField textFieldFechaNacimiento;
	private JLabel lblNewLabel_2;
	private JTextField textFieldNroCelular;
	private JLabel lblNewLabel_3;
	private JTextField textFieldEmail;
	private JLabel lblNewLabel_4;
	private JComboBox comboBoxCategoria;
	private JButton btnAgregarSocio;
	private JPanel panelActividades;
	private JPanel panel_4;
	private JList listaActividades;
	private JPanel panel_5;
	private JPanel panel_6;
	private JList listaSociosCompatibles;
	private JComboBox comboBoxCronogramas;
	private JPanel panel;
	private JPanel panel_1;
	private JList listaTitulares;
	private JPanel panel_2;
	private JList listaCuotasDebidas;
	private JPanel panel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnPagarCuotas;

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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		this.contentPane.add(this.tabbedPane, BorderLayout.CENTER);
		
		this.panelGestionSocios = new JPanel();
		this.tabbedPane.addTab("Socios", null, this.panelGestionSocios, null);
		this.panelGestionSocios.setLayout(new BorderLayout(0, 0));
		
		this.panelListaDeGruposFamiliares = new JPanel();
		this.panelGestionSocios.add(this.panelListaDeGruposFamiliares, BorderLayout.WEST);
		this.panelListaDeGruposFamiliares.setLayout(new BorderLayout(0, 0));
		
		this.listaDeGruposFamiliares = new JList();
		this.panelListaDeGruposFamiliares.add(this.listaDeGruposFamiliares);
		
		this.panelFormularioNuevoSocio = new JPanel();
		this.panelGestionSocios.add(this.panelFormularioNuevoSocio);
		this.panelFormularioNuevoSocio.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.lblNewLabel = new JLabel("Nombre");
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelFormularioNuevoSocio.add(this.lblNewLabel);
		
		this.textFieldNombre = new JTextField();
		this.textFieldNombre.setColumns(10);
		this.panelFormularioNuevoSocio.add(this.textFieldNombre);
		
		this.lblNewLabel_1 = new JLabel("Fecha de nacimiento");
		this.lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelFormularioNuevoSocio.add(this.lblNewLabel_1);
		
		this.textFieldFechaNacimiento = new JTextField();
		this.textFieldFechaNacimiento.setColumns(10);
		this.panelFormularioNuevoSocio.add(this.textFieldFechaNacimiento);
		
		this.lblNewLabel_2 = new JLabel("Numero de celular");
		this.lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelFormularioNuevoSocio.add(this.lblNewLabel_2);
		
		this.textFieldNroCelular = new JTextField();
		this.textFieldNroCelular.setColumns(10);
		this.panelFormularioNuevoSocio.add(this.textFieldNroCelular);
		
		this.lblNewLabel_3 = new JLabel("Email");
		this.lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelFormularioNuevoSocio.add(this.lblNewLabel_3);
		
		this.textFieldEmail = new JTextField();
		this.textFieldEmail.setColumns(10);
		this.panelFormularioNuevoSocio.add(this.textFieldEmail);
		
		this.lblNewLabel_4 = new JLabel("Categoria");
		this.lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelFormularioNuevoSocio.add(this.lblNewLabel_4);
		
		this.comboBoxCategoria = new JComboBox();
		this.panelFormularioNuevoSocio.add(this.comboBoxCategoria);
		
		this.btnAgregarSocio = new JButton("Guardar");
		this.panelFormularioNuevoSocio.add(this.btnAgregarSocio);
		this.btnAgregarSocio.addActionListener(this);
		
		this.panelActividades = new JPanel();
		this.tabbedPane.addTab("Actividades", null, this.panelActividades, null);
		this.panelActividades.setLayout(new BorderLayout(0, 0));
		
		this.panel_4 = new JPanel();
		this.panelActividades.add(this.panel_4, BorderLayout.WEST);
		this.panel_4.setLayout(new BorderLayout(0, 0));
		
		this.listaActividades = new JList();
		this.panel_4.add(this.listaActividades, BorderLayout.CENTER);
		
		this.comboBoxCronogramas = new JComboBox();
		this.panel_4.add(this.comboBoxCronogramas, BorderLayout.NORTH);
		
		this.panel_5 = new JPanel();
		this.panelActividades.add(this.panel_5, BorderLayout.CENTER);
		this.panel_5.setLayout(new BorderLayout(0, 0));
		
		this.listaSociosCompatibles = new JList();
		this.panel_5.add(this.listaSociosCompatibles);
		
		this.panel_6 = new JPanel();
		this.panelActividades.add(this.panel_6, BorderLayout.EAST);
		
		this.panel = new JPanel();
		this.tabbedPane.addTab("Facturacion", null, this.panel, null);
		this.panel.setLayout(new BorderLayout(0, 0));
		
		this.panel_1 = new JPanel();
		this.panel.add(this.panel_1, BorderLayout.WEST);
		this.panel_1.setLayout(new BorderLayout(0, 0));
		
		this.listaTitulares = new JList();
		this.panel_1.add(this.listaTitulares, BorderLayout.CENTER);
		
		this.panel_2 = new JPanel();
		this.panel.add(this.panel_2, BorderLayout.CENTER);
		this.panel_2.setLayout(new BorderLayout(0, 0));
		
		this.listaCuotasDebidas = new JList();
		this.panel_2.add(this.listaCuotasDebidas, BorderLayout.CENTER);
		
		this.panel_3 = new JPanel();
		this.panel_2.add(this.panel_3, BorderLayout.SOUTH);
		this.panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.lblNewLabel_5 = new JLabel("Monto debido");
		this.panel_3.add(this.lblNewLabel_5);
		
		this.lblNewLabel_6 = new JLabel("$ lo que sea");
		this.panel_3.add(this.lblNewLabel_6);
		
		this.btnPagarCuotas = new JButton("Pagar");
		this.panel_3.add(this.btnPagarCuotas);
		this.btnPagarCuotas.addActionListener(this);
		this.btnPagarCuotas.setActionCommand("Pagar");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Pagar")) {
			System.out.println("Apreto pagar");
		}else if(e.getActionCommand().equals("Agregar")) {
			String nombre = this.textFieldNombre.getText();
			String email = this.textFieldEmail.getText();
			String fecha_nacimiento = this.textFieldFechaNacimiento.getText();
			String nroCelular = this.textFieldNroCelular.getText();
			String categoria = (String) this.comboBoxCategoria.getSelectedItem();
			//Insert into socios values (nombre, email, fecha_nacimiento, nroCelular, categoria)
			//Como no tenemos los ids en la vista deberiamos agregar que casi todos los ids sean autoincrement
			System.out.println("Apreto agregar un socio");
		}
		
	}

}
