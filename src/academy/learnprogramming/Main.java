package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myNumber=0;
        int count = 0;

        for (int i=1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " can be divided by 3 and 5");
                myNumber += i;
                count++;
            }

            if (count == 5) {
                break;
            }
        }
        System.out.println("Total of " + count + " numbers above is " + myNumber);
    }
}
