package Projeto.hospital;
import Projeto.leitos.*;
import Projeto.pessoa.*;
import Projeto.pessoa.enfermeiro.ControllerEnfermeiro;
import Projeto.pessoa.medico.ControllerMedico;
import Projeto.pessoa.paciente.ControllerPaciente;

public abstract class Hospital
{
    private ModelPessoa modelMedicos;
    private ModelPessoa modelEnfermeiros;
    private ModelPessoa modelPacientes;
    private ModelLeito modelLeitos;
    private String nomeHospital;

    public Hospital(String nomeHospital)
    {
        this.modelMedicos = new ModelPessoa();
        this.modelEnfermeiros = new ModelPessoa();
        this.nomeHospital = nomeHospital;
        this.modelPacientes = new ModelPessoa();
        this.modelLeitos = new ModelLeito(new ControllerPaciente(modelPacientes), new ControllerEnfermeiro(modelEnfermeiros), new ControllerMedico(modelMedicos));
    }

    public ModelPessoa getModelMedicos() {
        return modelMedicos;
    }

    public void setModelMedicos(ModelPessoa modelMedicos) {
        this.modelMedicos = modelMedicos;
    }

    public ModelPessoa getModelEnfermeiros() {
        return modelEnfermeiros;
    }

    public void setModelEnfermeiros(ModelPessoa modelEnfermeiros) {
        this.modelEnfermeiros = modelEnfermeiros;
    }

    public ModelPessoa getModelPacientes() {
        return modelPacientes;
    }

    public void setModelPacientes(ModelPessoa modelPacientes) {
        this.modelPacientes = modelPacientes;
    }

    public ModelLeito getModelLeitos() {
        return modelLeitos;
    }

    public void setModelLeitos(ModelLeito modelLeitos) {
        this.modelLeitos = modelLeitos;
    }

    public String getNomeHospital() {
        return nomeHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    @Override
    public abstract String toString();
}