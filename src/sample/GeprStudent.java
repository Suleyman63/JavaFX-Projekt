package sample;

public class GeprStudent extends Student{


    private double note;
    private Professor prof;
    private Vorlesung vor;


    public GeprStudent() {

    }
    public GeprStudent(double note, Professor prof, Vorlesung vor) {
        this.note = note;
        this.prof = prof;
        this.vor = vor;

    }

    @Override
    public String toString() {
        return "note=" + note + ", prof=" + prof + ", vor=" + vor;
    }


}
