package com.codigoHache.Class;

public class SmartDevice {

    public String fabricante;
    public   String modelo;
    public int year;
    public   boolean sport;
    public double interfaz;

    public MicroProcesador microProcesador;

    public SmartDevice() {
    }
    public SmartDevice(String fabricante, String modelo, int year, boolean sport) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.sport = sport;
        this.interfaz = 2 ;
    }

    public void descarga (int quantity){
        this.interfaz =+ quantity;
    }
}
