package org.example.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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
	private JComboBox<String> comboBoxCategoria;
	private JButton btnAgregarSocio;
	SQLServerDataSource ds = new SQLServerDataSource();
	Connection con;
	private JLabel lblNewLabel_5;
	private JTextField textFieldTelGrupoFamiliar;
	private JLabel lblNewLabel_6;
	private JTextField textFieldDomicilio;

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

    	this.ds.setServerName("DESKTOP-ON7JO5N");  
    	//ds.setPortNumber(1433);
    	this.ds.setDatabaseName("Club");  
    	this.ds.setUser("sa");
    	this.ds.setPassword("123456");
    	this.ds.setTrustServerCertificate(true);
    	
		try {
			this.con = ds.getConnection();
		} catch (SQLServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
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
		
		this.comboBoxCategoria = new JComboBox<String>();
		this.comboBoxCategoria.addItem("Menor");
		this.comboBoxCategoria.addItem("Mayor");
		this.comboBoxCategoria.addItem("Vitalicio");
		this.panelFormularioNuevoSocio.add(this.comboBoxCategoria);
		
		this.lblNewLabel_5 = new JLabel("Telefono grupo familiar");
		this.lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelFormularioNuevoSocio.add(this.lblNewLabel_5);
		
		this.textFieldTelGrupoFamiliar = new JTextField();
		this.panelFormularioNuevoSocio.add(this.textFieldTelGrupoFamiliar);
		this.textFieldTelGrupoFamiliar.setColumns(10);
		
		this.lblNewLabel_6 = new JLabel("Domicilio");
		this.lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelFormularioNuevoSocio.add(this.lblNewLabel_6);
		
		this.textFieldDomicilio = new JTextField();
		this.panelFormularioNuevoSocio.add(this.textFieldDomicilio);
		this.textFieldDomicilio.setColumns(10);
		
		this.btnAgregarSocio = new JButton("Agregar");
		this.panelFormularioNuevoSocio.add(this.btnAgregarSocio);
		this.btnAgregarSocio.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Pagar")) {
			System.out.println("Apreto pagar");
		}else if(e.getActionCommand().equals("Agregar")) {
			try {
				String nombre = this.textFieldNombre.getText();
				String email = this.textFieldEmail.getText();
				String fecha_nacimiento = this.textFieldFechaNacimiento.getText();
				String nroCelular = this.textFieldNroCelular.getText();
				String categoriaString = (String) this.comboBoxCategoria.getSelectedItem();
				String telGrupo = this.textFieldTelGrupoFamiliar.getText();
				String domicilio = this.textFieldDomicilio.getText();
				
				int categoria;
				
				if(categoriaString.equalsIgnoreCase("menor")){
					categoria = 4;
					System.out.println("Vamos bien");
				}else if(categoriaString.equalsIgnoreCase("mayor")) {
					categoria = 5;
				}else
					categoria = 6;
				
				//Statement sql = this.con.createStatement();
				
				//sql.executeUpdate("exec SP_INSERTAR_SOCIO '"+ nombre +"', '"+ email +"', '"+ fecha_nacimiento +"', '"+ nroCelular +"', "+ categoria +", '"+ domicilio +"', '"+ telGrupo +"'");
	        	
				PreparedStatement sql = con.prepareStatement("{call dbo.SP_INSERTAR_SOCIO(?, ?, ?, ?, ?, ?, ?)}");
				
				sql.setString(1, nombre);
				sql.setString(2, email);
				sql.setString(3, fecha_nacimiento);
				sql.setString(4, nroCelular);
				sql.setInt(5, categoria);
				sql.setString(6, domicilio);
				sql.setString(7, telGrupo);
				
				int cant = sql.executeUpdate();
				
				sql.close();
				System.out.println(cant);
				
			} catch (SQLException e1) {
				System.out.println("Fallo");
				e1.printStackTrace();
			}
		}
		
	}

}
