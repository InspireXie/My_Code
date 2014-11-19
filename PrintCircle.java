import java.lang.*;
public class PrintCircle{
  public static void main(String [] args){
    int row,cross,r = 12;//行，列，半径
    int i,j;//用于控制循环
    //上半部分圆
    for(i = 0;i<r;i++){
    double space = Math.sqrt(r*r-(r-i)*(r-i));
    int spacePrint = (int)(2*space);
      if(spacePrint==2*r){
        System.out.println(" ");
      }

      for(j=1;j<(2*r-spacePrint);j++){
         System.out.print(" ");
      }

      System.out.print("*");

      for(j=1;j<=2*spacePrint;j++){
         System.out.print(" ");
      }

      System.out.println("*");
    }

    //下半部分圆
    for(i = r-1;i>=0;i--){
       double space = Math.sqrt(r*r-(r-i)*(r-i));
       int spacePrint = (int)(2*space);

       for(j=1;j<(2*r-spacePrint);j++){
         System.out.print(" ");
      }

      System.out.print("*");

      for(j=1;j<=2*spacePrint;j++){
         System.out.print(" ");
      }

      System.out.println("*");
    }
  }
}
