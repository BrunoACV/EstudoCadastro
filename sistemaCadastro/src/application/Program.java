package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Usuario;

public class Program {
	static Scanner sc = new Scanner(System.in);
	static List<Usuario> list = new ArrayList<>();

	public static void main(String[] args) {
		opcoes();
	}

	public static void opcoes() {
		try {
			System.out.println("1=Realizar cadastro:\n2=Realizar login:");
			String op;
			do {
				op = sc.nextLine();

				switch (op) {
				case "1":
					cadastro();
					break;
				case "2":
					login();
					break;

				default:
					System.out.println("Informe uma operação válida.");
					break;
				}

			} while (true);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado, tente novamente.");

		}

	}

	public static void cadastro() {
		try {
			String senha;
			String senhaVal;
			System.out.print("Bem vindo! ");

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
		} catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado, tente novamente.");
		}

	}

	public static void login() {
		try {
			boolean aux = false;
			do {
				System.out.print("Informe o nome de usuário: ");
				String nome = sc.nextLine();
				System.out.print("Informe a senha: ");
				String senha = sc.nextLine();

				for (Usuario usuario : list) {
					if (nome.equals(usuario.getNome()) == false || senha.equals(usuario.getSenha()) == false) {
					} else
						aux = true;

				}
			} while (aux == false);
			System.out.println("Login efetuado com sucesso!");
			funcaoLogado();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado, tente novamente.");

		}

	}

	public static void funcaoSoma() {
		System.out.print("Digite os dois valores para a soma: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int soma = n1 + n2;
		System.out.println("Resultado: " + soma);
		sc.nextLine();
		opcoes();
	}

	public static void funcaoLogado() {
		try {
			System.out.println("1=Realizar soma:");
			String op;
			do {
				op = sc.nextLine();

				switch (op) {
				case "1":
					funcaoSoma();
					break;

				default:
					System.out.println("Informe uma operação válida.");
					break;
				}

			} while (true);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado, tente novamente.");

		}
	}

}
