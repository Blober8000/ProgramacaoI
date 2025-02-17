import java.util.Scanner;

public class ex_4_a {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc;

        sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if (x==y || y==z || x==z){
            System.out.println("Números não podem ser iguais.");
        }
        else{
            if(y<x){
                if(z<y){
                    System.out.println(z+" < "+y+" < "+x);
                }else{
                    if(z<x){
                        System.out.println(y+" < "+z+" < "+x);
                    }else{
                        System.out.println(y+" < "+x+" < "+z);
                    }
                }
            }else{
                if(z<x){
                    System.out.println(z+" < "+x+" < "+y);
                }else{
                    if(z<y){
                        System.out.println(x+" < "+z+" < "+y);
                    }else{
                        System.out.println(x+" < "+y+" < "+z);
                    }
                }
            }
        }
    }
}