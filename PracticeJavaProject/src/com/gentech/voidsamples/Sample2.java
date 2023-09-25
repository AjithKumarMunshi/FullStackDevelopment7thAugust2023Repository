package com.gentech.voidsamples;




class Heirachy1 
{
    void checkEvenOrOdd(int number)
    {
        if (number % 2 == 0) 
        {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}

class Heirachy2 extends Heirachy1
{
    void checkPrimeOrNot(int number) 
    {
        boolean isPrime = isPrimeNumber(number);
        if (isPrime)
        {
            System.out.println(number + " is prime.");
        } else 
        {
            System.out.println(number + " is not prime.");
        }
    }

    private boolean isPrimeNumber(int number)
    {
        if (number <= 1) 
        {
            return false;
        }
        for (int i = 2; i * i <= number; i++)
        {
            if (number % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}


class Heirachy3 extends Heirachy1 {
    void calculateSumOfNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum  numbers: " + sum);
    }
}


public class Sample2 {
    public static void main(String[] args) {
        Heirachy2 o = new Heirachy2();
        o.checkEvenOrOdd(100);
        o.checkEvenOrOdd(45);

        System.out.println("------------------------");

        o.checkPrimeOrNot(25);
        o.checkPrimeOrNot(3);

        System.out.println("------------------------");

        Heirachy3 o2 = new Heirachy3();
       
        int[] numbers = {100,55,45};
        o2.calculateSumOfNumbers(numbers);
    }
}


