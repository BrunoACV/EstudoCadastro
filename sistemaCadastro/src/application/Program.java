package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Usuario;

public class Program {
	static Scanner sc = new Scanner(System.in);
	static List<Usuario> list = new ArrayList<>();

	public static void main(String[] args) {
		cadastro();
		login();

	}

	public static void cadastro() {

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
				list.add(new Usuario(nome, email, senha));
			} else {
				System.out.println("Senha incorreta! ");

			}
		} while (senhaVal.equals(senha) != true);
		System.out.println("Cadastro realizado com sucesso! ");
		System.out.println(list);

	}

	public static void login() {
		System.out.print("Informe o nome de usu�rio: ");
		String nome = sc.nextLine();
		System.out.print("Informe a senha: ");
		String senha = sc.nextLine();

		for (Usuario usuario : list) {
			if (nome != usuario.getNome() && senha != usuario.getSenha()) {
				System.out.println("Nome de usu�rio ou senha incorretos! ");
			}
			System.out.println("Seja bem vindo ao programa! ");
		}
	}
}
