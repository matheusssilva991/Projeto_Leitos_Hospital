package Projeto.leitos;
import Projeto.pessoa.*;

public abstract class Leito
{
    private Pessoa paciente;
    
    public Leito()
    {
        this.paciente = null;
    }

    public Leito(Pessoa paciente)
    {
        this.paciente = paciente;
    }
    
    public Pessoa getPaciente()
    {
        return paciente;
    }

    public void setPaciente(Pessoa paciente)
    {
        this.paciente = paciente;
    }

    public abstract float getCustos();
}