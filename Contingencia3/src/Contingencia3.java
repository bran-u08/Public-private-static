import java.util.Scanner;
import javax.swing.JOptionPane;

public class Contingencia3 {
static int[] array = new int[5];
static Scanner SC = new Scanner(System.in);

public static void main(String[] args) {
insertarDatosArray();
sumarArray();
maxArray();
promedioArray();

Scanner entrada = new Scanner(System.in);
int arreglo[], nElementos,aux;
nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
arreglo = new int[nElementos];
for(int i=0;i<nElementos;i++){
    System.out.print((i+1)+"Digite un numero: ");
    arreglo[i] = entrada.nextInt(); 
}
for(int i=0;i<(nElementos-1);i++){
   for(int j=0;j<(nElementos-1);j++){
   if(arreglo[j]> arreglo[j+1]){ 
    aux = arreglo[j];
    arreglo[j] = arreglo[j+1];
    arreglo[j+1] = aux;
   }  
   } 
}
System.out.print("\nArreglo ordenado en forma creciente: ");
for(int i=0;i<nElementos;i++){
  System.out.print(arreglo[i]+" , ");  
          }
System.out.print("\nArreglo ordenado en forma decreciente: ");
for(int i=(nElementos-1);i>=0;i--){
    System.out.print(arreglo[i]+" , ");
}

}

private static void insertarDatosArray() {
for (int i = 0; i < array.length; i++) {
System.out.print("insertar array[" + i + "]:");
array[i] = SC.nextInt();
}
}

private static void sumarArray() {
System.out.print("Suma: ");
int acumulador = 0;
for (int i = 0; i < array.length; i++) {
acumulador = acumulador + array[i];
System.out.print("+" + array[i]);
}
System.out.println("= " + acumulador);
}

private static void maxArray() {
System.out.print("Maximo: ");
int max = 0;
for (int i = 0; i < array.length; i++) {
if (array[i] > max) {
max = array[i];
}
}
System.out.println(max);
}

private static void promedioArray() {
System.out.print("Promedio: ");
double promedio = 0;
for (int i = 0; i < array.length; i++) {
promedio = promedio + array[i];
}

promedio = promedio / array.length;
System.out.println(promedio);
}
}