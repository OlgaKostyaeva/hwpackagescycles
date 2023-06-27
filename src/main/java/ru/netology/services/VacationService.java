package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int counter = 0;
        int wallet = 0;

        for (int i = 0; i < 12; i++) {
            if (wallet >= threshold) {
                wallet -= expenses;
                wallet /= 3;
                counter++;
            } else {
                wallet += income;
                wallet -= expenses;
            }
        }

        return counter;
    }
}
