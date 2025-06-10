public abstract class Calculator {

    // Преобразование строки в число (в соответствующей системе счисления)
    public abstract long parse(String input);

    // Форматирование числа в строковое представление
    public abstract String format(int number);

    // Получение основания системы счисления
    public abstract int getSystem();

    // Выполнение арифметической операции
    public long calculate(long num1, long num2, int operator) {
        return switch (operator) {
            case 1 -> num1 + num2;    // Сложение
            case 2 -> num1 - num2;    // Вычитание
            case 3 -> num1 * num2;    // Умножение
            case 4 -> num1 / num2;    // Деление
            default -> throw new IllegalArgumentException("Неизвестная операция: " + operator);
        };
    }
}
