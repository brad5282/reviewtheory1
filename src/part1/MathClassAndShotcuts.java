
package part1;

public class MathClassAndShotcuts {

    
    public static void main(String[] args) {
        //Math class is part of java language and requires no import
        int x = 10;
        
        System.out.println(Math.pow(x, 3));//1000
        System.out.println(Math.sqrt(x));//square root
        double y = 8.9876;
        System.out.println(Math.round(y));//rounds to nearest whole #
        System.out.println(Math.max(x, y));//8.9876 also min
        
        int roll = (int) (Math.random() * 6 +1);// from 1-6
        //Math.random() * range + start #
        //ex: 30 and 50 (int) (Math.random() * 21 +30);
        System.out.println(roll);
        
        System.out.println("\n\nShortcuts\n============");
        int a = 10;
        a+= 10; //a = 20
        System.out.println("a is " + a);
        int b=a;
        b++;
        System.out.println("b is " +b);
        a*=2;
        System.out.println("A is " +a);
        int c = b++;//c=21, b==22
        System.out.format("c is %d, b is %d", c,b);
        int d = ++b;//d = 23, b=23
        System.out.format("d = %d b = %d \n",d,b);
        
        
    }
    
}
