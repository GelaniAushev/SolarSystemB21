package test1;

public class SolarSystem {
    public static void main(String[] args) {

        BasicsStructure bs=new BasicsStructure();
        bs.sun=1;
        bs.moon=2;
        bs.planets=2;

        Sun exosias=new Sun();
        exosias.color="green";
        exosias.temp="-54k";


        Planet1 zolo=new Planet1();
        zolo.color="gray";
        zolo.temp="228 cel";

        Planet2 xaro=new Planet2();
        xaro.color="Black";
        xaro.temp="456 cel";


    }
}
