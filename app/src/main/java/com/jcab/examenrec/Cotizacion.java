package com.jcab.examenrec;

public class Cotizacion {
    private int plazo, folio;
    private float valorAuto,porEncganche;
    private String Descripcion;

    Cotizacion(){

    }
    Cotizacion( int a, int b, float c){
        plazo = b;
        valorAuto = a;
        porEncganche = c;
    }

    public int generarFolio(){
        return (int)(Math. random()*10+1);
    }

    public float calcularEnganche(){
        return (porEncganche/100)*valorAuto;
    }

    public float calcularPagoMesnsual(){
        return calcularEnganche()/plazo;
    }

}
