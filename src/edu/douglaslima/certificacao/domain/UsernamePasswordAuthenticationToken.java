package edu.douglaslima.certificacao.domain;

public class UsernamePasswordAuthenticationToken implements Authentication {

	@Override
	public Usuario authenticate(String username, String password) {
		return new Usuario(username, password);
	}

}
