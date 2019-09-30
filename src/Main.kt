/**
 * Created by User on 30 Сент., 2019
 * грузовик - 12 контейнеров
 * контейнер - 27 ящиков
 */

fun main() {

    val boxMaxCount = 27
    val containerMaxCount = 12
    val multiMax = boxMaxCount * containerMaxCount

    val count: Int = readLine()!!.toInt()

    var containerCount = 1
    var trailerCount = 1
    for (boxCount in 1..count) {
        if ((boxCount == 1) or (boxCount % boxMaxCount == 1)) {
            if ((boxCount == 1) or (boxCount % multiMax == 1)){
                print("\tГрузовик ${trailerCount++}:\n")
            }
            print("\t\tКонтейнер ${containerCount++}:\n")
        }
        print("\t\t\tЯщик $boxCount:\n")
    }
}


