package com.codigoHache.Herencia;


import com.codigoHache.Class.SmartDevice;
import com.codigoHache.Class.MicroProcesador;
public class SmartWatch extends SmartDevice {

        boolean pulsera;

        public SmartWatch() {

        }

    public SmartWatch(boolean pulsera) {
        this.pulsera = pulsera;
    }

    public SmartWatch(String fabricante, String modelo, int year, boolean sport, boolean pulsera) {
        super(fabricante, modelo, year, sport);
        this.pulsera = pulsera;
    }
}

