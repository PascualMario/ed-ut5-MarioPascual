public class SintonizadorFMApp {
    public static void main(String[] args) {
        // Creamos tres objetos SintonizadorFM con diferentes frecuencias.
        SintonizadorFM frecuenciaAutomatica = new SintonizadorFM();
        SintonizadorFM frecuenciaManual1 = new SintonizadorFM(107);
        SintonizadorFM frecuenciaManual2 = new SintonizadorFM(200);

        // Baja 1 MHz el primer sintonizador.
        for (int i=0; i<2; i++) {           // Baja 0.5 MHz dos veces (total: 1 MHz). Es decir, ejecuta lo que hay dentro del for dos veces.
            frecuenciaAutomatica.down();
        }

        // Sube 2 MHz el segundo sintonizador.
        for (int i=0; i<4; i++) {           // Sube 0.5 MHz cuatro veces (total: 2 MHz). Es decir, ejecuta lo que hay dentro del for cuatro veces.
            frecuenciaManual1.up();
        }
        // Mostramos las frecuencias de cada sintonizador.
        System.out.println("Resultados:");
        System.out.println("Hola soy Miguel Hernanadez editando y subiendo con git a github");
        frecuenciaAutomatica.display();
        frecuenciaManual1.display();
        frecuenciaManual2.display();
    }
}