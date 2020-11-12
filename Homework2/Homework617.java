import java.util.Scanner;

public class Homework617 {
     public static void main(String[]args){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter n：");
         int n = input.nextInt();

         printMatrix(n);
         input.close();
     }
     public static void printMatrix(int n){
         for (int row = 1;row <= n;row++)    //每行n个
         {
             for (int column = 1;column <= n;column++)//共有n列
             {
                 System.out.printf("%d ",(int)(Math.random()*2));//生成0 1 随机数
             }
             System.out.print("\n");
         }
     }


}
