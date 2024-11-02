public class TaskSevenWhile{
 public static void main(String[] args){

       int sum =0;
       int sumTwo =0;
       
       int count=4;
   while( count<=1024){
       sum = sum+count;
        count*=4;
      }
      System.out.printf("%d ",sum);
        int index=8;
   while( index<=32769){
       sumTwo = sumTwo+index;
       index*=8;
   
   }
  System.out.printf("%d ",sumTwo);
  }
 }