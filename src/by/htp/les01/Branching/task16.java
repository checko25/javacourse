/* На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task16 {
    public static void main(String args[]){
        int x,y;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите значение координаты x");
        x = scn.nextInt();
        System.out.println("Ведите значение координаты y");
        y = scn.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("Точка находится в начале координат.");
	} else if (x == 0) {
            System.out.println("Точка расположена на оси Y");
	} else if (y == 0) {
            System.out.println("Точка расположена на оси X");
	} else if (x > 0 && y > 0) {
            System.out.println("Точка расположена в I четверти");
	} else if (x < 0 && y > 0) {
            System.out.println("Точка расположена во II четверти");
	} else if (x < 0 && y < 0) {
            System.out.println("Точка расположена в III четверти");
	} else if (x > 0 && y < 0) {
            System.out.println("Точка расположена в IV четверти");
		}
    }
}
  

