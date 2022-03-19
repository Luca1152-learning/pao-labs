package com.example.pao_lab2_e2.model;

public class Chocolate extends Product {
    private int kl;

    public Chocolate(int id, String name, int kl) {
        super(id, name);
        this.kl = kl;
    }

    public int getKl() {
        return kl;
    }

    public void setKl(int kl) {
        this.kl = kl;
    }
}
