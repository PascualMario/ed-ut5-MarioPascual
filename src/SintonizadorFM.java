public class SintonizadorFM {         // Clase SintonizadorFM que gestiona la frecuencia de una estación de radio.
        private double frecuencia;        // Creamos la variable frecuencia de forma privada (para protegerla)

        public SintonizadorFM() {         // Constructor con el mismo nombre que la clase (obligatorio) y público para acceder a el al crear un objeto.
            frecuencia = 80;              // Inicializamos frecuencia con un valor por defecto de 80
        }
        public SintonizadorFM(double frecuencia) {
            if(frecuencia < 80)
                this.frecuencia = 80;     // Asignar el valor 80 si la frecuencia es menor que 80 MHz.
            else if (frecuencia > 108)    // Asignar el valor 108 si la frecuencia es mayor que 108 MHz.
                this.frecuencia = 108;
            else
                this.frecuencia = frecuencia; // Asignar la frecuencia proporcionada si está en el rango válido.
        }

        public void display() {               // Muestra la frecuencia actual.
            System.out.println("Frecuencia: " + frecuencia + " MHz");
        }

        public void down() {                  // Baja la frecuencia 0.5 MHz y luego verifica si sigue dentro del rango permitido (salta al metodo comprobarRango).
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
                frecuencia = 80;             // Si la frecuencia es mayor a 108, se ajusta a 80.
        }
    }
