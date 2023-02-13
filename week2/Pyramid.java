// Program to make a pyramid\

class Pyramid {
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);

        for (int i = 0; i < num; i++)
        {
            for (int j = num; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 2 * num ; j >  2 * i + 1 ; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}