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
        
    }
    private static String tampilInput(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
        
    }
    
    private static String vocal12Angka(String kaliamat) {
        char [][] arConvert = {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
        
        String kalimat = tampilInput();
        kalimat = kalimat.toLowerCase();
        for(int i=0;i<arConvert.length;i++)
            kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
        
        return kalimat;
    }
    private static void tampilPerkata(String kalimat, String convert){
        String[] arrKal = kalimat.split(" ");
        String[] arrCon = convert.split(" ");
        
            for(int i=0; i<arrKal.length; i++)
            {
                System.out.println(arrKal[i]+" => "+arrCon[i]);
            }
    }
    private static void tampilHasil(String convert)
    {
        System.out.println("Kalimat Alay Angka : " + convert);
            }
    }

