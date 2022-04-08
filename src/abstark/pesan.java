/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstark;

/**
 *
 * @author ASUS
 */
public class pesan extends pemesanan {


    @Override
    public void merk() { //value untuk merk minuman
        System.out.println(" ");
        System.out.println("Jenis minuman yang tersedia : ");
        System.out.println("1.Soda, 2.Air mineral");

        System.out.println("====================================");
    }

    @Override
    public void soda() { //value untuk merk minuman
        System.out.println(" ");
        System.out.println("minuman soda yang tersedia : ");
        System.out.println("Coca Cola, pepsi");

    }

    @Override
    public void airmineral() { //value untuk merk minuman
        System.out.println(" ");
        System.out.println("minuman mineral yang tersedia : ");
        System.out.println("Aqua, Cleo");
    }
