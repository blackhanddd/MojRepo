public class Vaja25{
  public static void main(String[] args) {

      int stPonovitev = Integer.parseInt(args[0]);

      do{
        System.out.println(stPonovitev);

        stPonovitev -- ;
      } while(stPonovitev > 5);

  }
}
