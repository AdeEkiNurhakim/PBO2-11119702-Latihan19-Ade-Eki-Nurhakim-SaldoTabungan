/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldotabungan;

/**
 *
 * @author Ekiw
 */
public class SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main (String [] args) {
     int a=1;
     double saldo, bunga, hasil;
     saldo = 2500000;
     saldo = saldo+(0.15*saldo);
     while (saldo<=60000000) {
     saldo = saldo+(0.15*saldo);
     System.out.println("Saldo Dibulan Ke- "+ a + " Rp "+saldo);
     a++;
     }
}
}
