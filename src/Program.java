//import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        //Scanner s = new Scanner(System.in);

        Calculator c = new Calculator();
        int ans = c.bestDigit(21616165);
        System.out.println(ans);


        /*
        System.out.print("Enter any number: ");
        int x = s.nextInt();
        switch(x){
            case -1:
                System.out.println("ok");
                break;
            case 3:
                System.out.println("good");
                break;
            case 8:
                System.out.println("hellos");
                break;
            default:
                System.out.println("bye");
        }


        /* 
        for(int i=1; i<=10; i++){
            if(i==3 || i==7){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("bye");

        for(int i=1; i<=10; i++){
            if(i==3 || i==7){
                break;
            }
            System.out.println(i);
        }
        System.out.println("bye");
        */
        
        
    }

}
