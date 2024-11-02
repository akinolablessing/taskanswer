public class TaskSeven{
 public static void main(String[] args){

       int sum =0;
       int sumTwo =0;
       
  for (int count=4; count<=1024; count*=4){
       sum = sum+count;
      }
      System.out.printf("%d ",sum);
   for (int count=8; count<=32769; count*=8){
       sumTwo = sumTwo+count;
   
   }
  System.out.printf("%d ",sumTwo);
  }
 }