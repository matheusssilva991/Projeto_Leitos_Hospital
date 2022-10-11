package Projeto.pessoa.medico;
import Projeto.pessoa.ModelPessoa;
import Projeto.pessoa.Pessoa;

import java.util.ArrayList;

public class ControllerMedico {

    private ModelPessoa modelMedico;

    public ControllerMedico(ModelPessoa modelMedico)
    {
        this.modelMedico = modelMedico;
    }

    public Pessoa getMedico(String nome)
    {
        ArrayList<Pessoa> medicos = modelMedico.getPessoas();

        for(Pessoa medico: medicos)
        {
            if(medico.getNome().equals(nome))
            {
                return medico;
            }
        }
        return null;
    }

    public void addMedico(String nome, String cpf, String telefone, String endereco, String matricula, String especialidade)
    {
        ArrayList<Pessoa> medicos = modelMedico.getPessoas();

        Pessoa medico = new Medico(nome, cpf, telefone, endereco, matricula, especialidade);

        medicos.add(medico);
    }

    public void removeMedico(String nome)
    {
        ArrayList<Pessoa> medicos = modelMedico.getPessoas();

        Pessoa medico = getMedico(nome);

        medicos.remove(medico);
    }

    public void listarMedicos()
    {
        ArrayList<Pessoa> medicos = modelMedico.getPessoas();

        if(medicos.size() == 0)
        {
            System.out.println("Hospital sem medicos.\n");
            return;
        }

        for(Pessoa medico : medicos)
            System.out.println(medico);

        System.out.println("\n");
    }
}
