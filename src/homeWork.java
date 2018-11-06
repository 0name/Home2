public class homeWork {
//        1) Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//      Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45.
    public static void task1(double first, double second) {
        double m = first, n = second;
        double res = Math.abs(m - 10) < Math.abs(n - 10) ? m : n;
//        if (Math.abs(m - 10) < Math.abs(n - 10)) res = m;
//        else res = n;
        System.out.println("Число " + res + " ближе к 10");
    }

//      2) В три переменные a, b и c записаны три вещественных числа.
//      Создать программу, которая будет находить и выводить на экран вещественные
//      корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.

}
