package Projeto.pessoa;

import java.util.ArrayList;

public class ModelPessoa {

    ArrayList<Pessoa> pessoas;

    public ModelPessoa(ArrayList<Pessoa> pessoa)
    {
        this.pessoas = pessoa;
    }

    public ModelPessoa()
    {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getPessoas()
    {
        return pessoas;
    }

    public int getQuantidadePessoas()
    {
        return pessoas.size();
    }
}
