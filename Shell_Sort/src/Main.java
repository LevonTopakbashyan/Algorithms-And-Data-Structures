public class Main {

    public static void main(String[] args) {

        int[] numbers = {2,7,4,1,5,3};
        int length = numbers.length;
        System.out.println("Before sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        ShellSort(numbers,length);

        System.out.println();
        System.out.println("After Sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }

    public static void ShellSort(int[] numbers, int length){
        for (int gap = length/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < length; i++)
            {
                int temp = numbers[i];

                int j;
                for (j = i; j >= gap && numbers[j - gap] > temp; j -= gap)
                    numbers[j] = numbers[j - gap];

                numbers[j] = temp;
            }
        }
    }
}
