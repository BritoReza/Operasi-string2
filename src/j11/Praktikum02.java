package j11;
import java.util.Scanner;
public class Praktikum02 {
    private static void tampilJudul(String identias){
        System.out.println("Identitas : "+ identias);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
    
        String identitas = "Brito Reza Daud / X RPL 3 / 11";
        
        tampilJudul(identitas);
        
        private static String tampilInput() {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Masukkan Kalimat: ");
            String kalimat = scanner.nextLine();
            System.out.println("Kalimat Asli : " + kalimat);
            
            return kalimat;
        }
            String kalimat = tampilInput();
        
            private static String vokal2Angka(String kalimat) {
                char [] [] arConvert =
                {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','o'}};
                
                kalimat = kalimat.toLowerCase();
                for(int i = 0; i < arConvert.length; i++)
                    kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
                
                return kalimat;
                
                String convert = vocal2Angka(kalimat);
                
            }
    }
    
   }

