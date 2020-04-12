import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Empresa extends JFrame {
	private Controlador miControlador;

	private JPanel contentPane;
	private JButton btnPerfil;
	private JButton btnAlumnos;
	private JButton btnEmpresas;
	private ImageIcon imagenBoton;
	private Icon iconoBoton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnOracle;
	private JButton btnAgregarEmpresa;
	private JButton btnAsegnarEmpresas;
	private JButton btnCerrarSesion;

	public Empresa() {
		setTitle("Empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnEmpresas = new JButton("EMPRESAS");
		btnEmpresas.setBounds(282, 11, 115, 55);
		getContentPane().add(btnEmpresas);

		btnAlumnos = new JButton("ALUMNOS");
		btnAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goAlumnos();
			}
		});
		btnAlumnos.setBounds(421, 11, 112, 55);
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
		
		btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goLogin();
			}
		});
		btnCerrarSesion.setBounds(775, 11, 115, 23);
		contentPane.add(btnCerrarSesion);
		
		btnOracle = new JButton("");     
		btnOracle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goDetalleEmpresa();
			}
		});
        btnOracle.setIcon(new ImageIcon(Empresa.class.getResource("/img/oracle-logo.png")));
        btnOracle.setBounds(29, 77, 632, 209);
        contentPane.add(btnOracle);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Empresa.class.getResource("/img/deloitte.png")));
		lblNewLabel_1.setBounds(29, 297, 476, 229);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtOracleDescription = new JTextPane();
		txtOracleDescription.setText("Oracle Corporation \r\nCo-Founder & CTO\r\nOracle Corporation es una compa\u00F1\u00EDa especializada en el desarrollo de soluciones de nube y locales.\r\n\r\n");
		txtOracleDescription.setBounds(685, 77, 270, 104);
		contentPane.add(txtOracleDescription);
		
		JTextPane txtDeloitteDescription = new JTextPane();
		txtDeloitteDescription.setText("Deloitte Touche \r\nCo-Founder & CTO\r\nDeloitte Touche es la firma privada n\u00FAmero uno de servicios profesionales del mundo, por volumen de facturaci\u00F3n,  la m\u00E1s importante y prestigiosa del mundo y tambi\u00E9n una de las llamadas Cuatro Grandes Auditoras, junto a PricewaterhouseCoopers, Ernst & Young, y KPMG.\r\n");
		txtDeloitteDescription.setBounds(519, 297, 337, 118);
		contentPane.add(txtDeloitteDescription);
		
		JButton btnInstOracle = new JButton("");
		btnInstOracle.setIcon(new ImageIcon(Empresa.class.getResource("/img/iconfinder_Instagram_381384.png")));
		btnInstOracle.setBounds(685, 185, 90, 73);
		contentPane.add(btnInstOracle);
		
		JButton btnTwtOracle = new JButton("");
		btnTwtOracle.setIcon(new ImageIcon(Empresa.class.getResource("/img/iconfinder_twitter_square_107066.png")));
		btnTwtOracle.setBounds(783, 185, 90, 73);
		contentPane.add(btnTwtOracle);
		
		JButton btnFbOracle = new JButton("");
		btnFbOracle.setIcon(new ImageIcon(Empresa.class.getResource("/img/iconfinder_square-facebook_317727.png")));
		btnFbOracle.setBounds(875, 185, 90, 73);
		contentPane.add(btnFbOracle);
		
		JButton btnInstDeloitte = new JButton("");
		btnInstDeloitte.setIcon(new ImageIcon(Empresa.class.getResource("/img/iconfinder_Instagram_381384.png")));
		btnInstDeloitte.setBounds(515, 426, 90, 73);
		contentPane.add(btnInstDeloitte);
		
		JButton btnTwtDeloitte = new JButton("");
		btnTwtDeloitte.setIcon(new ImageIcon(Empresa.class.getResource("/img/iconfinder_twitter_square_107066.png")));
		btnTwtDeloitte.setBounds(625, 426, 90, 73);
		contentPane.add(btnTwtDeloitte);
		
		JButton btnFbDeloitte = new JButton("");
		btnFbDeloitte.setIcon(new ImageIcon(Empresa.class.getResource("/img/iconfinder_square-facebook_317727.png")));
		btnFbDeloitte.setBounds(732, 426, 90, 73);
		contentPane.add(btnFbDeloitte);
		
		btnAsegnarEmpresas = new JButton("ASIGNAR EMPRESAS");
		btnAsegnarEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goAsignarEmpresas();
			}
		});
		btnAsegnarEmpresas.setBounds(543, 11, 182, 55);
		contentPane.add(btnAsegnarEmpresas);
		
		btnAgregarEmpresa = new JButton("AGREGAR EMPRESA");
		btnAgregarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goAgregarEmpresa();
			}
		});
		btnAgregarEmpresa.setBounds(91, 11, 151, 55);
		contentPane.add(btnAgregarEmpresa);
	}
	public void goAgregarEmpresa() {
		miControlador.goAgregarEmpresaEmpresa();
		
	}
	public void goPerfil() {
		miControlador.goPerfilEmpresa();
		
	}
	public void goAsignarEmpresas() {
		miControlador.goAsignarEmpresaEmpresa();
		
	}
	public void goDetalleEmpresa() {
		miControlador.goDetalleEmpresaEmpresa();
		
	}
	public void goLogin() {
		miControlador.goLoginEmpresa();
		
	}
	public void goAlumnos() {
		miControlador.goAlumnosEmpresa();
		
	}
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
}