
public class Main {

	public static void main(String[] args) {
		Controlador miControlador = new Controlador();
		Modelo miModelo = new Modelo();
		Login miLogin = new Login();
		Registro miRegistro = new Registro();
		pantallaPrincipal miPantallaPrincipal = new pantallaPrincipal();
		cambioContraseña miCambioContraseña = new cambioContraseña();
		Empresa miEmpresa = new Empresa();
		DetalleEmpresa miDetalleEmpresa = new DetalleEmpresa();
		AsignarEmpresas miAsignarEmpresas = new AsignarEmpresas();
		DetallesAlumno miDetallesAlumno = new DetallesAlumno();
		AgregarEmpresa miAgregarEmpresa = new AgregarEmpresa();
		AjustesAlumno miAjustesAlumno = new AjustesAlumno();
		miControlador.setModelo(miModelo);
		miControlador.setLogin(miLogin);
		miControlador.setpantallaPrincipal(miPantallaPrincipal);
		miControlador.setRegistro(miRegistro);
		miControlador.setCambioContrasena(miCambioContraseña);
		miControlador.setEmpresa(miEmpresa);
		miControlador.setDetalleEmpresa(miDetalleEmpresa);
		miControlador.setAsignarEmpresas(miAsignarEmpresas);
		miControlador.setDetallesAlumno(miDetallesAlumno);
		miControlador.setAgregarEmpresa(miAgregarEmpresa);
		miControlador.setAjustesAlumno(miAjustesAlumno);
		miModelo.setLogin(miLogin);
		miLogin.setControlador(miControlador);
		miRegistro.setControlador(miControlador);
		miCambioContraseña.setControlador(miControlador);
		miPantallaPrincipal.setControlador(miControlador);
		miEmpresa.setControlador(miControlador);
		miDetalleEmpresa.setControlador(miControlador);
		miAsignarEmpresas.setControlador(miControlador);
		miDetallesAlumno.setControlador(miControlador);
		miAgregarEmpresa.setControlador(miControlador);
		miAjustesAlumno.setControlador(miControlador);
		miLogin.setModelo(miModelo);
		miLogin.setVisible(true);

	}

}
