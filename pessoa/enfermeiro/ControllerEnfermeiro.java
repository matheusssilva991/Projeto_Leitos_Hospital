package Projeto.pessoa.enfermeiro;
import Projeto.pessoa.ModelPessoa;
import Projeto.pessoa.Pessoa;

import java.util.ArrayList;

public class ControllerEnfermeiro {

    private ModelPessoa modelEnfermeiro;

    public ControllerEnfermeiro(ModelPessoa modelEnfermeiro)
    {
        this.modelEnfermeiro = modelEnfermeiro;
    }

    public Pessoa getEnfermeiro(String nome)
    {
        ArrayList<Pessoa> medicos = modelEnfermeiro.getPessoas();

        for(Pessoa medico: medicos)
        {
            if(medico.getNome().equals(nome))
            {
                return medico;
            }
        }
        return null;
    }

    public void addEnfermeiro(String nome, String cpf, String telefone, String endereco, String matricula)
    {
        ArrayList<Pessoa> enfermeiros = modelEnfermeiro.getPessoas();

        Pessoa medico = new Enfermeiro(nome, cpf, telefone, endereco, matricula);

        enfermeiros.add(medico);
    }

    public void removeEnfermeiro(String nome)
    {
        ArrayList<Pessoa> enfermeiros = modelEnfermeiro.getPessoas();

        Pessoa enfermeiro = getEnfermeiro(nome);

        enfermeiros.remove(enfermeiro);
    }

    public void listarEnfermeiros()
    {
        ArrayList<Pessoa> enfermeiros = modelEnfermeiro.getPessoas();

        if(enfermeiros.size() == 0)
        {
            System.out.println("Hospital sem enfermeiros.\n");
            return;
        }

        for(Pessoa enfermeiro : enfermeiros)
            System.out.println(enfermeiro);

        System.out.println("\n");

    }
}
