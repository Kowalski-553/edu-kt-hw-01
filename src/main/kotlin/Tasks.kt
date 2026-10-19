// Задание 2 - Вывод в консоль приветствия
fun greeting(name: String) {
    println("Привет, $name!")
}

// Задание 3 и 4 - решил объединить. По заданию первый метод должен вернуть true/false, а второй напечатать.
// пусть задание 4 ипользует уже готовый метод определения положительности. don't repeat yourself, разделение логики и т.д.
fun isNegative(number: Int): Boolean { // хочется определять положительное число, но в задании надо отрицательное
    return number < 0 // допустим, зачислим ноль в положительные числа
}

fun printIsNegative(number: Int) {
    if (isNegative(number)) {
        println("Число $number является отрицательным")
    } else {
        println("Число $number является 0 или положительным")
    }
}

// Задание 5 - вывод от 1000 до 0 кратное 3
fun printNumbers() {
    for (i in 1000 downTo 0) {
        if (i % 3 == 0) {
            println(i)
        }
    }
}