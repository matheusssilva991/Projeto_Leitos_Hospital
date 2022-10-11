package Projeto.pessoa.paciente;

import Projeto.pessoa.ModelPessoa;
import Projeto.pessoa.Pessoa;
import Projeto.pessoa.enfermeiro.Enfermeiro;

import java.util.ArrayList;

public class ControllerPaciente {

    private ModelPessoa modelPaciente;

    public ControllerPaciente(ModelPessoa modelPaciente)
    {
        this.modelPaciente = modelPaciente;
    }

    public Pessoa getPaciente(String nome)
    {
        ArrayList<Pessoa> pacientes = modelPaciente.getPessoas();

        for(Pessoa paciente: pacientes)
        {
            if(paciente.getNome().equals(nome))
            {
                return paciente;
            }
        }
        return null;
    }

    public void addPaciente(String nome, String cpf, String telefone, String endereco, String causa)
    {
        ArrayList<Pessoa> pacientes = modelPaciente.getPessoas();

        Pessoa paciente = new Paciente(nome, cpf, telefone, endereco, causa);

        pacientes.add(paciente);
    }

    public void removePaciente(String nome)
    {
        ArrayList<Pessoa> pacientes = modelPaciente.getPessoas();

        Pessoa paciente = getPaciente(nome);

        pacientes.remove(paciente);
    }

    public void listarPacientes()
    {
        ArrayList<Pessoa> pacientes = modelPaciente.getPessoas();

        if(pacientes.size() == 0)
        {
            System.out.println("Hospital sem pacientes.\n");
            return;
        }

        for(Pessoa paciente : pacientes)
            System.out.println(paciente);

        System.out.println("\n");
    }
}
