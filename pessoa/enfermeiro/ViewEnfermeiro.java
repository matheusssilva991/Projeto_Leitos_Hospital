package Projeto.pessoa.enfermeiro;
import java.util.Scanner;

public class ViewEnfermeiro {

    private ControllerEnfermeiro controllerEnfermeiro;

    public ViewEnfermeiro(ControllerEnfermeiro controllerEnfermeiro)
    {
        this.controllerEnfermeiro = controllerEnfermeiro;
    }

    public void menuEnfermeiro()
    {
        int op = 0;
        Scanner input = new Scanner(System.in);
        String nome, cpf, telefone, endereco, matricula;

        while(op != 4)
        {
            System.out.println("------Gerenciar Enfermeiros------");
            System.out.println("1 - Adicionar Enfermeiro");
            System.out.println("2 - Remover Enfermeiro");
            System.out.println("3 - Listar Enfermeiros");
            System.out.println("4 - Sair");
            op = input.nextInt();

            if(input.hasNextLine())
                input.nextLine();

            switch(op)
            {
                case 1:
                    System.out.println("Digite o nome do Enfermeiro");
                    nome = input.nextLine();

                    System.out.println("Digite o cpf");
                    cpf = input.nextLine();

                    System.out.println("Digite o numero de telefone");
                    telefone = input.nextLine();

                    System.out.println("Digite o endereco");
                    endereco = input.nextLine();

                    System.out.println("Digite o numero da matricula");
                    matricula = input.nextLine();

                    controllerEnfermeiro.addEnfermeiro(nome, cpf, telefone, endereco, matricula);
                    break;

                case 2:
                    System.out.println("Digite o nome do enfermeiro a ser removido");
                    nome = input.nextLine();

                    controllerEnfermeiro.removeEnfermeiro(nome);
                    break;

                case 3:
                    controllerEnfermeiro.listarEnfermeiros();
                    break;
                case 4:
                    return;

                default:
                    System.out.println("opcao invalida.");
            }
        }
    }
}
