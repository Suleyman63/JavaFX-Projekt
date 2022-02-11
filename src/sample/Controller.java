package sample;

import sample.Professor.Rang;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private Label warnung;

    @FXML
    private TextField ass_list,gbr,n_gehalt,pro_name,prof_id,prof_rang,
            steuer_klasse,vorl_list,name_assis,bg_assis,stk_assis,netto_assis,id_assis,z1,z2,rech_ergb;

    @FXML
    private Button btn1,btn_loeschen,info_assis,hoch_btn,btn_add,wurz_btn,teiler_btn,fakulitaet_btn,modulus_btn,division_btn,loeschen_assis,multi_btn;

    @FXML
    private MenuItem add,div,fakR,fakulI,hoch,mod,multi,multiEgpty,teiler,wurzel;


    @FXML
    void addFunction() {
        checkRech(z1);
        checkRech(z2);
        rech_ergb.setText( zahlenGener("+") +""  );
    }

    @FXML
    void divFunction() {
        checkRech(z1);
        checkRech(z2);
        if(Integer.parseInt(z2.getText())==0) {
            rech_ergb.setText("division durch 0 ist nicht moeglich");
        }else {
            rech_ergb.setText(   zahlenGener("/") +""  );
        }
    }

    @FXML
    void fakR_function() {
        checkRech(z1);
        z2.setText(null);

        rech_ergb.setText(fkulitatBerchnen() +"");
    }

    int fkulitatBerchnen() {
        int zahl01= Integer.parseInt(z1.getText());
        int ergbniss=1;

        for(int i=1; i<=zahl01; i++) {
            ergbniss = i*ergbniss;
            System.out.println(ergbniss+"   " + i);
        }
        return ergbniss;
    }


    @FXML
    void fakulIFunction() {

        if (checknumber(z2.getText()) ) {
            int zahl02= Integer.parseInt(z2.getText());
            rech_ergb.setText(fakulIFunctionRechner(zahl02)+"");
        }else if(checknumber(z1.getText())) {
            int zahl01= Integer.parseInt(z1.getText());
            rech_ergb.setText(fakulIFunctionRechner(zahl01)+"");
        }else {
            rech_ergb.setText("Wrong Number ");
        }
    }


    int fakulIFunctionRechner(int zahl){

        if (checknumber(z1.getText()) ) {
            if(zahl > 1) {
                return zahl*fakulIFunctionRechner(zahl-1); }
        }else if(checknumber(z2.getText())) {
            if(zahl > 1) {
                return zahl*fakulIFunctionRechner(zahl-1);}
        }
        return 1;
    }


    @FXML
    void hochFunktion() {
        checkRech(z1);
        checkRech(z2);
        rech_ergb.setText(   zahlenGener("hoch") +""  );

    }
    @FXML
    void mofFunction() {
        checkRech(z1);
        checkRech(z2);
        rech_ergb.setText(   zahlenGener("%") +""  );
    }


    @FXML
    void multiFunction() {
        checkRech(z1);
        checkRech(z2);
        rech_ergb.setText(   zahlenGener("*") +""  );
    }

    @FXML
    void teilerFunc() {
        int zahl1= Integer.parseInt(z1.getText());
        List<Integer> l1=new ArrayList<>();

        for (int i=1; i<=zahl1; i++) {
            if(zahl1%i==0)
                l1.add(i);
        }
        rech_ergb.setText(String.valueOf(l1));
    }

    @FXML
    void wrzelFunktion() {
        checkRech(z1);
        z2.setText(null);
        System.out.println("hallo from wurzel f");
        double z1d =Double.parseDouble(z1.getText());
        double sqt = Math.sqrt(z1d);
        rech_ergb.setText( sqt+ "");
    }

    @FXML
    void zeigeGehalt() {
        check(steuer_klasse);

        try {
            Professor p1 = new Professor(Rang.A);

            String name =pro_name.getText();
            p1.setName(name);

            String id_prof = prof_id.getText();
            p1.setId(Integer.parseInt(id_prof));

            String str_Steuerklasse = steuer_klasse.getText();
            p1.setSteuerklasse(Integer.parseInt(str_Steuerklasse));

            double brutto = Double.parseDouble(gbr.getText());

            p1.setGehaltBrutto(brutto);
            p1.setSteuerklasse(5);
            double netto = p1.getGehalt();

            n_gehalt.setText(String.valueOf(netto));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @FXML
    void leereFelder() {
        pro_name.setText("");
        prof_id.setText("");
        steuer_klasse.setText("");
    	vorl_list.setText("");
        gbr.setText("");
        prof_rang.setText("");
        n_gehalt.setText("");
    	ass_list.setText("");
    }


    @FXML
    void leeresteuer() {
        steuer_klasse.setText("");
    }


    public boolean check(TextField input) {

        try {
            int i_input = Integer.parseInt(steuer_klasse.getText());
            if(i_input==1||i_input==3||i_input==4||i_input==5||i_input==6) {
            }
            else {
                input.setText("bitte gultige Steuerklasse");
                leeresteuer();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            input.setText("bitte gultige Zahl eingeben");
            leeresteuer();
        }
        return true;
    }


    @FXML
    void info_netto() {

        Assistent as =new Assistent();
        checkassistant_eingabe(id_assis);

        String str_id = id_assis.getText();

        as.setId(Integer.parseInt(str_id));

        if(name_assis.getText()!="") {

            as.setName(name_assis.getText());
        }else {
            felderloeschen();
            name_assis.setText("Name soll ausgefuhlt werden");
        }

        checkassistant_eingabe(bg_assis);

        double brutto  =Double.parseDouble(bg_assis.getText());

        as.setGehaltBrutto(brutto);

        checkassistant_eingabe(stk_assis);
        String steuerKlasse_assis = stk_assis.getText();
        as.setSteuerklasse(Integer.parseInt(steuerKlasse_assis));

        double netto = as.getGehalt();
        netto_assis.setText(String.valueOf(netto));
    }

    @FXML
    void felderloeschen() {
        bg_assis.setText("");
        stk_assis.setText("");
        netto_assis.setText("");
        name_assis.setText("");
        id_assis.setText("");
    }

    boolean checkassistant_eingabe(TextField input) {
        try {
            int i_input = Integer.parseInt(input.getText());
            if(stk_assis==input) {

                if(i_input==1||i_input==3||i_input==4||i_input==5||i_input==6) {
                    System.out.println("ok du hast zahl gegeben");
                }else {
                    input.setText("");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            input.setText("");
        }
        return true;
    }

    double zahlenGener(String sign) {

        double zahl1 =Double.parseDouble(z1.getText());
        double zahl2 =Double.parseDouble(z2.getText());
        double result=0;

        switch(sign){
            case "+": result= zahl1+zahl2;
                break;
            case "%": result= zahl1%zahl2;
                break;
            case "*": result=zahl1*zahl2;
                break;
            case "/":result=zahl1/zahl2;
                break;
            case "hoch":result =Math.pow(zahl1, zahl2) ;
                break;
        }
        return result;
    }

    public boolean checkRech(TextField input) {
        try {
            double i_input = Double.parseDouble(input.getText());
        }catch(Exception e){
            rech_ergb.setText("");
            System.out.println(e.getMessage());
            input.setText("bitte gultige Zahl eingeben");
        }
        return true;
    }


    public boolean checknumber(String input) {

        if(input.matches("[0-9]*?.[0-9]*?")) {
            return true;
        } else{ return false;}

    }
}

