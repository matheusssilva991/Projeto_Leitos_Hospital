package Projeto.pessoa.medico;

import java.util.Scanner;

public class ViewMedico {

    private ControllerMedico controllerMedico;

    public ViewMedico(ControllerMedico controllerMedico)
    {
        this.controllerMedico = controllerMedico;
    }

    public void menuMedico()
    {
        int op = 0;
        Scanner input = new Scanner(System.in);
        String nome, cpf, telefone, endereco, matricula, especialidade;

        while(op != 4)
        {
            System.out.println("------Gerenciar Medicos------");
            System.out.println("1 - Adicionar Medico");
            System.out.println("2 - Remover Medico");
            System.out.println("3 - Listar Medicos");
            System.out.println("4 - Sair");
            op = input.nextInt();

            if(input.hasNextLine())
                input.nextLine();

            switch(op)
            {
                case 1:
                    System.out.println("Digite o nome do medico");
                    nome = input.nextLine();

                    System.out.println("Digite o cpf");
                    cpf = input.nextLine();

                    System.out.println("Digite o numero de telefone");
                    telefone = input.nextLine();

                    System.out.println("Digite o endereco");
                    endereco = input.nextLine();

                    System.out.println("Digite o numero da matricula");
                    matricula = input.nextLine();

                    System.out.println("Digite a especialidade");
                    especialidade = input.nextLine();

                    controllerMedico.addMedico(nome, cpf, telefone, endereco, matricula, especialidade);
                    break;

                case 2:
                    System.out.println("Digite o nome do medico a ser removido");
                    nome = input.nextLine();

                    controllerMedico.removeMedico(nome);
                    break;

                case 3:
                    controllerMedico.listarMedicos();
                    break;
                case 4:
                    return;

                default:
                    System.out.println("opcao invalida.");
            }
        }
    }

}
