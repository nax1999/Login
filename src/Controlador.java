import java.sql.*;

import javax.swing.JOptionPane;

import conexion.ConexionSQL;

public class Controlador {
	private Modelo miModelo;
	private Login miLogin;
	private pantallaPrincipal miPantallaPrincipal;
	private Registro miRegistro;
	private cambioContraseña miCambioContraseña;
	private Empresa	miEmpresa;
	private DetalleEmpresa miDetalleEmpresa;
	private AsignarEmpresas miAsignarEmpresas;
	private DetallesAlumno miDetallesAlumno;
	private AgregarEmpresa miAgregarEmpresa;
	private AjustesAlumno miAjustesAlumno;
	
	public void setpantallaPrincipal(pantallaPrincipal miPantallaPrincipal) {
		this.miPantallaPrincipal = miPantallaPrincipal;
	}
	public void setAsignarEmpresas(AsignarEmpresas miAsignarEmpresas) {
		this.miAsignarEmpresas = miAsignarEmpresas;
	}
	public void setAjustesAlumno(AjustesAlumno miAjustesAlumno) {
		this.miAjustesAlumno = miAjustesAlumno;
	}
	public void setAgregarEmpresa(AgregarEmpresa miAgregarEmpresa) {
		this.miAgregarEmpresa = miAgregarEmpresa;
	}
	public void setDetallesAlumno(DetallesAlumno miDetallesAlumno) {
		this.miDetallesAlumno = miDetallesAlumno;
	}
	public void setDetalleEmpresa(DetalleEmpresa miDetalleEmpresa) {
		this.miDetalleEmpresa = miDetalleEmpresa;
	}
	public void setRegistro(Registro miRegistro) {
		this.miRegistro = miRegistro;
	}
	public void setEmpresa(Empresa miEmpresa) {
		this.miEmpresa = miEmpresa;
	}
	public void setCambioContrasena(cambioContraseña miCambioContraseña) {
		this.miCambioContraseña = miCambioContraseña;
	}
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	public void setLogin(Login miLogin) {
		this.miLogin = miLogin;
	}
	public void login() {
		String usr = miLogin.getUsr();
		String pwd = miLogin.getPwd();
		miModelo.ValidarUsuario(usr,pwd);
		
	}
	public void registro() {
		miLogin.setVisible(false);
		miRegistro.setVisible(true);
	}
	public void pantallaPrincipal() {
		miLogin.setVisible(false);
		miPantallaPrincipal.setVisible(true);
	}
	public void goLoginRegistro() {
		miRegistro.setVisible(false);	
		miLogin.setVisible(true);
	}
	public void cambiarContrasena() {
		miLogin.setVisible(false);
		miCambioContraseña.setVisible(true);		
	}
	public void goLoginCambioContrasena() {
		miCambioContraseña.setVisible(false);	
		miLogin.setVisible(true);
	}
	public void goLoginPantallaPrincipal() {
		miPantallaPrincipal.setVisible(false);	
		miLogin.setVisible(true);
		
	}
	public void goEmpresasPantallaPrincipal() {
		miPantallaPrincipal.setVisible(false);
		miEmpresa.setVisible(true);
				
	}
	public void goAlumnosEmpresa() {
		miEmpresa.setVisible(false);
		miPantallaPrincipal.setVisible(true);		
	}
	public void goLoginEmpresa() {
		miEmpresa.setVisible(false);
		miLogin.setVisible(true);		
	}
	public void goDetalleEmpresaEmpresa() {
		miEmpresa.setVisible(false);
		miDetalleEmpresa.setVisible(true);
		
	}
	public void goAsignarEmpresaEmpresa() {
		miEmpresa.setVisible(false);
		miAsignarEmpresas.setVisible(true);
	}
	public void goEmpresaAsignarEmpresa() {
		miAsignarEmpresas.setVisible(false);
		miEmpresa.setVisible(true);
		
	}
	public void goAlumnosAsignarEmpresa() {
		miAsignarEmpresas.setVisible(false);
		miPantallaPrincipal.setVisible(true);
		
	}
	public void goLoginAsignarEmpresa() {
		miAsignarEmpresas.setVisible(false);
		miLogin.setVisible(true);
		
	}
	public void goPerfilPantallaPrincipal() {
		miPantallaPrincipal.setVisible(false);
		miDetallesAlumno.setVisible(true);
		
	}
	public void goEmpresaDetallesAlumno() {
		miDetallesAlumno.setVisible(false);
		miEmpresa.setVisible(true);
	}
	public void goAlumnosDetallesAlumnos() {
		miDetallesAlumno.setVisible(false);
		miPantallaPrincipal.setVisible(true);		
	}
	public void goLoginDetallesAlumno() {
		miDetallesAlumno.setVisible(false);
		miLogin.setVisible(true);		
	}
	public void goPerfilEmpresa() {
		miEmpresa.setVisible(false);
		miDetallesAlumno.setVisible(true);
		
	}
	public void goEmpresaDetalleEmpresa() {
		miDetalleEmpresa.setVisible(false);
		miEmpresa.setVisible(true);		
	}
	public void goAlumnosDetalleEmpresa() {
		miDetalleEmpresa.setVisible(false);
		miPantallaPrincipal.setVisible(true);
		
	}
	public void goAsignarEmpresasDetalleEmpresa() {
		miDetalleEmpresa.setVisible(false);
		miAsignarEmpresas.setVisible(true);		
		
	}
	public void goLoginDetalleEmpresa() {
		miDetalleEmpresa.setVisible(false);
		miLogin.setVisible(true);
		
	}
	public void goAgregarEmpresaEmpresa() {
		miEmpresa.setVisible(false);
		miAgregarEmpresa.setVisible(true);
	}
	public void goEmpresaAgregarEmpesa() {
		miAgregarEmpresa.setVisible(false);
		miEmpresa.setVisible(true);		
	}
	public void goAlumnosAgregarEmpresa() {
		miAgregarEmpresa.setVisible(false);
		miPantallaPrincipal.setVisible(true);		
	}
	public void goAsignarEmpresaAgregarEmpresa() {
		miAgregarEmpresa.setVisible(false);
		miAsignarEmpresas.setVisible(true);
		
	}
	public void goLoginAgregarEmpresa() {
		miAgregarEmpresa.setVisible(false);
		miLogin.setVisible(true);
		
	}
	public void goPerfilAgregarEmpresa() {
		miAgregarEmpresa.setVisible(false);
		miDetallesAlumno.setVisible(true);
		
	}
	public void goAgregarEmpresaDetalleEmpresa() {
		miDetalleEmpresa.setVisible(false);
		miAgregarEmpresa.setVisible(true);
		
	}
	public void goPerfilAsignarEmpresa() {
		miAgregarEmpresa.setVisible(false);
		miDetallesAlumno.setVisible(true);
		
	}
	public void goPerfilDetalleEmpresa() {
		miDetalleEmpresa.setVisible(false);
		miDetallesAlumno.setVisible(true);
		
	}
	public void goAjustesAlumnoPantallaPrincipal() {
		miPantallaPrincipal.setVisible(false);
		miAjustesAlumno.setVisible(true);		
		
	}
	public void goEmpresaAjustesAlumno() {
		miAjustesAlumno.setVisible(false);
		miEmpresa.setVisible(true);
		
	}
	public void goAlumnosAjustesAlumno() {
		miAjustesAlumno.setVisible(false);
		miPantallaPrincipal.setVisible(true);		
	}
	public void goLoginAjustesAlumno() {
		miAjustesAlumno.setVisible(false);
		miLogin.setVisible(true);
		
	}
	public void goPerfilAjustesAlumno() {
		miAjustesAlumno.setVisible(false);
		miAjustesAlumno.setVisible(true);
		
	}
	
}
