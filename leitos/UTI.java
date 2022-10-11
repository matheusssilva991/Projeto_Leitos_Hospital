package Projeto.leitos;
import Projeto.pessoa.*;

public class UTI extends Leito
{
    private Pessoa medico;
    private final Float custo = 2000.f;

    public UTI(Pessoa paciente, Pessoa medico)
    {
        super(paciente);
        this.medico = medico;
    }

    public UTI()
    {
        this.medico = null;
    }

    public void setMedico (Pessoa medico)
    {
        this.medico = medico;
    }

    public Pessoa getMedico()
    {
        return this.medico;
    }

    @Override
    public float getCustos()
    {
        return custo;
    }

    @Override
    public String toString() {
        return "Leito de UTI: " +
                 medico +
                " , " + getPaciente();
    }
}