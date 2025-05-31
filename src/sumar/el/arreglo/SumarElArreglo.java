package sumar.el.arreglo;

public class SumarElArreglo {

    public static void main(String[] args) {
        int arregloNumeros[] = {2,5,1,8,3,8,2,6,9,2,5,8,1,3};
        
        int suma = 0;
        
        for (int i = 0; i < arregloNumeros.length; i++) {
            suma += arregloNumeros[i];
            System.out.println("Suma temporal: " + suma);
        }
        
        System.out.println("Suma: " + suma);

    }

}
