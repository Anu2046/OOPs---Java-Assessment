import java.util.Arrays;

public class DataOperationsDemo {
    public static void main(String[] args) {

        int a = 15, b = 4;
        System.out.println("\n Arithmetic Operations:");
        System.out.println(a + " + " + b + " = " + (a + b));       
        System.out.println(a + " - " + b + " = " + (a - b));       
        System.out.println(a + " * " + b + " = " + (a * b));       
        System.out.println(a + " / " + b + " = " + (a / b));       
        System.out.println(a + " % " + b + " = " + (a % b));       
        System.out.println(a + " / " + b + " (float) = " + ((float)a / b)); 

        System.out.println("\nRelational Operations:");
        System.out.println(a + " == " + b + " : " + (a == b));    
        System.out.println(a + " != " + b + " : " + (a != b));     
        System.out.println(a + " > " + b + " : " + (a > b));       
        System.out.println(a + " < " + b + " : " + (a < b));       
        System.out.println(a + " >= " + b + " : " + (a >= b));     
        System.out.println(a + " <= " + b + " : " + (a <= b));     

        boolean x = true, y = false;
        System.out.println("\nLogical Operations:");
        System.out.println(x + " && " + y + " : " + (x && y));     
        System.out.println(x + " || " + y + " : " + (x || y));     
        System.out.println("!" + x + " : " + (!x));                

        int num1 = 5; // 0101
        int num2 = 3; // 0011
        System.out.println("\nBitwise Operations:");
        System.out.println(num1 + " & " + num2 + " : " + (num1 & num2));  
        System.out.println(num1 + " | " + num2 + " : " + (num1 | num2));  
        System.out.println(num1 + " ^ " + num2 + " : " + (num1 ^ num2));  
        System.out.println("~" + num1 + " : " + (~num1));                
        System.out.println(num1 + " << 1 : " + (num1 << 1));             
        System.out.println(num1 + " >> 1 : " + (num1 >> 1));             

        System.out.println("\nAssignment Operations:");
        int c = 10;
        System.out.println("c = " + c);
        c += 5; System.out.println("c += 5 → " + c);
        c -= 3; System.out.println("c -= 3 → " + c);
        c *= 2; System.out.println("c *= 2 → " + c);
        c /= 4; System.out.println("c /= 4 → " + c);
        c %= 3; System.out.println("c %= 3 → " + c);

        System.out.println("\nIncrement/Decrement:");
        int counter = 5;
        System.out.println("Original: " + counter);
        System.out.println("Post-increment: " + counter++); 
        System.out.println("After increment: " + counter);
        System.out.println("Pre-increment: " + ++counter);  
        System.out.println("Post-decrement: " + counter--); 
        System.out.println("After decrement: " + counter);

        System.out.println("\nTernary Operation:");
        int max = (a > b) ? a : b;
        System.out.println("Max between " + a + " and " + b + " is " + max);

        System.out.println("\nType Casting:");
        double d = 123.456;
        int i = (int)d; // Explicit casting
        System.out.println("double " + d + " → int " + i);
        
        char ch = 'A';
        int ascii = ch; // Implicit casting (char to int)
        System.out.println("char '" + ch + "' → ASCII " + ascii);

        System.out.println("\nString Operations:");
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Concatenation: " + str1 + " " + str2);
        System.out.println("Length: " + str1.length());
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Substring: " + str1.substring(1, 3));
        System.out.println("Equals: " + str1.equals("hello"));
        System.out.println("EqualsIgnoreCase: " + str1.equalsIgnoreCase("hello"));

        System.out.println("\nArray Operations:");
        int[] numbers = {3, 1, 4, 2};
        System.out.println("Original: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
        System.out.println("Binary Search (4): " + Arrays.binarySearch(numbers, 4));
    }
}