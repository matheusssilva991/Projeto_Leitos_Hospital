package Projeto.pessoa.enfermeiro;

import Projeto.pessoa.Pessoa;

public class Enfermeiro extends Pessoa {

private String matricula;

    public Enfermeiro(String nome, String cpf, String telefone, String endereco, String matricula)
    {
        super(nome, cpf, telefone,endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Enfermeiro: " + "nome = " + getNome()  +
                ", matricula = " + matricula;
    }
}