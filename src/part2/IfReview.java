
package part2;

import java.util.Scanner;


public class IfReview {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = s.nextInt();
        
        if(num > 7 ){
            System.out.println("Too High");
            num--;
        }
        else if(num < 7){
            System.out.println("Too low");
            num++;
        }
        else
            System.out.println("7 is just right.");
        System.out.println("The number is set to " + num);
        
        System.out.println("Enter another number ");
        int num2 = s.nextInt();
        
        int max;//which one is higher? 3 ways
        
        max = Math.max(num, num2);
        System.out.println("The Higher number is: " + max);
        
        //2
        if(num < num2) max = num;
        else max=num2;
        
        //3
        max = num > num2? num : num2;
        //= 1st ask a question? pick this if true : pick this if false
        
    }
    
}
