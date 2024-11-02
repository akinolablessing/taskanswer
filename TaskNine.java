public class TaskNine{
  public static void main(String[] args){
 
   int sum =0;
   int sumTwo=0;
   int add = 0;
for(int count=4; count<=1024; count*=4){
    sum = sum+count;
  }
    for (int count=8; count<=32768; count*=8){
       sumTwo=sumTwo+count;
    }
    add = (sum + sumTwo)*(sum + sumTwo);
   System.out.printf("%d ",add); 
 }
  
}  
