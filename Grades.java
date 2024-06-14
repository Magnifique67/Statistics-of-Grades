import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        // Entering the number of students
        System.out.println("Enter number of students: ");
        N = input.nextInt();
        input.nextLine();
        int[] scores = new int[N];
        // Entering the grades of the students
        System.out.print("Enter grades of " + N + " students: ");
        String arrayLine = input.nextLine();
        String[] array = arrayLine.split(" ");
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(array[i]);
            System.out.print(scores[i]);
        }
        input.close();

        int max = maxGrade(scores);
        int min = minGrade(scores);

        System.out.println("Values:");
        System.out.println("");
        System.out.println("The maximum grade is " + max);
        System.out.println("The minimum grade is " + min);
        float avg = averageGrade(scores, N);
        System.out.println("The average grade is " + avg);
        System.out.println("  ");

        barGraph(scores);
    }

    // calculating maximum grade of the class
    public static int maxGrade(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    // calculating minimum grade of the class
    public static int minGrade(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    // calculating the average grade of the class
    public static float averageGrade(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return (float) sum / n;
    }

    // creating a bar graph representing the scores array
    public static void barGraph(int[] scores) {
        int[] stats = new int[5];
        System.out.println("Graph:");
        System.out.println("  ");
        for (int score : scores) {
            if (score > 80) {
                stats[4]++;
            } else if (score <= 80 && score >= 61) {
                stats[3]++;
            } else if (score <= 60 && score >= 41) {
                stats[2]++;
            } else if (score <= 40 && score >= 21) {
                stats[1]++;
            } else {
                stats[0]++;
            }
        }

        int maxCount = 0;
        for (int count : stats) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        for (int i = maxCount; i >= 1; i--) {
            System.out.printf("%2d >", i);
            for (int j = 0; j < stats.length; j++) {
                if (stats[j] >= i) {
                    System.out.print("   #######  ");
                } else {
                    System.out.print("            ");
                }
            }
            System.out.println();
        }

        System.out.println("   +-----------+-----------+-----------+-----------+-----------+");
        System.out.println("   |   0-20    |   21-40   |   41-60   |   61-80   |  81-100   |");
    }

}
