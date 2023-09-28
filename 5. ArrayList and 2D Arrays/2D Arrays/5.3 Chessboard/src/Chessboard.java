public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int i = 0; i < 8; i++) {
         if (i % 2 == 0) {
            chessboard[i] = new char[]{'\u25A1', '\u25A0', '\u25A1', '\u25A0', '\u25A1', '\u25A0', '\u25A1', '\u25A0'};
         } else {
            chessboard[i] = new char[]{'\u25A0', '\u25A1', '\u25A0', '\u25A1', '\u25A0', '\u25A1', '\u25A0', '\u25A1'};
         }
      }

      for (int x = 0; x < 8; x++) {
         for (int y = 0; y < 8; y++) {
            System.out.print(chessboard[x][y]);
         }
         System.out.println();
      }
   }
}