package edu.douglaslima.certificacao.domain;

public interface Authentication {

	UserDetails authenticate(String username, String password);

}
