package Projeto.hospital;

import Projeto.leitos.ControllerLeito;
import Projeto.leitos.ViewLeito;
import Projeto.pessoa.enfermeiro.ControllerEnfermeiro;
import Projeto.pessoa.enfermeiro.ViewEnfermeiro;
import Projeto.pessoa.medico.ControllerMedico;
import Projeto.pessoa.medico.ViewMedico;
import Projeto.pessoa.paciente.ControllerPaciente;
import Projeto.pessoa.paciente.ViewPaciente;

import java.util.Scanner;

public class ViewHospital {

    private ControllerHospital controllerHospital;

    public ViewHospital(ControllerHospital controller)
    {
        this.controllerHospital = controller;
    }

    public void menu()
    {
        int op = 0;
        Scanner input = new Scanner(System.in);
        String nomeHospital;

        while(op != 5)
        {
            System.out.println("1 - Adicionar novo Hospital");
            System.out.println("2 - Gerenciar Hospitais");
            System.out.println("3 - Remover Hospital");
            System.out.println("4 - Listar Hospitais.");
            System.out.println("5 - Sair\n");
            op = input.nextInt();

            if(input.hasNextLine())
                input.nextLine();

            switch (op)
            {
                case 1:
                    System.out.println("Digite o nome do hospital");
                    nomeHospital = input.nextLine();

                    System.out.println("---Digite o tipo do hospital---");
                    System.out.println("1 - Fixo");
                    System.out.println("2 - Campanha");
                    op = input.nextInt();

                    if(input.hasNextLine())
                        input.nextLine();

                    switch (op)
                    {
                        case 1:
                            controllerHospital.addHospitalFixo(nomeHospital);
                            break;

                        case 2:
                            controllerHospital.addHospitalCampanha(nomeHospital);
                            break;

                        default:
                            System.out.println("Opcao invalida.");
                    }
                    break;

                case 2:
                    System.out.println("Digite o nome do hospital");
                    nomeHospital = input.nextLine();

                    //controllerHospital.getHospital(nomeHospital);

                    if(controllerHospital.getHospital(nomeHospital) != null)
                        menuGerenciarHospitais(controllerHospital.getHospital(nomeHospital));
                    else
                        System.out.println("Hospital invalido.");
                    break;

                case 3:
                    System.out.println("Digite o nome do hospital");
                    nomeHospital = input.nextLine();

                    controllerHospital.removeHospital(nomeHospital);
                    break;

                case 4:
                    controllerHospital.listarHospitais();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void menuGerenciarHospitais(Hospital hospital)
    {
        int op = 0;
        Scanner input = new Scanner(System.in);
        ControllerEnfermeiro controllerEnfermeiro;
        ViewEnfermeiro viewEnfermeiro;
        ControllerMedico controllerMedico;
        ViewMedico viewMedico;
        ControllerPaciente controllerPaciente;
        ViewPaciente viewPaciente;
        ControllerLeito controllerLeito;
        ViewLeito viewLeito;

        while(op != 8)
        {
            System.out.println("1 - Gerenciar Enfermerios");
            System.out.println("2 - Gerenciar Medicos");
            System.out.println("3 - Gerenciar Pacientes");
            System.out.println("4 - Gerenciar Leitos");
            System.out.println("5 - Relatorio de custos diario");
            System.out.println("6 - Relatório de leitos livres");
            System.out.println("7 - Relatório de leitos livres por pacientes");
            System.out.println("8 - Sair\n\n");
            op = input.nextInt();

            if(input.hasNextLine())
                input.nextLine();

            switch (op)
            {
                case 1:
                    controllerEnfermeiro = new ControllerEnfermeiro(hospital.getModelEnfermeiros());
                    viewEnfermeiro = new ViewEnfermeiro(controllerEnfermeiro);
                    viewEnfermeiro.menuEnfermeiro();
                    break;

                case 2:
                    controllerMedico = new ControllerMedico(hospital.getModelMedicos());
                    viewMedico = new ViewMedico(controllerMedico);
                    viewMedico.menuMedico();
                    break;

                case 3:
                    controllerPaciente = new ControllerPaciente(hospital.getModelPacientes());
                    viewPaciente = new ViewPaciente(controllerPaciente);
                    viewPaciente.menuPaciente();
                    break;

                case 4:
                    controllerLeito = new ControllerLeito(hospital.getModelLeitos());
                    viewLeito = new ViewLeito(controllerLeito);
                    viewLeito.menuLeito();
                    break;

                case 5:
                    System.out.println("Custos diarios do hospital é  " + controllerHospital.relatorioCustosDiarios(hospital) + "R$");
                    break;

                case 6:
                    System.out.println("Quantidade de leitos livres no hospital é " + controllerHospital.relatorioLeitosLivres(hospital));
                    break;

                case 7:
                    System.out.println("Quantidade de leitos livres por paciente é " + controllerHospital.relatorioLeitosLivres(hospital) +
                            " leitos para " + controllerHospital.quantidadePacientes(hospital) + " Pacientes ");
                    break;

                case 8:
                    return;
            }
        }
    }
}
