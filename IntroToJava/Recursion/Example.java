/* Taking the count num example, */

public class Example {
    public static void main(String[] args) {
        countNum(1);
        System.out.println();
    }

    // This method is the recursion method, whereby n IS NOT 4
    public static void countNum(int n) {
        /* At every n + 1, it will first check its limit.
         * The limit this case is < 4, so maximum limits for n=3.
         * If it satisfy the requirements, Java will proceed with the
         * codes in the if statements. else, it will return to where it come from */
        if (n != 4) {
            /* Here is where the 1st recursion occur. It will run this 1st
             * line of code in the if statement until the argument n!=4 turns false.
             * in this case, the argument will turn false when n == 3.
             * keep in mind that you start off with n=1 then n=2, and end off with n=3 */
            countNum(n + 1);

            /* Since n==4 does not satisfy the requirements in the line above,
             * it will exit the method and return back to the previous method,
             * where n==3.
             * Here, it will proceed on with the 2nd line of code which is the
             * printing of n. Hence the 1st output, 3 */
            System.out.print(n);

            /* After Java is done with the code ^, it will proceed (again) and
             * do the same as in line 21. Take note as of now your n is still == 3 */
            countNum(n + 1);

            /* Once that is done, Java will exit the method as there are no other
             * codes to run, and goes back to n==2, starting from line 26. */
        }
    }
}
