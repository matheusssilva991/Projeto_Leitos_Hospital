package Projeto.hospital;
import Projeto.leitos.Leito;

import java.util.ArrayList;

public class ControllerHospital
{
    private ModelHospital modelHospital;

    public ControllerHospital(ModelHospital modelHospital)
    {
        this.modelHospital = modelHospital;
    }

    public void addHospitalFixo(String nomeHospital)
    {
        ArrayList<Hospital> hospitais = modelHospital.getHospital();
        Hospital hospital = new HospitalFixo(nomeHospital);

        hospitais.add(hospital);
    }

    public void addHospitalCampanha(String nomeHospital)
    {
        ArrayList<Hospital> hospitais = modelHospital.getHospital();
        Hospital hospital = new HospitalCampanha(nomeHospital);

        hospitais.add(hospital);
    }

    public void removeHospital(String nomeHospital)
    {
        ArrayList<Hospital> hospitais = modelHospital.getHospital();

        hospitais.remove(getHospital(nomeHospital));
    }

    public void listarHospitais()
    {
        ArrayList<Hospital> hospitais = modelHospital.getHospital();

        if(hospitais.size() == 0)
        {
            System.out.println("Nenhum hospital.\n");
            return;
        }

        for(Hospital hospital : hospitais)
            System.out.println(hospital);

        System.out.println("\n");
    }

    public Hospital getHospital(String nomeHospital)
    {
        ArrayList<Hospital> hospitais = modelHospital.getHospital();

        for(Hospital hospital: hospitais)
        {
            if(hospital.getNomeHospital().equals(nomeHospital))
            {
                return hospital;
            }
        }
        return null;
    }


    public float relatorioCustosDiarios(Hospital hospital)
    {
        float custos = 0;

        ArrayList<Leito> leitos = hospital.getModelLeitos().getLeitos();

        if(leitos == null)
        {
            System.out.println("Nao ha leitos.");
            return 0;
        }

        for(Leito leito: leitos)
        {
            if(leito.getPaciente() != null)
                custos += leito.getCustos();
        }

       return custos;
    }

    public int relatorioLeitosLivres(Hospital hospital)
    {
        int numeroLeitosVazios = 0;

        ArrayList<Leito> leitos = hospital.getModelLeitos().getLeitos();

        if(leitos == null)
        {
            System.out.println("Nao ha leitos.");
            return 0;
        }


        for(Leito leito : leitos)
        {
            if(leito.getPaciente() == null)
                numeroLeitosVazios++;
        }

        return numeroLeitosVazios;
    }

    public int quantidadePacientes(Hospital hospital)
    {
        return hospital.getModelPacientes().getQuantidadePessoas();
    }

}
