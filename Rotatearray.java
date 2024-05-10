// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class RotateArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        int d = 2;
        
        // Storing rotated version of array
        int temp[] = new int[N];
 
        // Keeping track of the current index
        // of temp[]
        int k = 0;
 
        // Storing the n - d elements of
        // array arr[] to the front of temp[]
        for (int i = d; i < N; i++) {
            temp[k] = arr[i];
            k++;
        }
 
        // Storing the first d elements of array arr[]
        // into temp
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }
 
        // Copying the elements of temp[] in arr[]
        // to get the final rotated array
        for (int i = 0; i < N; i++) {
            arr[i] = temp[i];
        }
        
        // Printing the rotated array
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
