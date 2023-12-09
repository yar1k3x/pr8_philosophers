import kotlin.random.Random

// Класс, представляющий философа
class Philosopher(val id: Int) {

    // Метод, который философ использует для взятия вилок
    fun dineWithForks(forks: ArrayList<Fork>) {
        // Случайное решение, брать ли правую вилку
        val isRight = Random.nextBoolean()

        // Определение индексов правой и левой вилок относительно философа
        val rightForkIndex = id % forks.size
        val leftForkIndex = (id + 1) % forks.size

        // Попытка взять вилку справа
        if (!forks[rightForkIndex].isChosen && isRight) {
            forks[rightForkIndex].isChosen = true
            println("Философ ${id + 1} взял вилку справа и обедает")
            return
        }
        // Попытка взять вилку слева
        else if (!forks[leftForkIndex].isChosen) {
            forks[leftForkIndex].isChosen = true
            println("Философ ${id + 1} взял вилку слева и обедает")
            return
        }
        // Попытка взять вилку слева, если не удалось справа
        else if (!forks[leftForkIndex].isChosen && !isRight) {
            forks[leftForkIndex].isChosen = true
            println("Философ ${id + 1} взял вилку слева и обедает")
            return
        }
        // Попытка взять вилку справа, если не удалось слева
        else if (!forks[rightForkIndex].isChosen) {
            forks[rightForkIndex].isChosen = true
            println("Философ ${id + 1} взял вилку справа и обедает")
            return
        }

        // Если философ не смог взять вилку, он думает
        println("Философ ${id + 1} думает")
    }
}