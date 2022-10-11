package Projeto.leitos;

import java.util.Scanner;

public class ViewLeito {

    private ControllerLeito controllerLeito;

    public ViewLeito(ControllerLeito controllerLeito)
    {
        this.controllerLeito = controllerLeito;
    }

    public void menuLeito()
    {
        int op = 0;
        Scanner input = new Scanner(System.in);
        String nomePaciente, nomeEnfermeiro, nomeMedico;

        while(op != 6)
        {
            System.out.println("-----Gerenciar Leitos------");
            System.out.println("1 - Criar novo leito");
            System.out.println("2 - adicionar Paciente a um leito");
            System.out.println("3 - Remover paciente do leito");
            System.out.println("4 - Listar leitos");
            System.out.println("5 - Sair");
            op = input.nextInt();

            if(input.hasNextLine())
                input.nextLine();

            switch (op)
            {
                case 1:
                    System.out.println("----Lista de Pacientes Disponiveis----");
                    controllerLeito.listarPacientes();

                    System.out.println("Digite o nome do paciente");
                    nomePaciente = input.nextLine();

                    System.out.println("Escolha o tipo de Leito:");
                    System.out.println("1 - Enfermaria");
                    System.out.println("2 - UTI");
                    op = input.nextInt();

                    if(input.hasNextLine())
                        input.nextLine();

                    switch(op)
                    {
                        case 1:
                            System.out.println("---------Lista de enfermeiros disponiveis----------");
                            controllerLeito.listarEnfermeiros();
                            System.out.println("Digite o nome do enfermeiro");
                            nomeEnfermeiro = input.nextLine();

                            controllerLeito.criarLeitoEnfermaria(nomePaciente, nomeEnfermeiro);
                            break;

                        case 2:
                            System.out.println("---------Lista de medicos disponiveis----------");
                            controllerLeito.listarMedicos();
                            System.out.println("Digite o nome do medico");
                            nomeMedico = input.nextLine();

                            controllerLeito.criarLeitoUTI(nomePaciente, nomeMedico);
                            break;

                        default:
                            System.out.println("opcao invalida.");
                    }
                    break;

                case 2:
                    System.out.println("----Lista de Pacientes Disponiveis----");
                    controllerLeito.listarPacientes();

                    System.out.println("Digite o nome do paciente");
                    nomePaciente = input.nextLine();

                    controllerLeito.adicionarPacienteLeito(nomePaciente);
                    break;

                case 3:
                    System.out.println("Digite o nome do paciente");
                    nomePaciente = input.nextLine();

                    controllerLeito.removePacienteLeito(nomePaciente);
                    break;

                case 4:
                    controllerLeito.listarLeitos();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("opcao invalida.");
            }
        }
    }
}
