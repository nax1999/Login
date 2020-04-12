import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AsignarEmpresas extends JFrame {
	private Controlador miControlador;

	private JPanel contentPane;
	private JButton btnPerfil;
	private JButton btnAlumnos;
	private JButton btnEmpresas;
	private ImageIcon imagenBoton;
	private Icon iconoBoton;

	public AsignarEmpresas() {
		setTitle("Asignar Empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnEmpresas = new JButton("EMPRESAS");
		btnEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goEmpresa();
			}
		});
		btnEmpresas.setBounds(196, 11, 115, 55);
		getContentPane().add(btnEmpresas);

		btnAlumnos = new JButton("ALUMNOS");
		btnAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goAlumnos();
			}
		});
		btnAlumnos.setBounds(515, 11, 112, 55);
		getContentPane().add(btnAlumnos);

		btnPerfil = new JButton("");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goPerfil();
			}
		});
		btnPerfil.setIcon(new ImageIcon(getClass().getResource("/img/fotoPerfil.png")));
		btnPerfil.setBounds(900, 11, 55, 55);
		getContentPane().add(btnPerfil);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goLogin();
			}
		});
		btnCerrarSesion.setBounds(775, 11, 115, 23);
		contentPane.add(btnCerrarSesion);
		
		JTextArea txtrOracleCompanionNombre = new JTextArea();
		txtrOracleCompanionNombre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		txtrOracleCompanionNombre.setText("Oracle Companion\r\n\r\nNombre: Juli\u00E1n P\u00E9rez Sancho\r\n\r\nDirecci\u00F3n: Calle Lugo, n\u00BA23, Madrid, Espa\u00F1a, 28300.\r\nTel\u00E9fono: +34 658 89 92 34\r\nCorreo: oraclecompanion@hotmail.com");
		txtrOracleCompanionNombre.setBounds(96, 129, 337, 183);
		contentPane.add(txtrOracleCompanionNombre);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(AsignarEmpresas.class.getResource("/img/380020.png")));
		button.setBounds(289, 342, 22, 22);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(AsignarEmpresas.class.getResource("/img/descarte_peque.png")));
		button_1.setBounds(222, 342, 22, 22);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("Manuel Sevilla");
		lblNewLabel.setBounds(443, 129, 90, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblAlbaDelgado = new JLabel("Alba Delgado");
		lblAlbaDelgado.setBounds(443, 195, 90, 55);
		contentPane.add(lblAlbaDelgado);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sofia Loranca");
		lblNewLabel_1_1.setBounds(443, 257, 90, 55);
		contentPane.add(lblNewLabel_1_1);
		
		JButton button_1_1 = new JButton("");
		button_1_1.setBounds(538, 145, 22, 22);
		contentPane.add(button_1_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(AsignarEmpresas.class.getResource("/img/380020.png")));
		button_2.setBounds(605, 145, 22, 22);
		contentPane.add(button_2);
		
		JButton button_1_2 = new JButton("");
		button_1_2.setIcon(new ImageIcon(AsignarEmpresas.class.getResource("/img/descarte_peque.png")));
		button_1_2.setBounds(538, 209, 22, 22);
		contentPane.add(button_1_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(AsignarEmpresas.class.getResource("/img/380020.png")));
		button_3.setBounds(605, 209, 22, 22);
		contentPane.add(button_3);
		
		JButton button_1_3 = new JButton("");
		button_1_3.setIcon(new ImageIcon(AsignarEmpresas.class.getResource("/img/descarte_peque.png")));
		button_1_3.setBounds(538, 272, 22, 22);
		contentPane.add(button_1_3);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(AsignarEmpresas.class.getResource("/img/380020.png")));
		button_4.setBounds(605, 272, 22, 22);
		contentPane.add(button_4);
	}
	protected void goPerfil() {
		miControlador.goPerfilAsignarEmpresa();
		
	}
	protected void goLogin() {
		miControlador.goLoginAsignarEmpresa();
		
	}
	public void goAlumnos() {
		miControlador.goAlumnosAsignarEmpresa();
		
	}
	public void goEmpresa() {
		miControlador.goEmpresaAsignarEmpresa();
		
	}
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
}
