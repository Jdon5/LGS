import java.util.Scanner;

public class LgsCalc {

    private double[][] koeffizienten;
    
    public LgsCalc(double[][] koeffizienten){
        this.koeffizienten = koeffizienten;
    }
    
    private double[][] lgsCalc(){

        //1. Rechenoperation 2zeile 1 spalte 0 erzeugen 
        double factor1 = koeffizienten[0][0];
        double factor2 = koeffizienten[1][0];
        for(int i=0;i<=koeffizienten.length;i++){
            koeffizienten[1][i]=koeffizienten[1][i]*factor1-koeffizienten[0][i]*factor2;
        }

        // 2. Rechenoperation 3. Zeile 1. Spalte 0 erzeugen
        factor1 = koeffizienten[0][0];
        factor2 = koeffizienten[2][0];
        for(int i=0;i<=koeffizienten.length;i++){
            koeffizienten[2][i] = koeffizienten[2][i]*factor1-koeffizienten[0][i]*factor2;
        }

        // 3. Rechenoperation 3. Zeile 2 Spalte 0 erzeugen
        factor1 = koeffizienten[1][1];
        factor2 = koeffizienten[2][1];
        for(int i=0;i<=koeffizienten.length;i++){
            koeffizienten[2][i] = koeffizienten[2][i]*factor1-koeffizienten[1][i]*factor2;
        }
        return koeffizienten;
    }

    public void display(){
        //Ausgabe der Matrix nach Durchführung der Rechenoperation
        for(double[] i: lgsCalc()){
            for(double j: i){
                System.out.print("\t"+j);
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        double[][] koeffizienten = {
            {2,3,-1,-9},
            {1,-2,1,9},
            {-1,1,2,0}
        };
        
        LgsCalc lsg = new LgsCalc(koeffizienten);
        lsg.display();
    }
}
