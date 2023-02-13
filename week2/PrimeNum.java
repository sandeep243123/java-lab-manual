// Program that will print prime number upto given number

import java.util.*;

class FindPrime{
    int num;
    
    FindPrime(int n)
    {
        this.num = n;
    }

    void prime()
    {
        int flag;
        for(int i = 2; i <= this.num; i++)
        {
            flag = 0;
            for (int j = 2; j <= i / 2; j++)
            {
                if (i % j == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
            {
                System.out.println(i + " ");
            }

        }
    }

    
}

class PrimeNum{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        FindPrime obj1 = new FindPrime(num);
        obj1.prime();
    }
}