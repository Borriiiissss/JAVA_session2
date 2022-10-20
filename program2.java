// Написать программу, 
// показывающую последовательность действий для игры “Ханойская башня”

// public class program2 {
//     public static void move(int n, int startPole, int endPole) {
//         if (n == 0) {
//             return;
//         } 
//         int intermediatePole = 6 - startPole - endPole;
//         move(n-1, startPole, intermediatePole);
//         System.out.println("Переместить " + n + " из " + startPole + " в " +endPole);      
//         move(n-1, intermediatePole, endPole);
//     } 
//     public static void main(String[] args) {
//         move(3, 1, 3);
//     }
// }

// Реализовать алгоритм сортировки вставками

// public class program2 {
//     public static void print_arr_fun(int arr1 []) {      // вывода массива в консоль
//         for (int i = 0; i < arr1.length; i++) {
//             System.out.print(arr1[i] + " ");
//         }
//         System.out.println();
//     }
//     static int [] compare_elements (int arr1 [], int i) {
//         for (int j = 0; j < i; j++) {           // проходим полевой части массива
//             if (arr1[i] <= arr1[j]){            // если нужно переставить
//                 int tmp = arr1[i];              // запоминаем переставляемый элемент
//                 for (int m = i; m > j; m--){    // сдвигаем левую часть
//                     arr1[m] = arr1[m-1];
//                 }
//                 arr1[j] = tmp;                 // вставляем элемент в пордке возрастания
//             }        
//         }
//         return arr1;   
//     }
//     public static void main(String[] args) {    // заполняем массив
//         int [] arr1 =new int [15];
//         for (int i = 0; i < arr1.length; i++) {
//             arr1[i] = (int) (Math.random() * 100);                    
//         }
//         print_arr_fun(arr1);        
//         for (int i = 1; i < arr1.length; i++) { // перебираем массив со второго элемента
//             compare_elements (arr1, i);         // отправляем поочередно каждый элемент для сравнения
//         }
//         print_arr_fun(arr1);
//     }    
// }