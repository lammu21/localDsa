
    import java.util.Scanner;

    public class susmithaCodee {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();
        
        printPairsWithSum(targetSum);
    }

    public static void printPairsWithSum(int targetSum) {
        System.out.println("Pairs with sum " + targetSum + ":");
        

        System.out.println("(");
        for (int i = 1; i <= targetSum / 2; i++) {
            int complement = targetSum - i;
          
            if (complement <= targetSum && complement != i) {
               
                System.out.print(+ i +","+ complement +",");
                
            }
           
        }
        System.out.println(")");
    }
}

