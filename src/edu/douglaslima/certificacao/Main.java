package edu.douglaslima.certificacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import edu.douglaslima.certificacao.domain.UsernamePasswordAuthenticationToken;
import edu.douglaslima.certificacao.domain.Usuario;

public class Main {

	public static void main(String[] args) {
		UsernamePasswordAuthenticationToken userAuth = new UsernamePasswordAuthenticationToken();
		Usuario u = userAuth.authenticate("douglaslima", "douglas123");
		u.setNome("Douglas");
		u.setEmail("dougbr133@gmail.com");
		u.setDataNascimento(LocalDate.parse("2003-01-11"));
		System.out.println(u.getNome());
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
		System.out.println(u.getEmail());
		System.out.println(u.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

}
