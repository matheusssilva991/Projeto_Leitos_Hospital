package Projeto;

import Projeto.hospital.ControllerHospital;
import Projeto.hospital.ModelHospital;
import Projeto.hospital.ViewHospital;

public class Main {

    public static void main(String[] args) {
        ModelHospital modelHospital = new ModelHospital();
        ControllerHospital controller =  new ControllerHospital(modelHospital);
        ViewHospital view = new ViewHospital(controller);

        view.menu();
    }

}
