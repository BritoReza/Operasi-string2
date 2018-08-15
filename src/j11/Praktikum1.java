package j11;

public class Praktikum1 {
    public static void main(String[] args){
        
        String identitas = "Brito Reza Daud / X RPL 3 / 11";
        System.out.println("Identitas : "+ identitas);
        
        String x = "Operasi";
        System.out.println("Isi variable x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("Isi variable y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("Isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("Isi variable z : "+ z);
        System.out.println("Isi x sama dengan z (Case Sensitive) : "
                + x.equals(z));
        
        String r = "Operasi";
        System.out.println("Isi variable r : "+ r);
        System.out.println("Isi x sama dengan r (Case Sensitive) : "
                + x.equals(r));
        System.out.println("Isi x sama dengan r (Not Case Senstive) : "
                + x.equalsIgnoreCase(r));
        
        System.out.println("Perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("Perbandingan isi x dengan z (Case Sensitive): "
                + x.compareTo(z));
        System.out.println("Perbandingan isi x dengan r (Case Sensitive) : "
                + x.compareTo(r));
        System.out.println("Perbandingan isi x dengan r (Not Case Sensitive) : "
                + x.compareToIgnoreCase(r));
        
        String s = "operasI";
        System.out.println("Isi variable s : "+ s);
        System.out.println("Perbandingan isi r dengan s (Case Sensitive) : "
                + r.compareTo(s));
        
        System.out.println("Pada x terdapat huruf 'a' : " + x.contains("a"));
        
        System.out.println("Isi variable x besar semua : "+ x.toUpperCase());
        System.out.println("Isi variable x kecil semua : "+ x.toLowerCase());
        
        String t = "    operasi string    ";
        System.out.println("Isi variable t : \""+ t +"\"");
        System.out.println("Isi variable t tanpa spasi : \""+ t.trim() +"\"");
        
        System.out.println("gabungkan isi variable x dan r : "+ x.concat(r));
        
        
        
        
        
        
        
}
}
