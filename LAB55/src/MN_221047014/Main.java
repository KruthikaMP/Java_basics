package MN_221047014;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        IOperations newProduct = new IOperations();
        Operations display=new Operations();
        System.out.println("please select your choice:\n 1 - Add\n 2 - Update\n 3 - Display");
        char n;
        char y;
        char ch = 'n';
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice) {
            case 1:newProduct.addProd();
                   break;
            case 2:newProduct.updateProd();
                   break;
            case 3:display.Display();
                   break;
            default:System.out.println("Please enter proper input\n");
        }
    }
}

