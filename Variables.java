
package elenap;

//Variables o metodos de clases son static
//Variables o metodos de instancia no son static.
//Para acceder a un metodo o variable static es : NombreClass.Metodo
// o NombreClase.Variable

class CuentaBancaria{
      public int saldo;
       public static int numero=0;
    }

public class Variables {

    public static void sumarSaldo(CuentaBancaria cta){
             cta.saldo +=10;
        }
         
        public static void sumarSaldo(int saldo){
            saldo +=10;
        }   
        
        //Crear minio 10 objeto de CuebtaBancaria, probar y probar
    public static void main(String[] args) {
        
        CuentaBancaria ct1= new CuentaBancaria();
        CuentaBancaria ct2=ct1;
        CuentaBancaria ct4=ct2;
        ct1.saldo=1000;
        
        
        sumarSaldo(ct1);
        sumarSaldo(ct2);
        System.out.println("Total del saldo 1:" +ct1.saldo);//imprime 1020
        System.out.println("Total del saldo 2:"+ct2.saldo);//imprime 1020
        
        ct2.saldo=250;
        CuentaBancaria ct3 = ct1;
        sumarSaldo(ct3);
        System.out.println("Total del saldo 3:" +ct3.saldo);//imprime 260

        
        ct4.saldo=50;
        sumarSaldo(ct3);
        sumarSaldo(ct4);
        sumarSaldo(ct2);
        sumarSaldo(ct2);
        System.out.println("Total del saldo 4:" +ct4.saldo);//imprime 90
        
        CuentaBancaria ct5=ct3;
        ct5.saldo=80;
        sumarSaldo(ct5);
        sumarSaldo(ct3);
        sumarSaldo(ct2);
        System.out.println("Total del saldo 5:" +ct5.saldo);//imprime 110
        
        CuentaBancaria ct6=ct3;
        ct6.saldo=10*2;
        sumarSaldo(ct5);
        sumarSaldo(ct3);
        System.out.println("Total del saldo 6:" +ct5.saldo);//imprime 40
        
        
       CuentaBancaria ct7=ct6;
        ct7.saldo=10/2;
        sumarSaldo(ct7);
        sumarSaldo(ct7);
        System.out.println("Total del saldo 7:" +ct7.saldo);//imprime 25
        
        CuentaBancaria ct8=ct1;
        ct8.saldo=10*23;
        sumarSaldo(ct5);
        sumarSaldo(ct8);
        System.out.println("Total del saldo 8:" +ct8.saldo);//imprime 250
        
        CuentaBancaria ct9=ct8;
        ct9.saldo=-150;
        sumarSaldo(ct5);
        sumarSaldo(ct6);
        System.out.println("Total del saldo 9:" +ct9.saldo);//imprime -130
        
        CuentaBancaria ct10=ct9;
        ct6.saldo=  -36*6;
        sumarSaldo(ct9);
        sumarSaldo(ct10);
        System.out.println("Total del saldo 10:" +ct10.saldo);//imprime -196
        
        //ELENA ELIZABETH PIHUABE LARA
        
    }
    
}
