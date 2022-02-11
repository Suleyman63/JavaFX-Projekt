package sample;

public abstract class Universitat {

    protected int id;
    protected String name;
    protected double gehaltBrutto;
    protected int steuerklasse;

    public abstract double getGehalt();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getGehaltBrutto() {
        return gehaltBrutto;
    }


    public void setGehaltBrutto(double gehaltBrutto) {
        this.gehaltBrutto = gehaltBrutto;
    }


    public int getSteuerklasse() {
        return steuerklasse;
    }


    public void setSteuerklasse(int steuerklasse) {
        this.steuerklasse = steuerklasse;
    }
}

