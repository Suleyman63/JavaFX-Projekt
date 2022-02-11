package sample;

public class Vorlesung {

    private String titel;


    public Vorlesung() {}


    public Vorlesung(String titel) {
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Override
    public String toString() {
        return "titel=" + titel;
    }


}

