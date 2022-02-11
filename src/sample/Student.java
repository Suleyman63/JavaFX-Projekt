package sample;

public class Student {

    protected int matNr;
    protected String name;
    protected int semester;


    public Student() {

    }
    public Student(int matNr, String name, int semester) {
        this.matNr = matNr;
        this.name = name;
        this.semester = semester;
    }

    public String toString() {
        return "matNr=" + matNr + ", name=" + name + ", semester=" + semester;
    }


}

