
package com.mycompany.principal.java;

/**
 *
 * @author 12723112947
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Usuario> usuarios = new ArrayList();

        boolean rodando = true;

        while (rodando) {
            System.out.println("==================================");
            System.out.println("[1] - Cadastrar usuário");
            System.out.println("[2] - Listar todos os usuários cadastrados");
            System.out.println("[3] - Procurar usuário por email");
            System.out.println("[4] - Atualizar dados de um usuario");
            System.out.println("[5] - Remover usuário");
            System.out.println("[6] - Sair!");
            System.out.println("Digite a opção: ");
            
            String opcao = input.nextLine();

            switch (opcao) {

                case "1": {
                    System.out.println("==========CADADSTRO DE USUÁRIO==========");
                    System.out.print("Digite o email: ");
                    String email = input.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = input.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = input.nextLine();
                    System.out.print("Digite a idade: ");
                    String idade = input.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpf = input.nextLine();

                    Usuario u = new Usuario();
                    u.setEmail(email);
                    u.setSenha(senha);
                    u.setNome(nome);
                    u.setIdade(idade);
                    u.setCpf(cpf);

                    usuarios.add(u);
                    System.out.println("O email cadastrado foi: " + u.getEmail());
                    System.out.println("A senha cadastrada foi: " + u.getSenha());
                    break;
                }
                case "2": {
                    System.out.println("==========TODOS OS USUÁRIOS CADASTRADOS==========");
                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario uTemp = usuarios.get(i);
                        System.out.println("\tUsuaríos Totais " + (i + 1));
                        System.out.println("\tEmail: " + uTemp.getEmail());
                        System.out.println("\tNomes: " + uTemp.getNome());
                        System.out.println("\tCPF: " + uTemp.getCpf());
                    }
                    break;
                }
                case "3": {
                    System.out.println("==========PROCURAR USUÁRIO POR EMAIL==========");
                    System.out.println("Digite o email:");
                    String email = input.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario uTemp = usuarios.get(i);
                        if (email.equals(uTemp.getEmail())) {
                            System.out.println("Usuário encontrado");
                            System.out.println("\tNome: " + uTemp.getNome());
                            System.out.println("\tEmail: " + uTemp.getEmail());
                            System.out.println("\tSenha: " + uTemp.getSenha());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("USUÁRIO NÃO ENCONTRADO!");
                    }
                    break;
                }
                case "4": {
                    System.out.println("==========ATUALIZAÇÃO DE USUÁRIO==========");

                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario uTemp = usuarios.get(i);
                        System.out.println("[" + i + "] " + uTemp.getEmail());
                    }

                    System.out.println("Digite o numero do usuario!");
                    int numUser = input.nextInt();
                    input.nextLine(); // Limpa o buffer
                    System.out.println("Digite o novo Email: ");
                    String novoEmail = input.nextLine();
                    System.out.println("Digite a nova Senha: ");
                    String novaSenha = input.nextLine();

                    Usuario u = usuarios.get(numUser);
                    u.setEmail(novoEmail);
                    u.setSenha(novaSenha);
                    break;
                }
                case "5": {
                    System.out.println("==========REMOVER USUÁRIO==========");
                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario uTemp = usuarios.get(i);
                        System.out.println("[" + i + "] " + uTemp.getEmail());
                    }
                    System.out.println("Digite o numero do usuario!");
                    int numUser = input.nextInt();
                    input.nextLine(); // Limpa o buffer
                    usuarios.remove(numUser);
                    break;
                }
                case "6": {
                    System.out.println("==================================");
                    System.out.println("Sistema Finalizado!");
                    rodando = false;
                    break;
                }
                default:
                    System.out.println("==================================");
                    System.out.println("Opção inválida. Digite outra opção:");
                    opcao = input.nextLine();

                    while (Integer.parseInt(opcao) > 6 || Integer.parseInt(opcao) < 1) {
                        System.out.println("Opção inválida. Digite outra opção:");
                        opcao = input.nextLine();
                    }
                    break;
            }
        }

    }
}