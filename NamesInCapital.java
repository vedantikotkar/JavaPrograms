import java.util.*;
public class StdUp{
    public static void main(String []args){

     Scanner sc=new Scanner(System.in);
     String names[]=new String [10];
     System.out.println("enter 5 name  of students :");
     for(int i=1;i<6;i++){
        names[i]=sc.nextLine();
     }
     System.out.println("Names in capital format ");
     for (int i=1;i<6;i++){
        String capital=names[i].toUpperCase();
        System.out.println(capital);

     }

    }
}