import java.util.Scanner;

public class Vectores1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n1,n2,n3,k=0;
        System.out.println("Ingrese cantidad de elemtos del conjunto A");
        n1 = scan.nextInt();
        System.out.println("Ingrese cantidad de elemtos del conjunto B");
        n2 = scan.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];
        int[] C = new int[n1+n2];
        System.out.println("Ingrese datos del conjunto A");
        for (int i = 0; i < n1; i++) {
            System.out.println("Ingrese valor en la posicion " + i);
            A[i] = scan.nextInt();
        }
        System.out.println("Ingrese datos del conjunto B");
        for (int i = 0; i < n2; i++) {
            System.out.println("Ingrese valor en la posicion " + i);
            B[i] = scan.nextInt();
        }
        boolean f=true;
        for (int i = 0; i < n1; i++) {
            f=true;
            for (int j = 0; j < n2; j++) {
                if(A[i]==B[j]){
                    f=false;
                }
            }
            if(f){
                C[k]=A[i];
                k++;
            }
        }
        
        for (int i = 0; i < n2; i++) {
            f=true;
            for (int j = 0; j < n1; j++) {
                if(A[j]==B[i]){
                    f=false;
                }
            }
            if(f){
                C[k]=B[i];
                k++;
            }
        }
        
        System.out.println("Vector A");
        for (int i = 0; i < n1; i++) {
            System.out.print(A[i]+" ");
        }
        
        System.out.println("\nVector B");
        for (int i = 0; i < n2; i++) {
            System.out.print(B[i]+" ");
        }
        System.out.println("\nVector Resultante");
        for (int i = 0; i < k; i++) {
            System.out.print(C[i]+" ");
        }
    }

}