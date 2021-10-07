package ifElse;
import java.util.Scanner;

public class nilaisiswa2 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        String nama ;
        char grade ;
        final double tugas1 , tugas2 , tugas3 , mid , n_final , n_akhir;
        System.out.println("===== Menghitung Nilai Mahasiswa=====\n");
        System.out.print("Masukan nama : ");
        nama = input.nextLine();
        System.out.print("Nilai tugas1 : ");
        tugas1 = input.nextInt();
        System.out.print("Nilai tugas2 : ");
        tugas2 = input.nextInt();
        System.out.print("Nilai tugas3 : ");
        tugas3 = input.nextInt();
        System.out.print("Nilai mid : ");
        mid = input.nextInt();
        System.out.print("Nilai final : ");
        n_final = input.nextInt();
        n_akhir = (0.15 + tugas1 + 0.20 + tugas2 + 0.30 + tugas3 /3  + mid  +  n_final );
        if (n_akhir >= 80 && n_akhir >=100){
            grade = 'A';
        }
        else if (n_akhir > 60 && n_akhir < 70){
            grade = 'B';
        }
        else if (n_akhir > 50 && n_akhir < 59){
            grade = 'C';
        }
        else if (n_akhir > 40 && n_akhir < 49){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("\n"+nama+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Lulus");
        }
        else {
            System.out.println("\n"+nama+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Tidak Lulus");
        }  
    }
}