import java.util.Scanner;

public class studentgrade{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
System.out.println("student grade calculator");
System.out.println("Enter no of subjects");
int aB=sc.nextInt();
int total= 0;
for (int i=0; i<aB; i++){
    System.out.println("enter the marks obtained in "+(i+1)+": " );
int marks =sc.nextInt();
total += marks;
    }
    double avgN=(double)total/aB;
    char Grade;
    if(avgN>=90){
        Grade= 'O';
    }
    else if (avgN>=80){
        Grade='A';
    }
    else if(avgN>=70){
        Grade = 'B';
    }
    else if (avgN>=60){
        Grade='C';
    }
    else if (avgN>=50){
        Grade='D';
    }
    else if(avgN>=40){
        Grade = 'E';
    }
    else{
        Grade ='f';
    }
System.out.println("total marks scored is "+total );
System.out.println("Average percentage is "+avgN+"%" );
System.out.println("Grade: "+Grade );
}
}