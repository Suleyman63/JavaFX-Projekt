package sample;

public class Assistent extends Universitat {


    private Vorlesung vorl;
    private int  abzug;


    public Assistent() {

    }
    public Assistent(Vorlesung vorl, int abzug) {

        this.vorl = vorl;
        this.abzug = abzug;
    }
    public Vorlesung getVorl() {
        return vorl;
    }

    public void setVorl(Vorlesung vorl) {
        this.vorl = vorl;
    }

    public int getAbzug() {
        return abzug;
    }

    public void setAbzug(int abzug) {
        this.abzug = abzug;
    }


    @Override
    public String toString() {
        return "vorl=" + vorl + ", abzug=" + berechneAbzug() + ", id=" + id + ", name=" + name + ", gehaltBrutto="
                + gehaltBrutto + ", steuerklasse=" + steuerklasse + " NettoGehalt "+ this.getGehalt();
    }


    @Override
    public double getGehalt() {

        double gehalt =0;

        gehalt =super.gehaltBrutto-this.berechneAbzug();
        return gehalt;
    }


    public double berechneAbzug() {
        switch(super.steuerklasse) {
            case 1: abzug =(int)(super.gehaltBrutto *40/100);
                break;
            case 3: abzug =(int)(super.gehaltBrutto *10/100);
                break;
            case 4: abzug =(int)(super.gehaltBrutto *20/100);
                break;
            case 5: abzug =(int)(super.gehaltBrutto *50/100);
                break;
            case 6: abzug =(int)(super.gehaltBrutto *60/100);
                break;
            default:
                return 0;
        }
        return abzug;

    }

}
