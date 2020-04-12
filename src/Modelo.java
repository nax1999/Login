import java.sql.*;

import javax.swing.JOptionPane;

import conexion.ConexionSQL;

public class Modelo {
	private int fallos = 0;
	ConexionSQL cc = new ConexionSQL();
	Connection con = cc.conexion();
	private Login miLogin;
	private String resultado;

	

	public void setLogin(Login miLogin) {
		this.miLogin = miLogin;
	}

	public void ValidarUsuario(String usr, String pwd) {
		int result = 0;
		String SQL = "Select * from users where usr ='" + usr + "' and pwd = '" + pwd + "' ";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL);
			if(rs.next()) {
				result = 1;
				if (result == 1) {
					resultado = "Correcto";
					fallos = 0;
				}
			}else {
				fallos++;
				System.out.println(fallos);
				if (fallos == 3) {
					resultado = "Cerrar";
				} else
					resultado = "Incorrecto";
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
		}finally {
			miLogin.actualizar();
		}

	}

	public String getResultado() {
		return this.resultado;
	}

}
