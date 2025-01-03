    package Patterns;

    import java.util.Scanner;

    public class FloydTraingle {
        public static void floydTraingle(int n){
            // for(int i=1;i<=n;i++){
            //     for(int j=i;j<=(2*i)-1;j++){
            //         System.out.print(j+ " ");
            //     }
            //     System.out.println();

            // }

            // tried hard but the logic is simple, from this what i understood is dont think much  & if you got an idea think for some time and go with other approach  try in multiple ways to get the solution.
            //here we need to initilize the counter to 1; we try to print the counter and then we try to increment the counter value by counter++.
        
            int counter = 1;
            for(int i=1; i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(counter+ " ");
                    counter++;
                }
                System.out.println();
            }
        }
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            floydTraingle(n);
        }
    }
