/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116579.latihan6.kambingstatic;

/**
 *
 
 */
 

    //Variabel jumlahKambing dideklarasikan sebagai static
    
public class KambingStatic {
    
    public static int jumlahKambing;

    //Nama kambing sebagai konstanta
    
    public static final String Nama_Kambing ="MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        KambingStatic.jumlahKambing= 485000;
        System.out.println(Nama_Kambing + " memiliki kambing sebanyak" 
                                   +KambingStatic.jumlahKambing);
    }
    
}
