/**
 * FileName: compare
 * Author:   Lenovo
 * Date:     5/6/2019 8:23 AM
 * Description:
 * History:
 */
package practise190506;

//algorithm for bubbles
public class Compare {
    public static void main(String[] args) {
        int a[] = {4,3,2,5,1};
        System.out.println("The original array is: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        System.out.println();
        System.out.println("The assorted array is : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]);
        }
    }
}
