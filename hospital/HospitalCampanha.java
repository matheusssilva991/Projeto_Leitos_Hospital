package Projeto.hospital;
import Projeto.leitos.*;
import Projeto.pessoa.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalCampanha extends Hospital
{
    public HospitalCampanha(String nomeHospital)
    {
        super(nomeHospital);
    }

    @Override
    public String toString()
    {
        return "Hospital de Campanha : " + getNomeHospital();
    }
}