/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {
    static ArrayList<SinhVien> ds = new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        Scanner sc= new Scanner (System.in);
        int chon=0;
        do{
            System.out.println("===========CHUONG TRINH QUAN LY SINH VIEN================");
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Xuat danh sach sinh vien");
            System.out.println("3.Xuat sinh vien co hoc luc gioi");
            System.out.println("4.Sap xep sinh vien theo diem");
            System.out.println("5.ket thuc");
            System.out.println("----------------------------------------------");
            System.out.print("Ban chon(1-5):");
            chon= sc.nextInt();
            switch (chon){
                case 1:
                    nhapDS();
                    break;
                case 2:
                    xuatDS();
                    break;
                case 3:
                    xuatSVGioi();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    System.out.println("Goobye.see later");
                    break;
            }
        }while (chon!=5);
    }

    private static void nhapDS() {
        System.out.println("Thuc hien nhap");
        SinhVien sv=null;
        int chon =0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Cho biet loai sinh vien(IT:1,Biz:2):");
        chon= sc.nextInt();
        if(chon==1){
            System.out.println("Cho biet ho ten:");
            String hoten=sc.nextLine();
            System.out.print("Diem mon java:");
            double java=sc.nextDouble();
            System.out.print("Diem mon css:");
            double css=sc.nextDouble();
            System.out.print("Diem mon html:");
            double html=sc.nextDouble();
            sv = new SinhVienIT(hoten, java, css, html);
        }else if(chon==2){
            System.out.print("Cho biet ho ten:");
            String hoten=sc.nextLine();
            System.out.print("Diem mon marketing:");
            double marketing=sc.nextDouble();
            System.out.print("Diem mon sales:");
            double sales=sc.nextDouble();
            sv = new SinhVienBiz(hoten, marketing, sales);
        }if(sv!=null){
            ds.add(sv);
        }
    }

    private static void xuatDS() {
        System.out.println("Thuc hien xuat toan bo sinh vien:");
        for(SinhVien sv : ds){
            System.out.println(sv);
        }
    }

    private static void xuatSVGioi() {
        System.out.println("Thuc hien xuat sinh vien hoc luc gioi");
        for(SinhVien sv : ds){
            if(sv.getDiem()>=7.5 && sv.getDiem()<9){
                sv.xuat();
            }
        }
    }

    private static void sapXep() {
        System.out.println("thuc hien sap xep:");
        Comparator<SinhVien> tieuchi= new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.valueOf(sv1.getDiem()).compareTo(Double.valueOf(sv2.getDiem()));
            }
            
        };
        Collections.sort(ds,tieuchi);
    }
}
