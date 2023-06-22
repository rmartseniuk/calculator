package com.rmartseniuk.parser;

import com.rmartseniuk.service.VisitorBasedCalculator;


/**
 * 🙇‍♂️ Практичне завдання #1
 *  🧮 Текстовий калькулятор
 * ▫️на вхід подається багаторядкові інструкції
 *  👉((51+28)*56) -7=
 *  👉 A = 5 * 6 + B * (C + D);
 *         C = 3.2 – D;
 *         D = S +8;
 *         X = S;
 *         S = 18;
 *         ?X
 * ➕ операція перетворення вхідних значень в різні системи числення та арифметичні дії з ними
 * ➕ унарний мінус, заборона провідних нулів
 * ➕ приведення подібних доданків
 * ➕ перевірка на лексичну коректність синтаксису(числові константи, літерні змінні ) за допомогою регулярних виразів
 * 💡 підсвічування синтаксису
 */
public class Main {

    public static void main(String[] args) {
        VisitorBasedCalculator calculator = new VisitorBasedCalculator();
        String value = calculator.calculate("1g+1").getValue();
        System.out.println(value);
    }
}