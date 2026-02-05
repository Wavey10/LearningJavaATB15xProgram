package Lab001_ex_level4;

public class SecondHighestInArray {

    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        int max=numbers[0];
        int max2=numbers[1];

        for (int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>max)
            {
                max2=max;
                max=numbers[i];
            }

        }
        System.out.println("The first highest number is:" +max);
        System.out.println("The second highest number is:" +max2);

    }
}
