import java.util.Scanner;

public class ex_4_b {
    public static void main(String[] args) {
        int x, y, z, temp;
        Scanner sc;

        sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        if(x==y || y==z || x==z){
            System.out.println("Números não podem ser iguais.");
        }else{
            if(y<x){
                temp=y;
                y=x;
                x=temp;
                if (z<y){
                    temp=z;
                    z=y;
                    y=temp;
                    if (y<x){
                        temp=y;
                        y=x;
                        x=temp;
                    }
                }
            }else{
                if(z<y){
                    temp=z;
                    z=y;
                    y=temp;
                    if (y<x){
                        temp=y;
                        y=x;
                        x=temp;
                    }
                }
            }
            System.out.println(x+" < "+y+" < "+z);
        }
    }
}
