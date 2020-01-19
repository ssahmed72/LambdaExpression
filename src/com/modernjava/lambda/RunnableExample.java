package com.modernjava.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        //Runnable Traditional example
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++)
                    sum += i;
                System.out.println("Traditional: " + sum);
            }
        };
        new Thread(runnable).start();

        //Implement using Lambda
        Runnable runnable1 = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++)
                sum += i;
            System.out.println("Runnable Lambda: " + sum);
        };

        new Thread(runnable1).start();

        //Implement using Thread with lambda
        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++)
                sum = sum + i;
            System.out.println("Thread Lambda: " + sum);

        }).start();
    }
}
