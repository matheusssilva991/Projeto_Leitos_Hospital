package Projeto.pessoa.medico;

import Projeto.pessoa.Pessoa;

public class Medico extends Pessoa
{
    private String especialidade;
    private String matricula;

    public Medico(String nome, String cpf, String telefone, String endereco, String matricula, String especialidade)
    {
        super(nome, cpf, telefone,endereco);
        this.matricula = matricula;
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Medico: " +
                "nome = " + getNome() +
                ", matricula = " + matricula +
                ", especialidade = " + especialidade;
    }
}