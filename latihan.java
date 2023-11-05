import java.util.Scanner;
public class latihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int angka1 = in.nextInt();
        int jarak = in.nextInt();
        int ulang = in.nextInt();

        int hasilAritmatika = aritmatika (angka1, jarak, ulang);
        System.out.println(hasilAritmatika);
    }
    private static int hasil =0;
    private static int aritmatika(int angka1, int jarak, int ulang){
        if (ulang > 0){
            ulang = ulang - 1;
            hasil = hasil + angka1;
            angka1 = angka1 + jarak;
            aritmatika(angka1, jarak, ulang);
        }
        return hasil;
    }
}

