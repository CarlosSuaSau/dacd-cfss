public class HundredthPrime
{
   public static void main(String[] args)
   {
      int n = 100;
      int num = 1, count = 0, i;
      while (count < n) {
         num++;

         for (i = 2; i <= num; i++) {
            if (num % i == 0) {
               break;
            }
         }
         if (i == num) {
            count++;
         }
      }
      System.out.println(num);
   }
}