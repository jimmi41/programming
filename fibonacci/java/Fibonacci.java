import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
//We will be using FastReader Class because Scanner Class is very Slow.
class Fibonacci 
{
  static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    public static void main(String[] args) 
    {
        System.out.print("Enter the number of terms: ");
        FastReader s=new FastReader(); // instead of Scanner we are using fastreader
        long num = s.nextLong();
        printFibonacciSeries(num);
    }
    private static void printFibonacciSeries(long num) 
    {
        long a = 1, b = 1;
        StringBuilder sb = new StringBuilder();
        while (num-- > 0) 
        {
              sb.append(a);
              if (num > 0) 
              {
                  sb.append(", ");
              }
              long tmp = a;
              a = b;
              b = b + tmp;
        }
        System.out.println(sb);
    }
}
