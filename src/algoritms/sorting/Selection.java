package algoritms.sorting;

/**
 * 1) находим номер минимального значения в текущем списке
 * 2) производим обмен этого значения со значением первой неотсортированной позиции (обмен не нужен, если минимальный элемент уже находится на данной позиции)
 * 3) теперь сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы
 */
public class Selection {

    static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int minIndex = i;
            int minValue = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minIndex = j;
                    minValue = array[j];
                }
            }
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = minValue;
            }
        }
    }
}
