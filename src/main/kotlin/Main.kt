
    // Задача 1: Функция printFullName - объявление функции, принимающей две строки и выводящей полное имя и фамилию.

    fun printFullName(firstName: String, lastName: String) {
        val fullName = "$firstName $lastName" // Составление полного имени путем объединения firstName и lastName.
        println(fullName) // Вывод полного имени.
    }

    // Задача 2: Вызов функции printFullName с именованными аргументами
    fun main() {
        printFullName(firstName = "Милана", lastName = "Кулова") // Вызов функции printFullName с передачей именованных аргументов.
    }

// Задача 3: Функция calculateFullName - объявление функции, возвращающей полное имя в виде строки.

    fun calculateFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName" // Составление и возврат полного имени.
    }

    // Задача 4: Измененная функция calculateFullName, возвращающая Pair
    fun calculateFullName(firstName: String, lastName: String): Pair<String, Int> {
        val fullName = "$firstName $lastName" // Составление полного имени.
        val fullNameLength = fullName.length // Вычисление длины полного имени.
        return Pair(fullName, fullNameLength) // Возврат Pair с полным именем и его длиной.
    }

    // Задача 5: Функция для проверки простого числа
    fun isPrime(number: Int): Boolean {
        if (number <= 1) {
            return false // Числа меньше или равные 1 не являются простыми.
        }
        for (i in 2 until number) { // Перебор чисел от 2 до (number - 1).
            if (number % i == 0) {
                return false // Если число делится без остатка на i, то оно не простое.
            }
        }
        return true // В противном случае число простое.
    }

    // Задача 6: Функция для вычисления значения в последовательности Фибоначчи
    fun fibonacci(n: Int): Int {
        if (n <= 0) {
            return 0 // Значения меньше или равные 0 в последовательности Фибоначчи равны 0.
        } else if (n == 1 || n == 2) {
            return 1 // Первые два значения в последовательности Фибоначчи равны 1.
        }

        var prev1 = 1
        var prev2 = 1
        var current = 0

        for (i in 3..n) { // Вычисление следующих значений в последовательности Фибоначчи.
            current = prev1 + prev2 // Текущее значение равно сумме двух предыдущих значений.
            prev1 = prev2 // Обновление предыдущего значения 1.
            prev2 = current // Обновление предыдущего значения 2.
        }

        return current // Возвращение вычисленного значения.
    }

    // Примеры использования функций:
    fun main() {
        // Задача 1 и 2: Вызов функции printFullName с именованными аргументами.
        printFullName(firstName = "John", lastName = "Doe")

        // Задача 3: Вызов функции calculateFullName и вывод результата.
        val myFullName = calculateFullName(firstName = "Alice", lastName = "Smith")
        println(myFullName)

        // Задача 4: Вызов функции calculateFullName, возврат Pair и вывод результата.
        val (fullName, fullNameLength) = calculateFullName(firstName = "Bob", lastName = "Johnson")
        println("Full Name: $fullName, Length: $fullNameLength")

        // Задача 5: Вызов функции isPrime для проверки простого числа и вывод результата.
        val number = 17
        if (isPrime(number)) {
            println("$number is a prime number")
        } else {
            println("$number is not a prime number")
        }

        // Задача 6: Вызов функции fibonacci для вычисления значения в последовательности Фибоначчи и вывод результата.
        val fibonacciValue = fibonacci(6)
        println("Fibonacci(6) = $fibonacciValue")
    }