package org.example;

public class Clima {
   private float temperatura;
   private float cantidad;
   private float velocidad;
   private float humedad;
   private float presion;

    public Clima(float temperatura, float cantidad, float velocidad, float humedad, float presion) {
        this.temperatura = this.temperatura;
        this.cantidad = this.cantidad;
        this.velocidad = this.velocidad;
        this.humedad = this.humedad;
        this.presion = this.presion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    public void Alarmas(){
        if(temperatura>20){
            System.out.println("Alerta de lluvia intensa!¡");
            System.out.println("ACTIVANDO SISTEMA DE RIEGO");
        }
        if(velocidad>15){
            System.out.println("ALERTA DE VIENTO FUERTE!¡");
            System.out.println("SE PROCEDEN A CERRAR PERSIANAS");
        }
    }
    public void Notificacion(){
        System.out.println("temperatura:"+getTemperatura());
        System.out.println("humedad:"+getHumedad());
        System.out.println("usuarios notificados:");
    }

}
