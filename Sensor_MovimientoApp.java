/*
Diseñe e implemente una clases Sensor_Movimiento que contenga los siguientes atributos: frecusensor de tipo entero,
codsensor de tipo String,tipsensor de tipo String,entSensor de tipo int.
Diseñe e implemente sus respectivos métodos get( ) y set ( ) correspondientes para cada atributo,
además implemente el método to String( ) para mostrar la información relativa a la clases Sensor_Movimiento
En la clase principal main( ),diseñe e implemente 2 objetos Sensor_Movimiento ,con sus valores que considere
necesarios y muestre por pantalla.
Por ultimo , imprime cuál de los 2 objetos tiene más entsensor.

*/
package sensor_movimientoapp;

/**
 *
 * @author Lenin Paul
 */

class Sensor_Movimiento{
 /*Atributos*/
private int frecusensor;
private String codsensor;
private String tipsensor;
private int entsensor;

/*Constructor*/
public Sensor_Movimiento(int pFrecusensor,String pCodsensor ,String pTipsensor ,int pEntsensor){
   frecusensor=pFrecusensor;
   codsensor=pCodsensor;
   tipsensor=pTipsensor;
   entsensor=pEntsensor;
}
  /*Metodos*/
public int getFrecusensor(){
    return frecusensor;
}
public void setFrecusensor(int frecusensor){
    this.frecusensor= frecusensor;
}
public String getCodsensor(){
    return codsensor;
}
public void setCodsensor(String codsensor){
    this.codsensor= codsensor;
}
public String getTipsensor(){
    return tipsensor;
}
public void setTipsensor(String tipsensor){
    this.tipsensor= tipsensor;
}
public int getEntsensor(){
    return entsensor;
}
public void setEntsensor(int entsensor){
    this.entsensor= entsensor;
}
@Override
public String  toString(){
  return "El Sensor de Movimiento"+ frecusensor+" con CODIGO "+codsensor+" -- "
          + " Determinado por el "+tipsensor
          + " tiene un determinado numero de:" +entsensor+ " entradas ";

}
}

public class Sensor_MovimientoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Creamos los objetos
        Sensor_Movimiento tipo1 = new Sensor_Movimiento(74157 , " frecusensor1" , " tipsensor1" , 7);
        Sensor_Movimiento tipo2 = new Sensor_Movimiento(74158 , " frecusensor2" , " tipsensor2" , 8);

        //Mostramos su estado
        System.out.println(tipo1.toString());
        System.out.println(tipo2.toString());
         //Modificamos el atributo
         tipo1.setEntsensor(9);
         //Comparamos quien tiene mas entradas
         if(tipo1.getEntsensor()<tipo2.getEntsensor()){
             System.out.println(tipo1.getTipsensor()+ " Tiene mas entradas");
         }else{
             System.out.println(tipo2.getTipsensor()+ " Tiene mas entradas");

         }






    }

}
