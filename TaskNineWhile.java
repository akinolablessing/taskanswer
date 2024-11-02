public class TaskNineWhile{
  public static void main(String[] args){
 
   int sum =0;
   int sumTwo=0;
   int add =0;

     int count=4;
while( count<=1024 ){
    sum = sum+count;
   count*=4;
  }
 
       int index=8;
   while( index<=32768){
       sumTwo=sumTwo+index;
     index*=8;
    }
   add = (sum+sumTwo)*(sum+sumTwo);
 System.out.printf("%d ",add);

 }
   }  
 