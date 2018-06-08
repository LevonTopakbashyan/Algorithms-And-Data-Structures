public class Main {

    public static void main(String[] args) {

        int[] numbers = {2,7,4,1,5,3};
        int length = numbers.length;
        System.out.println("Before sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }

        BubbleSort(numbers,length);

        System.out.println();
        System.out.println("After Sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }

    }

    public static void BubbleSort(int[] numbers, int length){

        for (int i = 0; i < length-1; i++) {
            int temp = 0;
            for (int j = i+1; j < length; j++) {
                if (numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
