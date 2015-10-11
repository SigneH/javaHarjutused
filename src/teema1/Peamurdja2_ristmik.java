package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.PAREM, primaryStage);
        Foor foor4 = new Foor(Foor.VASAK, primaryStage);
    }

    public void 
        int count = 0;
        while (count<10) {
            foor.vahetaPunast();
            foor.paus(1.5);
            foor.vahetaPunast();
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.vahetaRohelist();
            foor.paus(1);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaKollast();

            count = count +1;
        }


       /* tsykkel(foor1, 0);
        tsykkel(foor2, 0);
        tsykkel(foor3, 1);
        tsykkel(foor4, 1);
    }

    public void tsykkel(Foor foor, int suund) {
        int count = 0;
        while (count < 10) {
            // siia pane foorid vilkuma
            count = count + 1;
        }
    }*/

/*        vertikaal(foor1);
        vertikaal(foor2);
        horisontaal(foor3);
        horisontaal(foor4);
    }

    public void vertikaal(Foor foor) {
        foor.vahetaRohelist();
        rohelisestPunaseks(foor);
        foor.paus(1);
        punasestRoheliseks(foor):
        foor.paus(1);
    }
    */


        /*vertikaal(foor1, foor2);
    }

    public void vertikaal(Foor foor1, Foor foor2) {
        foor1.vahetaRohelist();
        foor2.vahetaRohelist();
        rohelisestPunaseks(foor1);
        rohelisestPunaseks(foor2);
        punasestRoheliseks(foor1);
        punasestRoheliseks(foor2);
    }

    public void rohelisestPunaseks(Foor foor) {
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.vahetaPunast();
    }

    public void punasestRoheliseks(Foor foor) {
        foor.vahetaKollast();
        foor.paus(0.5);


    }
*/
    /*

        //public void
        foor.vahetaPunast();
        foor.paus(0.5);
        foor.vahetaPunast();
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();*/


}



