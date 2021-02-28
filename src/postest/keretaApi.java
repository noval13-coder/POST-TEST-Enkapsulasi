/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postest;
public class keretaApi {
 //membuat variabel
    private double penumpang;
    private double maxPenumpang;
    private double counter;
    private double penumpangBaru;
    private double hargaTiket ;
    private char namaPenumpang = 'a';
    //konstruktor kelas keretaApi
    public keretaApi (int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;}
    //menambahkan penumpang melalui method mutator
    public void addPenumpang (int penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang Melebihi Kuota yang Disediakan");
        }else{
            this.penumpang=temp;
            counter++;}}
    public void getPenumpang (int password){
        if (password == 123){
            System.out.println("Password Benar, jumlah penumpang ditambah 5");
            addPenumpang(6);
           
       }else{
            System.out.println("Password Salah, tidak ada penambahan penumpang");}}
    public double getAverage(){
        return penumpang/counter;}
    public void addPembayaran(){
        hargaTiket = 26000;
       double total = penumpang* hargaTiket;
        System.out.println("Total Pembayaran = Rp"+total);}
    public void getTotalPembayaran (){
        System.out.println("Rp"+hargaTiket*penumpang);}
    //membuat method untuk menampilkan jumlah penumpang 
    public void cetak(){
        System.out.println("Penumpang Kereta Api Sekarang adalah = "+penumpang);
        System.out.println("Penumpang Maksimum seharusnya adalah = "+maxPenumpang);}}