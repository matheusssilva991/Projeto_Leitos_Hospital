package Projeto.pessoa.paciente;

import Projeto.pessoa.Pessoa;

public class Paciente extends Pessoa {

    private String causa;

    public Paciente(String nome, String cpf, String telefone, String endereco, String causa)
    {
        super(nome, cpf, telefone, endereco);
        this.causa = causa;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    @Override
    public String toString() {
        return "Paciente: " + "nome = " + getNome()  +
                ", causa = " + causa;
    }
}