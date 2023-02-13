// Print factorial take input from command line
class FactCommand {
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);

        int fact = 1;
        if (num < 2)
        {
            System.out.println(fact);
            return;
        }

        for (int i = 2; i <= num; i++)
        {
            fact *= i;
        }
        System.out.println(fact);
    }
}