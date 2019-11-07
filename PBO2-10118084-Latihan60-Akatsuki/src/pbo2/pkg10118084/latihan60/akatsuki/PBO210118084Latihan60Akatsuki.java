/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan60.akatsuki;

/**
 *
Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan karakter akatsuki

 */
public class PBO210118084Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Konohagakure konohagakure1;
        konohagakure1 = new Konohagakure("Konoha","Uciha itachi","Api","mata sharingan");
        System.out.println("");
        konohagakure1.Displaykarakter();
        Konohagakure konohagakure2;
        konohagakure2 = new Konohagakure("Konoha","Tobi","Api","menggunakan Topeng");
        System.out.println("");
        konohagakure2.Displaykarakter();
        Amegakure amegakure1;
        amegakure1=new Amegakure("Amegakure","Pain","Tanah","mata rinnegan");
        System.out.println("");
        amegakure1.Displaykarakter();
        iwagakure iwagakure1;
        iwagakure1 = new iwagakure("iwagakure","deidara","api","berambut kuning");
        System.out.println("");
        iwagakure1.Displaykarakter();
        
    }
    
}
