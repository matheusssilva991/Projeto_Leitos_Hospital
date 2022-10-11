package Projeto.leitos;
import Projeto.pessoa.*;

public class Enfermaria extends Leito
{
    private Pessoa enfermeiro;
    private final Float custo = 800.f;

    public Enfermaria(Pessoa paciente, Pessoa enfermeiro)
    {
        super(paciente);
        this.enfermeiro = enfermeiro;
    }

    public Enfermaria()
    {
        this.enfermeiro = null;
    }

    public void setEnfermeiro(Pessoa enfermeiro)
    {
        this.enfermeiro = enfermeiro;
    }

    public Pessoa getEnfermeiro()
    {
        return this.enfermeiro;
    }

    @Override
    public float getCustos()
    {
        return custo;
    }

    @Override
    public String toString() {
        return "Leito de Enfermaria: " +
                enfermeiro +
                ", " + getPaciente();
    }
}