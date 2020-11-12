import java.util.Scanner;

public class Homework710 {
    public static void  main(String[]args){
        double[]myList = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + myList.length+" values: ");
        for (int i = 0; i < myList.length;i++) {
            myList[i] = input.nextDouble();
        }
        System.out.println("index0fSmallestElement: "+index0fSmallestElement(myList));
        input.close();

    }
    //先默认最小数是数组最左端的数字，和后面的数依次做比较，如遇见更小的数字，则更新min及其对应的下标
    public static int index0fSmallestElement(double[]myList){
        double min = myList[0];
        int indexOfSmallest = 0;
        for (int i= 1;i < myList.length;i++)
        {
            if (myList[i]<min)
            {
                min=myList[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

}
