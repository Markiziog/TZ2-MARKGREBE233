
![Java CI with Maven](https://github.com/Markiziog/TZ2-MARKGREBE233/actions)

# TZ2-MARKGREBE233
# Описание работы программы

## Общий обзор
Программа предназначена для обработки числовых данных из файла. Она читает числа из файла, сохраняет их в динамический список и выполняет различные арифметические операции: находит максимальное и минимальное значения, считает сумму и произведение чисел.

## Как это работает
Пользователь вводит имя файла, который содержит числа, разделённые пробелами. Программа читает первую строку из этого файла, парсит её и сохраняет числа в список `nums`. Затем программа вычисляет и выводит на экран максимальное и минимальное значения, сумму и произведение всех чисел в списке.

## Методы
### Метод _max
`public static long _max()`
Использует потоки Java (Java Stream API) для поиска максимального значения в списке `nums`. Если список пуст, выбрасывает исключение `NoSuchElementException`.

### Метод _min
`public static long _min()`
Аналогично методу `_max`, находит минимальное значение в списке.

### Метод _sum
`public static long _sum()`
Вычисляет сумму всех элементов списка `nums`, используя потоки для преобразования каждого элемента в `long` и последующего их суммирования.

### Метод _mult
`public static BigInteger _mult()`
Вычисляет произведение всех чисел в списке. Использует `BigInteger` для работы с потенциально очень большими значениями. Числа преобразуются в `BigInteger` и перемножаются в порядке их следования в списке, начиная с `BigInteger.ONE`.

## Обработка ошибок
Программа обрабатывает исключения, связанные с отсутствием файла (`FileNotFoundException`), и информирует пользователя, если файл не найден.

## Время выполнения программы

Время выполнения программы зависит от количества обрабатываемых чисел. Ниже представлена таблица времени выполнения для разных объемов данных:

| Количество чисел | Время выполнения (мс) |
|------------------|----------------------|
| 10,000           | 70                   |
| 20,000           | 281                  |
| 30,000           | 632                  |
| 40,000           | 1005                 |
| 50,000           | 1668                 |
| 60,000           | 2405                 |
| 70,000           | 3240                 |
| 80,000           | 4021                 |
| 90,000           | 5112                 |
| 100,000          | 6325                 |

Программа оптимизирована для работы с большими объемами данных и демонстрирует отличную производительность благодаря использованию потоков и эффективных алгоритмов обработки данных.

![photo_5317043451319147767_y](https://github.com/Markiziog/TZ2-MARKGREBE233/assets/157812830/cb2abd4d-daea-4e26-b9d8-019300c99a5f)
