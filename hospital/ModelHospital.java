package Projeto.hospital;

import java.util.ArrayList;

public class ModelHospital {
    private ArrayList<Hospital> hospitais;

    public ModelHospital()
    {
        this.hospitais = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospital()
    {
        return hospitais;
    }

}
