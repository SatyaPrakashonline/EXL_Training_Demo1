import java.util.Scanner;
public class fibonnacci {
    public static void main(String[] args){
        Scanner inp1 = new Scanner(System.in);
        System.out.print("Enter the series length: ");
        int x = inp1.nextInt();
        if(x==0)
            System.out.print("Invalid input.");
        if(x==1)
            System.out.print("1");
        if(x==2)
            System.out.print("1 1");
        if(x>3){
            int a1=1, a2=1,sum;
            System.out.print(a1+" "+a2);
            for(int i=1; i<=x-2;i++){
                sum=a1+a2;
                a1=a2;
                a2=sum;
                System.out.print(" "+sum);
            }
        }
    }
    
}
