public class App {
    public static void main(String[] args) throws Exception {

        int array[] = generaAleatorios(10, 0, 200);
        muestraArray(array);
        int nuevoArray[] = alternaNumeros(array);
        muestraArray(nuevoArray);
    }

    public static void muestraArray(int array[]) {
        System.out.print("┌────────");
        for (int i = 0; i < array.length; i++)
            System.out.print("┬─────");
        System.out.println("┐");

        System.out.print("│ Indice ");
        for (int i = 0; i < array.length; i++)
            System.out.printf("│%4s ", i);
        System.out.println("│");

        System.out.print("├────────");
        for (int i = 0; i < array.length; i++)
            System.out.print("┼─────");
        System.out.println("┤");

        System.out.print("│ Valor  ");
        for (int i = 0; i < array.length; i++)
            System.out.printf("│%4s ", array[i]);
        System.out.println("│");

        System.out.print("└────────");
        for (int i = 0; i < array.length; i++)
            System.out.print("┴─────");
        System.out.println("┘");
        System.out.println();
    }

    public static int[] alternaNumeros(int array[]) {
        int menores[] = new int[array.length];
        int mayores[] = new int[array.length];
        int lenMenor = 0, lenMayor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 100)
                menores[lenMenor++] = array[i];
            else
                mayores[lenMayor++] = array[i];
        }
        int resultado[] = new int[array.length];
        int i = 0, j = 0, k = 0;
        while (i < array.length) {
            if (j < lenMenor)
                resultado[i++] = menores[j++];
            if (k < lenMayor)
                resultado[i++] = mayores[k++];
        }
        return resultado;
    }

    public static int[] generaAleatorios(int cantidad, int min, int max) {
        int aleatorios[] = new int[cantidad];
        for (int i = 0; i < aleatorios.length; i++)
            aleatorios[i] = (int)(Math.random() * (max - min + 1)) + min;
        return aleatorios;
    }
}
