
package part1;


public class VariablesReview {

    
    public static void main(String[] args) {
        //primitive data types
        int a = 1234567890; //4 bytes
        long b =  1234567890123456789L; // 8 bytes
        short c = 12345; //2 bytes 
        byte d = 127;//1 byte in size
        
        //decimals
        double dbl = 45.78; // 8 bytes
        float flt = 45.75F;// 4 
        
        //2 others
        char chr = 'r';//single character
        boolean bool = true; // or false
        
        //Strings -> not primitive 
        String s = "I went to school today"; 
        //String is capitalised like all objects
        //"s" has abilities, a.k.a. methods
        
        int len = s.length();
        char lett = s.charAt(7);
        String str1 = s.substring(3,8);
        String str2 = s.substring(4);
        //note on all methods
        //1: All methods have a return type(send back something, except for void methods)
        //2: methods may or maynot require parameters(data sent in)
        //3: some methods have more than 1 version
        
        System.out.println("Length of \"s\"is: " + len);
        System.out.println("7th character is " + lett);
        System.out.println("Location 3-8: " + str1);
        System.out.println("Location 4-end: " +str2);
        
        //escape codes: \" \\  \t(tab)  \n(newline
        System.out.println("First\t\tLast\t\tEmailAddress");
        System.out.println("C:\\Documents\\Users");
        System.out.println("He went \n\nto the store");
        
    }
    
}
