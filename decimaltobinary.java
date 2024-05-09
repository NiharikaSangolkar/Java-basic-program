
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class decimal_to_binary{
     public static void main(String[] args) {
         int[] binaryNum = new int[1000]; 
        int n=17;
        // counter for binary array 
        int i = 0; 
        int m=n;
        while (n > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
      System.out.println("Decimal - " + m); 
      System.out.print("Binary - "); 
     // printing binary array in reverse order
     
        for (int j = i - 1; j >= 0; j--) 
        {
            System.out.print(binaryNum[j]); 
       } 
       System.out.println(" ");
      
    // driver program 
     
      
    
        /////System.out.println("Try programiz.pro");
    }
}
/*
Decimal - 17
Binary - 10001 



*/
