import java.util.Scanner;
public class grades{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        //Entering the number of students
        System.out.println("Enter number of students: ");
        N=input.nextInt();
        input.nextLine();
        int [] scores = new int[N];
        //Entering the grades of the students
        System.out.print("Enter grades of " + N + " students: ");
        String arrayLine=input.nextLine();
        String [] array=arrayLine.split(" ");
        for(int i=0; i<N; i++){
            scores[i] =Integer.parseInt(array[i]);
        }
        input.close();
        int max=maxGrade(scores);
        int min=minGrade(scores);

        System.out.println("Values:");
        System.out.println("");
        System.out.println("The maximum grade is " + max);
        System.out.println("The minimum grade is " + min);
        int sum=0;
        for(int i=0; i<scores.length; i++){
            sum+=scores[i];
    }
    float avg=sum/N;
    System.out.println("The average grade is " + avg);
    int [] stats=new int[5];
    for(int i=0; i<scores.length; i++){
        if(scores[i]>80){
            stats[4]=scores[i];
        }
        else if(scores[i]>=61 && scores[i]<=80){
            stats[3]=scores[i];
        }
        else if(scores[i]>=41 && scores[i]<=60){
            stats[2]=scores[i];
    
        }
    else if(scores[i]>=21 && scores[i]<=40){
        stats[1]=scores[i];
}
else{
    stats[0]=scores[i];
}

}

    }
    //calculating maximum grade
    public static int maxGrade(int [] array){
        int max=array[0];
        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    //calculating minimum grade
    public static int minGrade(int [] array){
        int min=array[0];
        for(int i=0; i<array.length; i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }

}
