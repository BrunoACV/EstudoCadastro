package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Usuario;

public class Program {

	public static void main(String[] args) {
		List<Usuario> usuario = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String senha;
		String senhaVal;
		System.out.println("Bem vindo! ");

		System.out.print("Informe o seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe o seu Email: ");
		String email = sc.nextLine();

		System.out.print("Digite a sua senha: ");
		senha = sc.nextLine();
		do {
			System.out.print("Confirme a senha: ");
			senhaVal = sc.nextLine();

			if (senhaVal.equals(senha)) {
				usuario.add(new Usuario(nome, email, senha));
			} else {
				System.out.println("Senha incorreta! ");

			}
		} while (senhaVal.equals(senha) != true);
		System.out.println("Cadastro realizado com sucesso! ");
		System.out.println(usuario);

		sc.close();
	}

}
