package me.sakigamiyang.exercise.text;

class FizzBuzz {
    static void printFizzBuzz(int n) {
        for (int i = 1; i <= n; ++i) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else {
                System.out.print(i);
            }
            System.out.print(", ");
        }
    }
}
