import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Medico> arrayMedico = new ArrayList<>();
        ArrayList<Paciente> arrayPaciente = new ArrayList<>();
        ArrayList<Consulta> arrayConsulta = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //Menu de seleção de funcionalidades para consultorio medico
        boolean status = true;
        while (status) {
            System.out.println("======== Menu de Opções ========\n");
            System.out.println(
                    """
                                [1] Cadastrar Medico
                                [2] Cadastrar Paciente
                                [3] Cadastrar Consultas
                                [4] Cancelamento de Consultas
                                [5] Relatório de Consultas
                                [6] Sair
                            """);
            //Escolha da opção do menu
            System.out.print("Qual opção voce deseja escolher? ");
            int resposta = scanner.nextInt();

            switch (resposta) {
                case 1 -> {
                    //Inputs - Cadastrar Medico
                    System.out.println("======== Cadastrar Médico ========\n");

                    System.out.print("Digite nome do(a) Medico(a): ");
                    String nomeMedico = scanner.next();

                    System.out.print("Digite Data de Nascimento do(a) Médico(a): ");
                    String dataNascimentoMedico = scanner.next();

                    System.out.print("Digite CRM do(a) Médico(a): ");
                    int crmMedico = scanner.nextInt();

                    System.out.print("Digite Data de Cadastro do(a) Médico(a): ");
                    String dataCadastroMedico = scanner.next();

                    Medico medico = new Medico();
                    medico.cadastrarMedico(nomeMedico, crmMedico, dataNascimentoMedico, dataCadastroMedico);
                    arrayMedico.add(medico);
                }
                case 2 -> {
                    System.out.println("======== Cadastrar Paciente ========");

                    System.out.print("Digite Cpf do(a) paciente: ");
                    int cpf = scanner.nextInt();

                    System.out.print("Digite Nome do(a) paciente ");
                    String nome = scanner.next();

                    System.out.print("Digite Data de nascimento do(a) paciente: ");
                    String dataNascimentoPaciente = scanner.next();

                    System.out.print("Digite Data de cadastro do(a) paciente: ");
                    String dataCadastroPaciente = scanner.next();

                    System.out.print("Digite Endereço do(a) paciente: ");
                    String endereçoPaciente = scanner.next();


                    Paciente paciente = new Paciente();
                    paciente.cadastrarPaciente(cpf, nome, dataNascimentoPaciente, dataCadastroPaciente, endereçoPaciente);
                    arrayPaciente.add(paciente);


                }


                case 3 -> System.out.println("======== Cadastrar Consultas ========");
                case 4 -> System.out.println("======== Cancelamento de Consultas ========");
                case 5 -> System.out.println("======== Relatorio de Consultas ========");
                case 6 -> {
                    System.out.println("fim do processo");
                    status = false;

                }


                default -> System.out.println("Opção invalida! favor escolher outra.");
            }

        }

        //Listar Medicos
        for (int i = 0; i < arrayMedico.size(); i++) {
            System.out.println(i + " - O nome do(a) medico(a) é: " + arrayMedico.get(i).getNome());
            System.out.println(i + " - O Crm do Médico é: " + arrayMedico.get(i).getCrm());
            System.out.println(i + " - A data de Nascimento do Médico é: " + arrayMedico.get(i).getDataNascimento());
            System.out.println(i + " - A data de Cadastramento do Médico é: " + arrayMedico.get(i).getDataCadastro());
        }

        System.out.println();
        //listar Pacientes
        for (int i = 0; i < arrayPaciente.size(); i++) {
            System.out.println(i + " - O cpf do(a) paciente é: " + arrayPaciente.get(i).getCpf());
            System.out.println(i + " - O nome do(a) paciente é: " + arrayPaciente.get(i).getNome());
            System.out.println(i + " - A data de nascimento do(a) paciente é: " + arrayPaciente.get(i).getDataNascimento());
            System.out.println(i + " - A data de cadastramento do(a) paciente é: " + arrayPaciente.get(i).getDataCadastro());
            System.out.println(i + " - O Endereço do(a) paciente é: " + arrayPaciente.get(i).getEndereço());

        }
    }
}