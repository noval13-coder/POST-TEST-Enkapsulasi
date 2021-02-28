/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postest;

public class testKeretaApi {
    public static void main(String[] args) {
        //membuat objek baru
        keretaApi baru = new keretaApi(40);
        
        baru.cetak();
        
        baru.getPenumpang(123);
        baru.cetak();
        
        baru.getPenumpang(123);
        baru.cetak();
        
        baru.getPenumpang(1);
        baru.cetak();
        
        System.out.println("Rata-rata Jumlah Penumpang Kereta Api = "+baru.getAverage());
        baru.addPembayaran();
    }
}
