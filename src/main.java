@SuppressWarnings("all")
public class main {
    public static void main(String[] args) {

        Mascota[] mascotas = new Mascota[4];

        mascotas[0] = new Mascota("Luna", "Perro", 28.5, 9);
        mascotas[1] = new Mascota("Michi", "Gato", 4.2, 3);
        mascotas[2] = new Mascota("Rocky", "Perro", 12.0, 5);
        mascotas[3] = new Mascota("Pepa", "Conejo", 2.1, 1);

        int total = 0;

        for (int i = 0; i < mascotas.length; i++) {
            Mascota m = mascotas[i];

            System.out.println(m.descripcion());
            System.out.println("Valor consulta: $" + m.valorConsulta());

            total = total + m.valorConsulta();

            System.out.println();
        }

        System.out.println("TOTAL RECAUDADO: $" + total);

        System.out.println();
        System.out.println("Intentando cambiar el peso de Michi...");

        mascotas[1].setPeso(-3);

        System.out.println(mascotas[1].descripcion());
    }
}
