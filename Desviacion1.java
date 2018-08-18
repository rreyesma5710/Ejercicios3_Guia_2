import java.util.Scanner;
/**
 * Write a description of class Desviación here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desviacion1 {

       public static void main(String args[]) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int n = 10;
        System.out.println("Ingrese cantidad de numeros");
        n=scan.nextInt();
        double[] nums=new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valor en la posicion "+i);
            nums[i]=scan.nextDouble();
        }
        double desv=0;
        double xmed=0;
        
        for (int i = 0; i < n; i++) {
            xmed+=nums[i];
        }
        xmed/=(double)n;
        
        for (int i = 0; i < n; i++) {
            desv+=(nums[i]-xmed)*(nums[i]-xmed);
        }
        desv/=(double)(n-1);
        desv=Math.sqrt(desv);
        
        System.out.println("Media: "+xmed);
        System.out.println("Desviacion: "+desv);
    }
    
}