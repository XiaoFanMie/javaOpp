package practise;

public class Test {

   /*static int v=100;

   public int Compare(int a){
      if (a==v){
         System.out.println("luckyBoy");
         return 0;
      }else if (a<v){
         System.out.println("小了");
         return 1;
      }else{
         System.out.println("大了");
         return 1;
      }
   }
   public static void main(String[] args) {
      int i=1;
      while(i==1){
         Scanner input = new Scanner(System.in);
         Test test = new Test();
         int a = input.nextInt();
         i = test.Compare(a);
      }
   }*/
   Person person = new Person("Test");

   static{
      System.out.println("test static");
   }

   public Test(int a) {

      System.out.println("test constructor");
   }

   public static void main(String[] args) {
      new Test(1);
   }
}

