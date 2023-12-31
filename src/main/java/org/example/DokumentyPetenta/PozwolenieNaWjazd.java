package org.example.DokumentyPetenta;


import org.example.DaneGryDoGenerowania.CelePrzyjazdu;
import org.example.DaneGryDoGenerowania.DataWaznosci;

import java.util.Arrays;
import java.util.Random;

public class PozwolenieNaWjazd {

    private String imie;
    private String kodPaszportu;
    private String celPrzyjazdu;
    private String czasPrzyjazdu;
    private String[] dataWaznosci;
    private int kodBledu;
    private Random random;

    public PozwolenieNaWjazd(String imie,String kodPaszportu,int kodBledu){
        this.imie = imie;
        this.kodPaszportu = kodPaszportu;
        this.kodBledu = kodBledu;
        random = new Random();
        celPrzyjazdu = CelePrzyjazdu.getCelPrzyjazdu();
        czasPrzyjazdu = CelePrzyjazdu.getCzasPrzyjazdu(celPrzyjazdu);
        dataWaznosci = DataWaznosci.generateRandomDataWaznosciString().split("/");
    }

    public int getKodBledu(){
        return kodBledu;
    }
    @Override
    public String toString(){
        return imie +"/" + kodPaszportu + "/" + celPrzyjazdu + "/" + czasPrzyjazdu + "/" + Arrays.toString(dataWaznosci) + "/" + kodBledu;
    }





}
