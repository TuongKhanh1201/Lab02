/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap04;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {
    public static void main(String[] args) {
        HinhTron ht=new HinhTron(5);
        System.out.println("Hinh Tron: Ban kinh:"+ ht.getBankinh() +",Dien tich:" + ht.tinhDienTich() + ",Chu vi:" + ht.tinhChuVi());
        
        HinhTru htru=new HinhTru(5,2);
        System.out.println("Hinh Tru: Ban kinh:" +ht.getBankinh() +
                ", Chieu cao:" +htru.getChieucao() +
                ",Dien tich:" +htru.tinhDienTich() +
                ",The tich:" +htru.tinhTheTich());
    }
}
