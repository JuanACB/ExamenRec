package com.jcab.examenrec;

public class Cotizacion {
    private int plazo, folio;
    private float valorAuto,porEncganche;
    private String Descripcion;

    Cotizacion( int a, int b, float c){

    }

    public int generarFolio(){
        return 0;
    }

    public float calcularEnganche(){
        return (porEncganche/100)*valorAuto;
    }

    public float calcularPagoMesnsual(){
        return calcularEnganche()/plazo;
    }

}
