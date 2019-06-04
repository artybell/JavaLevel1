/**
 * Домашнее задание 1
 * Выполнил Бельский Артем
 */

public class HomeWork1 {

    /**
     * 1. Создать пустой проект в IntelliJ IDEA и прописать метод main()
     */
    public static void main(String[] args) {

        /**
         * 2. Создать переменные всех пройденных типов данных, и инициализировать их значения
         */

        byte a = -100;
        short b = -768;
        int c = 21000040;
        long d = 4250L;
        float flt = 85.45f;
        double dbl = -248566.24;
        char chr = '\uffff';
        boolean bln = true;

        char ch = 'š';
        String str = "Имя";
        int year = 2100;

        System.out.println(formula(a, b, c, d));
        System.out.println("check number - " + compare(a, b));
        System.out.println("plus or minus - " + plusOrMinus(3000));
        System.out.println("plus or minus - " + plusOrMinus(-20));
        System.out.print("Привет, ");
        myName("Артем");
        System.out.println("check leap - " + leap(3004));
        System.out.println("check leap - " + leap(3001));

    }

    /**
     * 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода
     */
    public static double formula(byte a, short b, int c, long d) {
        double result = a * (b + ( c / d));
        return result;
    }

    /**
     * 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false
     */
    public static boolean compare(byte a, short b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return true;
        }
        else{
            return false;
            }
    }

    /**
     * 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом
     * 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное
     */
    public static boolean plusOrMinus(int c) {
        //int result = a + b;
        if (c >= 0) {
            System.out.println("Число " + c + " - положительное");
            return false;
        }
        else {
            System.out.println("Число " + c + " - отрицательное");
            return true;
        }
    }

    /**
     * 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
     */
    public static void myName(String name){
        System.out.println(name);
    }

    /**
     * 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
     */
    public static boolean leap(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("Год является високосным");
            return true;
        } else{
            System.out.println("Год не является високосным");
            return false;
        }
    }
}