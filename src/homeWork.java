public class homeWork {
    public static void main(String[] args) {
        task1(8.5, 11.45);
        task2(2,2,2);
    }

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
    public static void task2(float var1, float var2, float var3){
    float a = var1, b = var2, c = var3, d, x1, x2;
    d = (float) Math.sqrt(b * b) - 4 * a * c ;
    if (d > 0) {
        x1 = (-b + d) / a * 2;
        x2 = (-b - d) / a * 2;
        System.out.println("x1 = %.2f " + x1 + " x2 = %.0f" + x2);
    }else
    }

}
