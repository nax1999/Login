import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjustesAlumno extends JFrame{
	private Controlador miControlador;
	
	private JPanel contentPane;
	private JButton btnPerfil;
	private JButton btnAlumnos;
	private JButton btnEmpresas;
	private ImageIcon imagenBoton;
	private Icon iconoBoton;
	private JTextField txtCv;
	
	public AjustesAlumno() {
		setTitle("Ajustes Alumnos");
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
		btnAlumnos.setBounds(516, 11, 112, 55);
		getContentPane().add(btnAlumnos);

		btnPerfil = new JButton("");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goPerfil();
			}
		});
		btnPerfil.setIcon(new ImageIcon(getClass().getResource("/img/fotoPerfil.png")));
		btnPerfil.setBounds(900, 11, 46, 55);
		getContentPane().add(btnPerfil);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goLogin();
			}
		});
		btnCerrarSesion.setBounds(775, 11, 115, 23);
		contentPane.add(btnCerrarSesion);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DetallesAlumno.class.getResource("/img/fotoPerfil.png")));
		lblNewLabel.setBounds(96, 132, 90, 90);
		contentPane.add(lblNewLabel);
		
		JLabel lblManuelSevilla = new JLabel("Miguel");
		lblManuelSevilla.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblManuelSevilla.setBounds(96, 221, 90, 14);
		contentPane.add(lblManuelSevilla);
		
		JLabel lblNewLabel_1 = new JLabel("ALUMNO");
		lblNewLabel_1.setBounds(117, 246, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCv = new JTextField();
		txtCv.setText("CV");
		txtCv.setBounds(196, 200, 137, 20);
		contentPane.add(txtCv);
		txtCv.setColumns(10);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(DetallesAlumno.class.getResource("/img/380020.png")));
		button.setBounds(344, 200, 22, 22);
		contentPane.add(button);
		
		JLabel lblEmpresasFavoritas = new JLabel("Empresas favoritas");
		lblEmpresasFavoritas.setBounds(196, 232, 137, 14);
		contentPane.add(lblEmpresasFavoritas);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(196, 252, 202, 90);
		contentPane.add(textArea);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(DetallesAlumno.class.getResource("/img/iconfinder_icon-arrow-right-c_211621.png")));
		button_1.setBounds(195, 353, 138, 37);
		contentPane.add(button_1);
	}
	protected void goPerfil() {
		miControlador.goPerfilAjustesAlumno();
		
	}
	protected void goLogin() {
		miControlador.goLoginAjustesAlumno();
		
	}
	protected void goAlumnos() {
		miControlador.goAlumnosAjustesAlumno();
		
	}
	protected void goEmpresa() {
		miControlador.goEmpresaAjustesAlumno();
		
	}
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
}
