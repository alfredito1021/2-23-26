
    import java.util.Scanner;

    public class example {
    
        public static void main(String[] args) { 

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Select your carwash (Basic/Power wash/Ultimate wash)");

            int option = keyboard.nextInt(); 

            switch (option) {
                 
                    case 1:
                    case 7:
                    System.out.println("Basic");
                    break;

                    case 2:
                    case 8:
                    System.out.println("Power wash");
                    break;

                    case 3:
                    case 9:
                    System.out.println("Ultimate wash");
                    break;

                    default:
                    System.out.println("Dirty car");

            
                }
            }
    }

        