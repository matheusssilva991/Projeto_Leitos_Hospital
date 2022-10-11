package Projeto.leitos;
import Projeto.pessoa.enfermeiro.ControllerEnfermeiro;
import Projeto.pessoa.medico.ControllerMedico;
import Projeto.pessoa.paciente.ControllerPaciente;

import java.util.ArrayList;

public class ModelLeito
{
    ArrayList<Leito> leitos;
    ControllerPaciente controllerPaciente;
    ControllerEnfermeiro controllerEnfermeiro;
    ControllerMedico controllerMedico;

    public ModelLeito(ControllerPaciente controllerPaciente, ControllerEnfermeiro controllerEnfermeiro, ControllerMedico controllerMedico)
    {
        this.leitos = new ArrayList<Leito>();
        this.controllerPaciente = controllerPaciente;
        this.controllerEnfermeiro = controllerEnfermeiro;
        this.controllerMedico = controllerMedico;
    }

    public ArrayList<Leito> getLeitos() {
        return leitos;
    }

    public void setLeitos(ArrayList<Leito> leitos) {
        this.leitos = leitos;
    }

    public ControllerPaciente getControllerPaciente() {
        return controllerPaciente;
    }

    public void setControllerPaciente(ControllerPaciente controllerPaciente) {
        this.controllerPaciente = controllerPaciente;
    }

    public ControllerEnfermeiro getControllerEnfermeiro() {
        return controllerEnfermeiro;
    }

    public void setControllerEnfermeiro(ControllerEnfermeiro controllerEnfermeiro) {
        this.controllerEnfermeiro = controllerEnfermeiro;
    }

    public ControllerMedico getControllerMedico() {
        return controllerMedico;
    }

    public void setControllerMedico(ControllerMedico controllerMedico) {
        this.controllerMedico = controllerMedico;
    }
}
