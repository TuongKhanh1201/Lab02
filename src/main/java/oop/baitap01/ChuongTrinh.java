/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {
    public static void main(String[] args) {
        Rectangle r1;
        Rectangle r2;
        
        r1=new Rectangle(9,6);
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Cho biet chieu dai:");
        double dai=sc.nextDouble();
        System.out.print("Cho biet chieu rong:");
        double rong=sc.nextDouble();
        
        r2=new Rectangle (dai,rong);
        // xuat thong tin ket qua
        System.out.println("Thong tin HCN thu 01");
        System.out.println(r1+ " - Dien tich :" + r1.findArea() + "- Chu vi:" + r1.findPerimeter());
        System.out.println("Thong tin HCM thu 02");
        System.out.println(r2+ "-Dien tich:" +r2.findArea() + "-Chu vi:" +r2.findPerimeter());
    }
}
