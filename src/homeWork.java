public class homeWork {

    /**
     * 1) Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
     *       Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45.
     */

    static void task1(double first, double second) {
        System.out.println("Task 1");
        double m = first, n = second;
        double res = Math.abs(m - 10) < Math.abs(n - 10) ? m : n;
//        if (Math.abs(m - 10) < Math.abs(n - 10)) res = m;
//        else res = n;
        System.out.println("Число " + res + " ближе к 10");
    }

    /**
    *2) В три переменные a, b и c записаны три вещественных числа.
    *  Создать программу, которая будет находить и выводить на экран вещественные
    *  корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
    */
    static void task2(float var1, float var2, float var3) {
        System.out.println("Task 2");
        float a = var1, b = var2, c = var3, d, x1, x2;
        d = (float) Math.sqrt((b * b) - 4 * a * c);
        if (d >= 0) {
            x1 = (-b + d) / a * 2;
            x2 = (-b - d) / a * 2;
            System.out.printf("x1= %.2f x2= %.2f", x1, x2);
        } else
            System.out.println("Корней нет");
    }

    /**
     * 3) Создать программу, выводящую на экран наибольшую цифру любого трехзначного натурального числа.
     * <p>
     * Примеры работы программы:
     * В числе 208 наибольшая цифра 8 В числе 774 наибольшая цифра 7 В числе 613 наибольшая цифра 6
     */
    static void task3(int var) {
        System.out.println("Task 3");
        int sot, dec, ed, res;
        sot = var / 100;
        dec = var % 100 / 10;
        ed = var % 10;
        if (sot >= dec && sot >= ed)
            res = sot;
        else if (dec >= sot && dec >= ed)
            res = dec;
        else res = ed;

        System.out.println(sot + " " + dec + " " + ed + " " + "res = " + res);
    }

    /**
     * 4) В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
     * Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран
     * последовательность a, b и c оказалась строго возрастающей.
     * Числа в переменных a, b и c: 3, 9, -1
     * Возрастающая последовательность: -1, 3, 9
     * Числа в переменных a, b и c: 2, 4, 3
     * Возрастающая последовательность: 2, 3, 4
     * Числа в переменных a, b и c: 7, 0, -5
     * Возрастающая последовательность: -5, 0, 7
     */
    static void task4(int var1, int var2, int var3) {
        System.out.println("Task 4");
        int a = var1;
        int b = var2;
        int c = var3;

        if (a > b) {
            a = a + b - (b = a); // действие в скобках вып-ся первым
        }
        if (a > c) {
            a = a + c - (c = a);
        }
        if (b > c) {
            b = b + c - (c = b);
        }

        System.out.println(a + " " + b + " " + c);
    }

    /**
     * Создайте программу, выводящую на экран все четырёхзначные числа
     * последовательности 1000 1003 1006 1009 1012 1015 ….
     */
    static void task5() {
        System.out.println("Task 5");
        for (int i = 1000; i < 10000; i += 3) {
            System.out.print(i + " ");
        }
    }

    /**
     * Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
     */
    static void task6() {
        System.out.println("Task 6");
        System.out.println();
        for (int i = 90; i > 0; i -= 5) {
            System.out.print(i + " ");
        }
    }

    /**
     * 3) Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
     */
    static void task7() {
        System.out.println("Task 7");

        int j = 2;
        for (int i = 0; i < 20; i++) {
            j *= 2;
            System.out.print(j + " ");
        }
    }

    /**
     * 4) Проверьте,  является ли  натуральное число — простым.
     */
    static void task8(int var) {
        System.out.println("\nTask 8 ");
        for (int i = 2; i < var; i++) {
            if (var % i == 0) {
                System.out.println("Число " + var + " простое");
                return;
            }
        }
        System.out.println("Число " + var + " не простое");
    }

    /**
     * 5) Выведите на экран первые 11 членов последовательности Фибоначчи. Первый и второй
     * члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
     */
    static void task9() {
        System.out.println("Task 9");
        int a = 1, b = 0, c;
        for (int i = 0; i < 11; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    /**
     * 6) В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
     * Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
     * «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна
     * сумме последних трёх цифр, как, например,
     * в билетах с номерами 003102 или 567576.
     * Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает,
     * как много сувениров потребуется. С помощью программы подсчитайте
     * сколько счастливых билетов в одном рулоне?
     */
    static void task10() {
        System.out.println("\nTask 10");
        int sum1, sum2, count = 0;
        int LL, ML, RL;
        int LR, MR, RR;
        for (int i = 1000; i < 999999; i++) {
            LL = i / 100000;
            LR = i % 1000 / 100 ;
            ML = i / 10000 % 10;
            MR = i % 100 / 10;
            RL = i % 10000 / 1000;
            RR = i % 10;
            sum1 = LL + ML + RL;
            sum2 = LR + MR + RR;
//        System.out.println(LL);
//        System.out.println(LR);
//        System.out.println(ML);
//        System.out.println(MR);
//        System.out.println(RL);
//        System.out.println(RR);

            if (sum1 == sum2) count++;
        }
        System.out.println(count);
    }

    /**7)
     * Электронные часы показывают время в формате от 00:00 до 23:59.
     * Подсчитать сколько раз за сутки случается так, что слева
     * от двоеточия показывается симметричная комбинация для той,
     * что справа от двоеточия (например, 02:20, 11:11 или 15:51).
     */
    static void task11() {
        System.out.println("Task 11");
        for (int hour=0; hour<23; hour++){
            for (int minute=0; minute<59; minute++){

            }
        }

    }
}
