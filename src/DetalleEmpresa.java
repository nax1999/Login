import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetalleEmpresa extends JFrame {
	private Controlador miControlador;
	private JButton btnAgregarEmpresa;
	private JButton btnEmpresas;
	private JButton btnAlumnos;
	private JButton btnAsegnarEmpresas;
	private JButton btnCerrarSesion;
	private JButton btnPerfil;

	public DetalleEmpresa() {
		setTitle("Detalle Empresa");
		setBounds(100, 100, 970, 637);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DetalleEmpresa.class.getResource("/img/oracle-226044.png")));
		lblNewLabel.setBounds(246, 69, 268, 44);
		getContentPane().add(lblNewLabel);

		JTextPane txtpnOracleCorporationEs = new JTextPane();
		txtpnOracleCorporationEs.setText(
				"Oracle Corporation es una compa\u00F1\u00EDa especializada en el desarrollo de soluciones de nube y locales. Oracle tiene su sede en la localidad californiana de Redwood City, Estados Unidos. Seg\u00FAn la clasificaci\u00F3n correspondiente al a\u00F1o 2006, ocupa el primer lugar en la categor\u00EDa de las bases de datos y el s\u00E9ptimo lugar a nivel mundial de las compa\u00F1\u00EDas de tecnolog\u00EDas de la informaci\u00F3n.6\u200B La tecnolog\u00EDa Oracle se encuentra pr\u00E1cticamente en muchas industrias del mundo y en las oficinas de 98 de las 100 empresas Fortune 100.");
		txtpnOracleCorporationEs.setBounds(72, 124, 413, 104);
		getContentPane().add(txtpnOracleCorporationEs);

		btnAgregarEmpresa = new JButton("AGREGAR EMPRESA");
		btnAgregarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goAgregarEmpresa();
			}
		});
		btnAgregarEmpresa.setBounds(113, 11, 151, 55);
		getContentPane().add(btnAgregarEmpresa);

		btnEmpresas = new JButton("EMPRESAS");
		btnEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goEmpresa();
			}
		});
		btnEmpresas.setBounds(274, 11, 115, 55);
		getContentPane().add(btnEmpresas);

		btnAlumnos = new JButton("ALUMNOS");
		btnAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goAlumnos();
			}
		});
		btnAlumnos.setBounds(402, 11, 112, 55);
		getContentPane().add(btnAlumnos);

		btnAsegnarEmpresas = new JButton("ASIGNAR EMPRESAS");
		btnAsegnarEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goAsignarEmpresas();
			}
		});
		btnAsegnarEmpresas.setBounds(524, 11, 182, 55);
		getContentPane().add(btnAsegnarEmpresas);

		btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goLogin();
			}
		});
		btnCerrarSesion.setBounds(756, 11, 115, 23);
		getContentPane().add(btnCerrarSesion);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DetalleEmpresa.class.getResource("/img/Captura.PNG")));
		lblNewLabel_1.setBounds(486, 124, 386, 358);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DetalleEmpresa.class.getResource("/img/Captura1.PNG")));
		lblNewLabel_2.setBounds(82, 234, 394, 283);
		getContentPane().add(lblNewLabel_2);

		btnPerfil = new JButton("");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goPerfil();
			}
		});
		btnPerfil.setIcon(new ImageIcon(DetalleEmpresa.class.getResource("img/fotoPerfil.png")));
		btnPerfil.setBounds(881, 11, 55, 55);
		getContentPane().add(btnPerfil);
	}

	protected void goPerfil() {
		miControlador.goPerfilDetalleEmpresa();
		
	}

	protected void goAgregarEmpresa() {
		miControlador.goAgregarEmpresaDetalleEmpresa();
		
	}

	protected void goLogin() {
		miControlador.goLoginDetalleEmpresa();
		
	}

	public void goAsignarEmpresas() {
		miControlador.goAsignarEmpresasDetalleEmpresa();
		
	}

	public void goAlumnos() {
		miControlador.goAlumnosDetalleEmpresa();
		
	}

	public void goEmpresa() {
		miControlador.goEmpresaDetalleEmpresa();
		
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
}