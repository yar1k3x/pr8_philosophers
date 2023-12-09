import kotlin.random.Random

// Основной метод программы
fun main(args: Array<String>) {
    // Ввод количества философов
    println("Введите количество философов, сидящих за круглым столом:")
    val philosopherCount = readln().toInt()

    // Инициализация списков для философов и вилок
    val philosophers = ArrayList<Philosopher>()
    val forks = ArrayList<Fork>()

    // Создание объектов философов и вилок и добавление их в соответствующие списки
    for (i in 0 until philosopherCount) {
        philosophers.add(Philosopher(i))
        forks.add(Fork(i))
    }

    // Перемешивание порядка философов для более случайного выбора вилок
    philosophers.shuffle(Random)

    // Философы берут вилки
    for (i in 0 until philosopherCount) {
        philosophers[i].takeFork(forks)
    }
}