package gui;

import domain.User;

public class UserAdapter extends User{

	private User user;

	public UserAdapter(String nombre, String contrasena, String dNI, String nombreUsuario) {
		super(nombre, contrasena, dNI, nombreUsuario);
		
	}

	public UserAdapter(User user) {
		super(user.getNombre(),user.getContrasena(),user.getDNI(), user.getNombreUsuario());
	}

	

}
