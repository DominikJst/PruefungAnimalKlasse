package javaapplication1.Classes;

public class Animal {
    private String name;
    private int alter;
    private String tierart;
    private double futtermenge;
    private int fuetterungen;


    public Animal(String name, int alter, String tierart, double futtermenge, int fuetterungen){
        this.name = name;
        this.alter = alter;
        this.tierart = tierart;
        this.futtermenge = futtermenge;
        this.fuetterungen = fuetterungen;
    }


    public String getTierart() {
        return tierart;
    }

    public void setTierart(String tierart) {
        this.tierart = tierart;
    }

    public double getFuttermenge() {
        return futtermenge;
    }

    public void setFuttermenge(double futtermenge) {
        this.futtermenge = futtermenge;
    }

    public int getFuetterungen() {
        return fuetterungen;
    }

    public void setFuetterungen(int fuetterungen) {
        this.fuetterungen = fuetterungen;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.tierart;
    }


}
