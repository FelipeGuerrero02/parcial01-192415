/**
 * areapoligono
 */
import java.util.Scanner;
public class areapoligono {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        //area triangulo
        Scanner SC =new Scanner (System.in);
        System.out.println("ingrese base y altura del triangulo: ");
        double basetriangulo=SC.nextDouble();
        double alturatriangulo=SC.nextDouble();
        final double DENOMINADOR=2;
        double areatriangulo=(basetriangulo*alturatriangulo)/DENOMINADOR;
        System.out.println("El area del triangulo es: " + areatriangulo);
        //area cuadrado
        System.out.println("ingrese el valor de la arista del cuadrado");
        double arista=SC.nextDouble();
        double areacuadrado=arista*arista;
        System.out.println("el area del cuadrado es: " + areacuadrado);
        //area rectangulo
        System.out.println("ingrese base y la altura del rectangulo");
        double base=SC.nextDouble();
        double altura=SC.nextDouble();
        double arearectangulo=base*altura;
        System.out.println("el area del rectangulo es: " + arearectangulo);
    }
}
