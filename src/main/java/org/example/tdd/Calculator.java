package org.example.tdd;

public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(String numbers) {
        if (numbers == null || numbers.trim().isEmpty()) {
            return 0;
        }
        
        String[] parts = numbers.split(",");
        int sum = 0;
        
        for (String part : parts) {
            sum += Integer.parseInt(part.trim());
        }
        
        return sum;
    }
    
    public int add(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        return sum;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        return (double) a / b;
    }
    
}
