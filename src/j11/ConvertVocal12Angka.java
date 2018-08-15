package j11;
import java.util.Scanner;
public class ConvertVocal12Angka {
    private static void tampilJudul(String identitas){
        
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal ke Angka)\n");
    }
    
    public static void main(String[] args){
        
        String identitas = "Brito Reza Daud / X RPL 3 / 11";
        
        tampilJudul(identitas);
        String kalimat = tampilInput();
        String convert = vokal12Angka(kalimat);
        tampilPerKata(kalimat, convert);
        tampilHasil(convert);
    }
    private static String tampilInput(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
        
    }
    String kalimat = tampilInput();
}
