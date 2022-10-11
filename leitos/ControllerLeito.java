package Projeto.leitos;

import Projeto.pessoa.Pessoa;

import java.util.ArrayList;

public class ControllerLeito
{
    private ModelLeito modelLeito;

    public ControllerLeito(ModelLeito modelLeito)
    {
        this.modelLeito = modelLeito;
    }

    public void listarPacientes()
    {
        modelLeito.getControllerPaciente().listarPacientes();
    }

    public void listarEnfermeiros()
    {
        modelLeito.getControllerEnfermeiro().listarEnfermeiros();
    }

    public void listarMedicos()
    {
        modelLeito.getControllerMedico().listarMedicos();
    }

    public void criarLeitoEnfermaria(String nomePaciente, String nomeEnfermeiro)
    {
        ArrayList<Leito> leitos = modelLeito.getLeitos();
        Pessoa paciente = modelLeito.controllerPaciente.getPaciente(nomePaciente);
        Pessoa enfermeiro = modelLeito.controllerEnfermeiro.getEnfermeiro(nomeEnfermeiro);
        Leito leito = new Enfermaria(paciente, enfermeiro);

        modelLeito.controllerPaciente.removePaciente(nomePaciente);
        leitos.add(leito);
    }

    public void criarLeitoUTI(String nomePaciente, String nomeMedico)
    {
        ArrayList<Leito> leitos = modelLeito.getLeitos();
        Pessoa paciente = modelLeito.controllerPaciente.getPaciente(nomePaciente);
        Pessoa medico = modelLeito.getControllerMedico().getMedico(nomeMedico);
        Leito leito = new UTI(paciente, medico);

        modelLeito.controllerPaciente.removePaciente(nomePaciente);
        leitos.add(leito);

    }

    public void adicionarPacienteLeito(String nomePaciente)
    {
        ArrayList<Leito> leitos = modelLeito.getLeitos();
        Pessoa paciente = modelLeito.controllerPaciente.getPaciente(nomePaciente);

        for(Leito leito: leitos)
        {
            if(leito.getPaciente() == null)
            {
                leito.setPaciente(paciente);
                modelLeito.controllerPaciente.removePaciente(nomePaciente);
                return;
            }
        }
        System.out.println("Nenhum leito vazio.");
        return;
    }

    public void removePacienteLeito(String nomePaciente)
    {
        ArrayList<Leito> leitos = modelLeito.getLeitos();
        Pessoa paciente = modelLeito.controllerPaciente.getPaciente(nomePaciente);

        for(Leito leito: leitos)
        {
            if(leito.getPaciente().getNome().equals(nomePaciente))
            {
                leito.setPaciente(null);
                return;
            }
        }
        System.out.println("Paciente não encontrado. Fugiu!");
    }

    public void listarLeitos()
    {
        ArrayList<Leito> leitos = modelLeito.getLeitos();

        if(leitos.size() == 0)
        {
            System.out.println("Sem leitos.");
            return;
        }

        for(Leito leito: leitos)
            System.out.println(leito);
    }
}
