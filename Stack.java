import java.util.*;


public class Stack {
    public static int calcPower(int x, int n) {
        if(n == 0) { //base case 1
            return 1;
        }

        if(x == 0) { //base case 2
            return 0;
        }

        int xPowm1 = calcPower(x, n-1); // work
        int xPown = x * xPowm1;
        return xPown;
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
         
    }
    
}


// class time 1 : 10 hr