import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //criando um médico 
        System.out.println("Digite o nome do médico: ");
        String nomeMedico = scanner.nextLine();

        System.out.println("Digite a idade do médico: ");
        int idadeMedico = scanner.nextInt();
        scanner.nextLine(); //consumir quebra de linha 

        System.out.println("Digite o endereço do médico: ");
        String enderecoMedico = scanner.nextLine();

        System.out.println("Digite o cpf do médico: ");
        String cpfMedico = scanner.nextLine();

        System.out.println("Digite o email do médico: ");
        String emailMedico = scanner.nextLine();

        System.out.println("Digite o telefone do médico: ");
        String telefoneMedico = scanner.nextLine();

        System.out.println("Digite a especialidade do médico: ");
        String especialidadeMedico = scanner.nextLine();

        System.out.println("Digite o CRM do médico: ");
        String crmMedico = scanner.nextLine();

        Medico medico = new Medico(nomeMedico, idadeMedico, enderecoMedico, cpfMedico, emailMedico, telefoneMedico, especialidadeMedico, crmMedico);


        //criando um paciente 
        System.out.println("Digite o nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        System.out.println("Digite a idade do paciente: ");
        int idadePaciente = scanner.nextInt();
        scanner.nextLine(); //consumir quebra de linha 

        System.out.println("Digite o endereço do paciente: ");
        String enderecoPaciente = scanner.nextLine();

        System.out.println("Digite o cpf do paciente: ");
        String cpfPaciente = scanner.nextLine();

        System.out.println("Digite o email do paciente: ");
        String emailPaciente = scanner.nextLine();

        System.out.println("Digite o telefone do paciente: ");
        String telefonePaciente = scanner.nextLine();

        System.out.println("Digite o convênio do paciente: ");
        String convenioPaciente = scanner.nextLine();

        Paciente paciente = new Paciente(nomePaciente, idadePaciente, enderecoPaciente, cpfPaciente, emailPaciente, telefonePaciente, convenioPaciente, crmMedico);


        //nova consulta
        System.out.println("\nDigite as descrições da consulta: ");
        String descricaoConsulta = scanner.nextLine();

        Consulta consulta = new Consulta(medico, paciente, null, descricaoConsulta);

        //detalhes da consulta
        System.out.println("\nDetalhes da consulta: ");
        consulta.exibirDetalhes();

        scanner.close();
    }
    
}
