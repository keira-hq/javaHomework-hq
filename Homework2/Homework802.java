import java.util.Scanner;

public class Homework802 {
    public static void  main(String[]args){
        //创建数组matrix
        double[][] matrix = new double[4][4];
        //接受输入，创建二维数组
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a " + matrix.length+"-by-"+ matrix[0].length+" matrix row by row: ");
        for (int row = 0; row < matrix.length;row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        //调用方法，输出主对角线的和
        System.out.println("sum of the elements in the major digital is "+sumMajorDiagonal(matrix));
        input.close();
    }
public static  double sumMajorDiagonal(double[][] m){
    int len= m.length;
    double sum = 0.0;
    for (int i=0;i<len;i++){
        sum+=m[i][i];
    }
    return sum;

    }



}

