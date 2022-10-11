package Projeto.pessoa.paciente;

import Projeto.pessoa.enfermeiro.ControllerEnfermeiro;

import java.util.Scanner;

public class ViewPaciente {

    private ControllerPaciente controllerPaciente;

    public ViewPaciente(ControllerPaciente controllerPaciente)
    {
        this.controllerPaciente = controllerPaciente;
    }

    public void menuPaciente()
    {
        int op = 0;
        Scanner input = new Scanner(System.in);
        String nome, cpf, telefone, endereco, causa;

        while(op != 4)
        {
            System.out.println("------Gerenciar Pacientes------");
            System.out.println("1 - Adicionar Pacientes");
            System.out.println("2 - Remover Pacientes");
            System.out.println("3 - Listar Pacientes");
            System.out.println("4 - Sair");
            op = input.nextInt();

            if(input.hasNextLine())
                input.nextLine();

            switch(op)
            {
                case 1:
                    System.out.println("Digite o nome do Paciente");
                    nome = input.nextLine();

                    System.out.println("Digite o cpf");
                    cpf = input.nextLine();

                    System.out.println("Digite o numero de telefone");
                    telefone = input.nextLine();

                    System.out.println("Digite o endereco");
                    endereco = input.nextLine();

                    System.out.println("Digite a causa");
                    causa = input.nextLine();

                    controllerPaciente.addPaciente(nome, cpf, telefone, endereco, causa);
                    break;

                case 2:
                    System.out.println("Digite o nome do paciente a ser removido");
                    nome = input.nextLine();

                    controllerPaciente.removePaciente(nome);
                    break;

                case 3:
                    controllerPaciente.listarPacientes();
                    break;
                case 4:
                    return;

                default:
                    System.out.println("opcao invalida.");
            }
        }
    }
}
