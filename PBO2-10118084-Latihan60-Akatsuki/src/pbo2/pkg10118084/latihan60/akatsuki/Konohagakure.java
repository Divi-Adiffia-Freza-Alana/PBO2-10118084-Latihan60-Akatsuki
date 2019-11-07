/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan60.akatsuki;

/**
 *
 * @author Freza
 */
public class Konohagakure extends DaerahAsalKarakter {
    private String desa;

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public Konohagakure(String desa, String nama, String elemen, String ciri) {
        super(nama, elemen, ciri);
        this.desa = desa;
    }

    @Override
    public void Displaykarakter() {
        System.out.println("Nama : "+nama);
        System.out.println("elemen : "+elemen);
        System.out.println("Ciri : "+ciri);
        System.out.println("Desa : "+desa);
    }
    
    
    
}
