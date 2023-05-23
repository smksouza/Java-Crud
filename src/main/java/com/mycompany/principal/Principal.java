package com.mycompany.principal;

/**
 *
 * @author 12723112947
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Usuario> usuarios = new ArrayList<>();

        // Criação dos objetos já cadastrados
        Usuario usuario1 = new Usuario();
        usuario1.setNome("João");
        usuario1.setIdade(20);
        usuario1.setEmail("joao@gmail.com");
        usuario1.setSenha("senha1");
        usuario1.setCpf("317.051.820-89");
        usuarios.add(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setNome("Maria");
        usuario2.setIdade(19);
        usuario2.setEmail("maria@gmail.com");
        usuario2.setSenha("senha2");
        usuario2.setCpf("369.362.950-10");
        usuarios.add(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.setNome("Pedro");
        usuario3.setIdade(21);
        usuario3.setEmail("pedro@gmail.com");
        usuario3.setSenha("senha3");
        usuario3.setCpf("898.125.230-06");
        usuarios.add(usuario3);

        Usuario usuario4 = new Usuario();
        usuario4.setNome("Ana");
        usuario4.setIdade(18);
        usuario4.setEmail("ana@gmail.com");
        usuario4.setSenha("senha4");
        usuario4.setCpf("702.217.480-67");
        usuarios.add(usuario4);

        Usuario usuario5 = new Usuario();
        usuario5.setNome("Carlo");
        usuario5.setIdade(22);
        usuario5.setEmail("carlo@gmail.com");
        usuario5.setSenha("senha5");
        usuario5.setCpf("935.407.890-73");
        usuarios.add(usuario5);

        Usuario usuario6 = new Usuario();
        usuario6.setNome("Laura");
        usuario6.setIdade(24);
        usuario6.setEmail("laura@gmail.com");
        usuario6.setSenha("senha6");
        usuario6.setCpf("676.619.290-90");
        usuarios.add(usuario6);

        Usuario usuario7 = new Usuario();
        usuario7.setNome("Lucas");
        usuario1.setIdade(18);
        usuario7.setEmail("lucas@gmail.com");
        usuario7.setSenha("senha7");
        usuario7.setCpf("961.465.160-15");
        usuarios.add(usuario7);

        boolean rodando = true;

        while (rodando) {
            System.out.println("==================================");
            System.out.println("[1] - Cadastrar usuário");
            System.out.println("[2] - Listar todos os usuários cadastrados");
            System.out.println("[3] - Procurar usuário por email");
            System.out.println("[4] - Atualizar dados de um usuário");
            System.out.println("[5] - Remover usuário");
            System.out.println("[6] - Sair!");
            System.out.println("Digite a opção: ");

            String opcao = input.nextLine();

            switch (opcao) {

                case "1": {
                    CadastroUsuario.cadastrarUsuario(input, usuarios);
                    break;
                }
                case "2": {
                    ListarUsuarios.listarUsuarios(usuarios);
                    break;
                }
                case "3": {
                    System.out.println("Digite o email:");
                    String email = input.nextLine();
                    ProcurarUsuario.ProcurarUsuario(email, usuarios);
                    break;
                }
                case "4": {
                    AtualizarUsuario.atualizarUsuario(input, usuarios);
                    break;
                }
                case "5": {
                    RemoverUsuario.removerUsuario(input, usuarios);
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
