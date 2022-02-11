package sample;
import java.util.ArrayList;
public class Professor extends Universitat{


    enum Rang{A,B,C,D} ;

    private Rang rang;

    private int abzug;
    private int bonus;

    private ArrayList <Assistent> assistenten;
    private ArrayList <Vorlesung> vorlesungen;


    public Professor() {

    }

    public Professor(Rang rang) {

        this.rang = rang;

    }

    public Professor(Rang rang, ArrayList<Assistent> assistenten,ArrayList<Vorlesung> vorlesungen) {
        this.rang = rang;
        this.assistenten = assistenten;
        this.vorlesungen = vorlesungen;
    }

    public Rang getRang() {
        return rang;
    }


    public void setRang(Rang rang) {
        this.rang = rang;
    }


    public int getAbzug() {
        return abzug;
    }


    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public ArrayList<Assistent> getAssistenten() {

        return assistenten;
    }


    public void setAssistenten(ArrayList<Assistent> assistenten) {
        this.assistenten = assistenten;
    }


    public ArrayList<Vorlesung> getVorlesungen() {
        return vorlesungen;
    }


    public void setVorlesungen(ArrayList<Vorlesung> vorlesungen) {
        this.vorlesungen = vorlesungen;
    }


    public ArrayList<Vorlesung> vorlesungen(ArrayList vorlesungen) {
        return vorlesungen;
    }


    public  double getGehalt() {
        double gehaltNetto=0;
        berechneAbzug();
        berechneBonus();

        gehaltNetto = super.gehaltBrutto+this.bonus-abzug;

        return gehaltNetto;
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
        }
        return abzug;
    }

    public double berechneBonus() {
        switch (this.rang) {
            case A:  this.bonus=(int)(super.gehaltBrutto *40/100) ;
                break;
            case B:  this.bonus=(int)(super.gehaltBrutto *30/100) ;
                break;
            case C:  this.bonus=(int)(super.gehaltBrutto *20/100) ;
                break;
            case D:  this.bonus=(int)(super.gehaltBrutto *10/100) ;
                break;
        }
        return this.bonus;
    }

    @Override
    public String toString() {
        return "rang=" + rang + ", abzug=" + this.berechneAbzug() + ", bonus=" + this.berechneBonus() + ", id=" + id + ", name=" + name
                + ", gehaltBrutto=" + gehaltBrutto + ", steuerklasse=" + steuerklasse + " ,NettoG "+this.getGehalt()
                +" vorlesung " + this.vorlesungen+  " assistenten " + this.assistenten;
    }
}


