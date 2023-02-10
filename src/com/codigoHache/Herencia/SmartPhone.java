package com.codigoHache.Herencia;


import com.codigoHache.Class.SmartDevice;
import com.codigoHache.Class.MicroProcesador;
public class SmartPhone extends SmartDevice {
    double dimension;
    int camaras;

    public SmartPhone() {

    }

    public SmartPhone(String fabricante, String modelo, int year, boolean sport, double dimension, int camaras) {
        super(fabricante, modelo, year, sport);
        this.dimension = dimension;
        this.camaras = camaras;
    }
}
