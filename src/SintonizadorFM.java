public class SintonizadorFM {
        private double frecuencia;
        //HOLA SOY ELISABET MAESTRE!!!
        // ESTE ES EL CAMBIO
        public SintonizadorFM() {
            frecuencia = 99;
        }
        public SintonizadorFM(double frecuencia) {
            if(frecuencia < 99)
                this.frecuencia = 99;
            else if (frecuencia > 108)
                this.frecuencia = 108;
            else
                this.frecuencia = frecuencia;
        }

        public void display() {               // Muestra la frecuencia actual.
            System.out.println("Frecuencia: " + frecuencia + " MHz");
        }

        public void down() {                
            frecuencia -= 0.5;
            comprobarRango();
        }

        public void up() {                    // Sube la frecuencia 0.5 MHz y luego verifica si sigue dentro del rango permitido (salta al metodo comprobarRango).
            frecuencia += 0.5;
            comprobarRango();
        }

        private void comprobarRango() {      // Metodo privado que ajusta la frecuencia si esta se encuentra fuera del rango (80-108 MHz).
            if(frecuencia < 80)
                frecuencia = 108;            // Si la frecuencia es menor a 80, se ajusta a 108.
            else if (frecuencia > 108)
                frecuencia = 99;             // Si la frecuencia es mayor a 108, se ajusta a 80.
        }
    }
