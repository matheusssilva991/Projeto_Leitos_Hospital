package Projeto.hospital;

public class HospitalFixo extends Hospital
{
    public HospitalFixo(String nomeHospital)
    {
        super(nomeHospital);
    }

    @Override
    public String toString()
    {
        return "Hospital Fixo : " + getNomeHospital();
    }
}