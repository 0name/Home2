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
    public static void task2(float var1, float var2, float var3){
    float a = var1, b = var2, c = var3, d, x1, x2;
    d = (float) Math.sqrt((b * b) - 4 * a * c) ;
    if (d >= 0) {
        x1 = (-b + d) / a * 2;
        x2 = (-b - d) / a * 2;
        System.out.printf("x1 = %.2f x2 = %.2f", x1,  x2);
    }else
        System.out.println("Корней нет");
    }
//    3) Создать программу, выводящую на экран наибольшую цифру любого трехзначного натурального числа.
//
//    Примеры работы программы:
//    В числе 208 наибольшая цифра 8 В числе 774 наибольшая цифра 7 В числе 613 наибольшая цифра 6
    public static void task3(int var) {
        int sot, dec, ed, res;
        sot = var / 100;
        dec = var % 100 / 10;
        ed = var % 100 % 10;
        if (sot >= dec && sot >= ed)
            res = sot;
        else
        if (dec >= sot && dec >= ed)
            res = dec;
        else    res = ed;

        System.out.println("\n" + sot + " " + dec + " " + ed + " " + "res = " + res);
}

   /*   4) В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
           Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран
           последовательность a, b и c оказалась строго возрастающей.
       Числа в переменных a, b и c: 3, 9, -1
       Возрастающая последовательность: -1, 3, 9
       Числа в переменных a, b и c: 2, 4, 3
       Возрастающая последовательность: 2, 3, 4
       Числа в переменных a, b и c: 7, 0, -5
       Возрастающая последовательность: -5, 0, 7
   */
   public static void task4(int var1, int var2, int var3){
        int a = var1;
        int b = var2;
        int c = var3;
        int temp = ;

        if (a>b && b>c) System.out.println(a + " " + b + " " + c);
        System.out.println(a + " " + b + " " + c);
   }
}
