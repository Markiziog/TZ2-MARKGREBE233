package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    static List<Long> nums = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner hw = new Scanner(in)) {
            out.print("Введите имя тестируемого файла: ");
            String path = hw.nextLine();

            File file = new File(path);
            Scanner hb = new Scanner(file);
            String line = hb.nextLine();
            hb.close();

            String[] lnum = line.split("\\s+");
            for (String num : lnum) {
                nums.add(Long.parseLong(num));
            }

            out.println("Максимальное: " + _max());
            out.println("Минимальное: " + _min());
            out.println("Сумма: " + _sum());
            out.println("Произведение: " + _mult());
        } catch (FileNotFoundException e) {
            err.println("Файл не найден: " + e.getMessage());
        }
    }

    public static long _max() {
        return nums.stream().max(Long::compare).orElseThrow();
    }

    public static long _min() {
        return nums.stream().min(Long::compare).orElseThrow();
    }

    public static long _sum() {
        return nums.stream().mapToLong(Long::longValue).sum();
    }

    public static BigInteger _mult() {
        return nums.stream()
                .map(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
