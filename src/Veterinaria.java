
class Mascota {
    private String nombre;
    private String especie;
    private double peso;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, double peso, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    // Setter del peso con validacion
    public void setPeso(double peso) {
        if (peso <= 0) {
            System.out.println("RECHAZADO: el peso debe ser mayor que cero");
            return;
        }

        this.peso = peso;
    }

    // Setter de la edad con validacion
    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("RECHAZADO: la edad no puede ser negativa");
            return;
        }

        this.edad = edad;
    }

    // Calcular valor de la consulta
    public int valorConsulta() {
        int valor;

        if (peso > 25) {
            valor = 55000;
        } else if (peso > 10) {
            valor = 45000;
        } else {
            valor = 35000;
        }

        if (edad >= 8) {
            valor = valor + 12000;
        }

        return valor;
    }

    // Descripcion con año o años
    public String descripcion() {
        String textoEdad;

        if (edad == 1) {
            textoEdad = " año)";
        } else {
            textoEdad = " años)";
        }

        return nombre + " (" + especie + ", " + peso
                + " kg, " + edad + textoEdad;
    }
}

public class Veterinaria {
    public static void main(String[] args) {

        // Crear el arreglo de mascotas
        Mascota[] mascotas = new Mascota[4];

        // Guardar las mascotas en el arreglo
        mascotas[0] = new Mascota("Luna", "Perro", 28.5, 9);
        mascotas[1] = new Mascota("Michi", "Gato", 4.2, 3);
        mascotas[2] = new Mascota("Rocky", "Perro", 12.0, 5);
        mascotas[3] = new Mascota("Pepa", "Conejo", 2.1, 1);

        int total = 0;

        // Recorrer el arreglo con un for
        for (int i = 0; i < mascotas.length; i++) {
            Mascota m = mascotas[i];

            System.out.println(m.descripcion());
            System.out.println("Valor consulta: $" + m.valorConsulta());

            total = total + m.valorConsulta();

            System.out.println();
        }

        // Mostrar el total recaudado
        System.out.println("TOTAL RECAUDADO: $" + total);

        // Intentar asignar un peso invalido a Michi
        System.out.println();
        System.out.println("Intentando cambiar el peso de Michi...");

        mascotas[1].setPeso(-3);

        // Comprobar que el peso no cambio
        System.out.println(mascotas[1].descripcion());
    }
}
