// todo: Sort an Array using Stack Data Structure...

import java.util.Scanner;
import java.util.Stack;
public class Sort
{
    //! Function to Sorting the Array using Stack Data Structure... O(n^2) time...
    public void StackSort(Stack<Integer> sck, int arr[])
    {
        int max = 0;
        for(int i = 0; i < arr.length; i++)      //? For loop O(n) time...
        {
            max = arr[i];
            for(int j = i+1; j < arr.length; j++)     //? For loop O(n) time...
            {
                if(max <= arr[j])     // Updation of the Required Values...
                {
                    int temp = max;
                    max = arr[j];
                    arr[j] = temp;
                }
            }
            sck.push(max);      // Pushing the i th Maximum value in the Stack... 
        }
    }
    //! Function to Print the Sorted Array using Stack... O(n) time...
    public void Print(Stack<Integer> sck)  
    {
        while(!sck.isEmpty())
        {
            System.out.print(sck.peek());
            sck.pop();
        }
    }

    //! Main function begins...
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int x, a;
        System.out.print("Enter the number of Elements in an Array : ");
        x = scanner.nextInt();
        int array[] = new int[x];
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("Enter "+i+1+" element : ");
            a = scanner.nextInt();
            array[i] = a;
        }
        Sort sort = new Sort();
        sort.StackSort(stack, array);      //? Function call... O(1) time... 
        sort.Print(stack);               //? Function call... O(1) time...
        scanner.close();
    }
}


//* The above Algorithm uses the Selection Sort technique and works in O(n^2) time and Printing takes O(n) time... Thus it takes O(n^2) time... */
//* The Space it takes is O(n) space as Array and O(n) space as Stack... Thus it takes O(n) time... */
//! Time Complexity - O(n^2) time...
//! Space Complexity - O(n) space...