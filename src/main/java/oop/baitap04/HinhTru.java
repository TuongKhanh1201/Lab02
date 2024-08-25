/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap04;

/**
 *
 * @author ADMIN
 */
public class HinhTru extends HinhTron {

    private double chieucao;

    public HinhTru() {
        super(1.0);
        chieucao = 1.0;
    }

    public HinhTru(double chieucao, double bankinh) {
        super(bankinh);
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double tinhDienTichHtru() {
        return super.tinhDienTich() + super.tinhChuVi() * chieucao;
    }

    public double tinhTheTich() {
        return super.tinhDienTich() * chieucao;
    }

}
