public class qn3 {

    public static void main(String[] args) {
        //  Multiplication of non-neg int
        double answer = mult(9, 4);
        System.out.println(answer);
        
        //  Power of non-neg int
        double expo = pow(9, 2);
        System.out.println(expo);
        
        //  Syracuse Sequence
        syracuseSeq(14);
        System.out.println();
        
        //  Count Bunny Ears
        int bunny = countBunnyEars(3);
        System.out.println(bunny);
        
        //  Count sevens
        int sevens = count7(717);
        System.out.println(sevens);
        
        //  Count blocks
        int blocks = countBlocks(4);
        System.out.println(blocks);
        
        //  Count x
        String a = "xllxxxx";
        int a_ = a.length()-1;
        int _a = countX(a, a_);
        System.out.println(_a);
        
        //  Change pi to 3.14
        String b = "xpipixpi";
        int b_ = b.length()-1;
        String _b = changePI(b, b_);
        System.out.println(_b);
      
        //  Add * to pairs of letters
        String c = "helloooo";
        int c_ = c.length()-2;
        String _c = pairStar(c, c_);
        System.out.println(_c);
        
        //  Count ABCs
        String d = "abcxxabc";
        int d_ = d.length()-1;
        System.out.println(countABC(d, d_));
    }

    // multiplication of non-negative integers
    // mult(n,0) = 0
    // mult(n, m) = n + mult(n,m-1);
    private static double mult(int n, int m) {
        if (m==0)   return 0;
        else    return n+mult(n, m-1);
    }

    //  exponential using recursion
    //  n^0 = 1
    //  n^m = n*(n^m-1);
    private static double pow(int n, int m) {
        if (m==0)    return 1;
        else    return n*pow(n,m-1);
    }

    //  Syracuse Sequence
    //  if n%2 = 0, n/2
    //  if n%2 != 0, 3(n) + 1
    private static void syracuseSeq(int n) {
        System.out.print(n + " ");
        if (n!=1) {
            if (n%2 == 0)
                syracuseSeq(n/2);
            else if (n%2 != 0) {
                syracuseSeq((3*n) +1);
            }
        }
    }

    //  Bunny Ears
    //  Bunnies standing in a line, 1, 2, ... , n
    //  Even have 2 ears
    //  Odd have 3 ears
    private static int countBunnyEars(int n) {
        if (n==0) return 0;
        else if (n%2 == 0)  return 2 + countBunnyEars(n-1);
        else if (n%2 != 0)  return 3 + countBunnyEars(n-1);
        else    return 0;
    }


    // count 7
    // Given a non-negative int n, return the count of occurance of 7
    private static int count7(int n) {
        if (n!=0) {
          if (n%10 == 7)    return 1 + count7(n/10);
          else              return count7(n/10);
        }
        else                return 0;
    }

    // count trianlge blocks
    private static int countBlocks(int n) {
        if(n!=0)    return n+countBlocks(n-1);
        else        return 0;
    }

    // countX
    private static int countX(String s, int n) {
        if (n>=0) {
            if(s.charAt(n) == 'x') return 1 + countX(s, n-1);
            else                   return countX(s, n-1);
        }
        else                       return 0;
    }

    // change pi
    private static String changePI(String s, int n) {
        if (n>=0) {
            if(s.charAt(n) == 'p' && s.charAt(n+1) == 'i') {
                s = s.replace("pi", "3.14");
                return changePI(s, n-1);
            }
            else    return changePI(s, n-1);
        } else  return s;
    }

    // pairstar
    private static String pairStar(String s, int n) {
        String temp = "";
        if (n>=0) {
            if (s.charAt(n) == s.charAt(n + 1)) {
                String s_ = s.substring(0,n+1);
                temp += s_ + Character.toString('*') + s.substring(n+1, s.length());
                return pairStar(temp, n - 1);
            } else return pairStar(s, n - 1);
        }
        else return temp + s;
    }

    // Count ABC
    private static int countABC(String s, int n) {
        if(n>=0) {
            if (s.charAt(n) == 'a' && s.charAt(n+1) == 'b' && s.charAt(n+2) == 'c')
                return 1 + countABC(s, n-1);
            else return countABC(s, n-1);
        }
        else return 0;
    }
}
