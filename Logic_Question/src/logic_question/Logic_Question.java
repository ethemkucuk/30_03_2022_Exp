/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic_question;

/**
 *
 * @author Monster
 */
public class Logic_Question {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Soru :Güzel,genç bir hanım dostlarına Afrika’dan getirdiği çiçekleri tanıtıyordu:
    ”Şu kırmızı çiçekler her 4 günde bir ,şu maviler her 7 günde bir ,şu sarılarsa her 13 günde
    bir açar.Çiçekler açtıkları günün akşamı da solar.”Ve sonra şöyle dedi:”Gördüğünüz gibi şimdi 
    kırmızı,mavi ve sarı çiçekler hep birlikte açmış durumda.

    Bu çiçeklerin ne zaman tekrar hep birlikte açacağını hesap edin 
    o gün gelin,günü doğru hesap edip gelen bir beyle evlenirim.Siz 
    olsanız kaç gün sonra giderdiniz ? */
    // TODO code application logic here
    
    boolean mavi = false;
    boolean sari = false;
    boolean kirmizi =false;
    
    for(int i =1;i<1000;i++)
    {
    if(i%4 == 0)
    {
        kirmizi = true;
    }
    else{kirmizi = false;}
    
    if(i%7 == 0)
    {
        mavi = true;
    }
    else{mavi = false;}
    
    if(i%13 == 0)
    {
        sari=true;
    }
    else{sari = false;}
    
    if(kirmizi && sari && mavi)
    {
    System.out.println(i + ".Günde");
    }
    }
    
    
    }
    
}
