/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisoner_with_sword;

import java.util.ArrayList;

/**
 *
 * @author Monster
 */
public class Prisoner_With_Sword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
Soru : Bir hapishanede mahkum fazlalığı 
yüzünden bir kısım mahkumu öldürmek gerekmistir. 
Bu yüzden 1000 mahkum secilip bir cember şeklinde dizilirler.
1 den baslayarak sola doğru 1000 e kadar numara verilir. Ayrıca 1.mahkuma
bir kılıç verilir ve hemen solundaki mahkumu öldürmesi istenir ve öldürdükten
sonra sıradaki mahkuma kılıcı verir, o da aynı seyi yapar.boyle boyle 
bir mahkum kalana kadar devam eder.

Sizce en şanslı mahkum kaç nolu mahkumdur ?
        */
        
ArrayList<Integer> arrMahkumlar = new ArrayList<>();

int mahkumSayisi = 1_000;
for (int i = 1; i <= mahkumSayisi; i++) {
arrMahkumlar.add(i);
}
int kilicliMahkum = 0;

while (arrMahkumlar.size() > 1) {
int olumIndex = kilicliMahkum + 1;
if (olumIndex == arrMahkumlar.size()) {
olumIndex = 0;
kilicliMahkum = -1;
} else if (olumIndex > arrMahkumlar.size()) {
olumIndex = 1;
kilicliMahkum = 0;
}
arrMahkumlar.remove(olumIndex);
kilicliMahkum++;
}
System.out.println("Hayatta Kalan Mahkum : " + arrMahkumlar.get(0));

}

        
        // TODO code application logic here
    }
    

