import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;

	private JTextField txtUsr;
	private JPasswordField txtPwd;
	private JButton btnLogin;
	private JLabel lblRespuesta;
	private JButton btnExit;
	private JLabel lblHeOlvidadoMi;
	private JButton btnRegistro;

	public Login() {
		getContentPane().setBackground(new Color(244, 164, 96));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 285);
		getContentPane().setLayout(null);

		JLabel lblUsr = new JLabel("Usuario :");
		lblUsr.setForeground(Color.WHITE);
		lblUsr.setBackground(Color.WHITE);
		lblUsr.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblUsr.setBounds(60, 74, 93, 14);
		getContentPane().add(lblUsr);

		JLabel lblPwd = new JLabel("Contrase\u00F1a:");
		lblPwd.setForeground(Color.WHITE);
		lblPwd.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblPwd.setBounds(60, 113, 93, 14);
		getContentPane().add(lblPwd);

		txtUsr = new JTextField();
		txtUsr.setBounds(176, 74, 138, 20);
		getContentPane().add(txtUsr);
		txtUsr.setColumns(10);

		txtPwd = new JPasswordField();
		txtPwd.setBounds(176, 113, 138, 20);
		getContentPane().add(txtPwd);

		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miControlador.login();
			}
		});
		btnLogin.setBounds(147, 162, 78, 23);
		getContentPane().add(btnLogin);

		lblRespuesta = new JLabel("");
		lblRespuesta.setForeground(Color.WHITE);
		lblRespuesta.setBounds(85, 137, 212, 14);
		getContentPane().add(lblRespuesta);

		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(21, 161, 93, 23);
		getContentPane().add(btnExit);

		lblHeOlvidadoMi = new JLabel("He olvidado mi contrase\u00F1a.");
		lblHeOlvidadoMi.setForeground(Color.WHITE);
		lblHeOlvidadoMi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				goCambiarContrasena();
			}
		});
		lblHeOlvidadoMi.setBounds(228, 194, 169, 14);
		getContentPane().add(lblHeOlvidadoMi);

		btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goRegistro();
			}
		});
		btnRegistro.setBounds(251, 162, 89, 23);
		getContentPane().add(btnRegistro);
		
		JLabel lblLauulu = new JLabel("LAUULU");
		lblLauulu.setFont(new Font("Tekton Pro", Font.PLAIN, 33));
		lblLauulu.setForeground(Color.WHITE);
		lblLauulu.setBounds(147, 21, 178, 52);
		getContentPane().add(lblLauulu);
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public String getUsr() {
		return txtUsr.getText();
	}

	public String getPwd() {
		return String.valueOf(txtPwd.getPassword());
	}

	public void actualizar() {
		String resultado = miModelo.getResultado();
		if (resultado.equals("Correcto")) {
			miControlador.pantallaPrincipal();
		} else if (resultado.equals("Incorrecto")) {
			lblRespuesta.setText("Usuario o contraseña incorrectos");
		} else {
			System.exit(0);
		}

	}

	public void goRegistro() {
		miControlador.registro();
	}

	public void goCambiarContrasena() {
		miControlador.cambiarContrasena();

	}
}
