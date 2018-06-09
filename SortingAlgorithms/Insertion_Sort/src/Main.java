public class Main {

    public static void main(String[] args) {

        int[] numbers = {2,7,4,1,5,3};
        int length = numbers.length;
        System.out.println("Before sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        InsertionSort(numbers, length);

        System.out.println();
        System.out.println("After Sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }

    public static void InsertionSort(int[] numbers, int length){

        for (int i = 1; i < length; i++) {
            int key = numbers[i];
            int j = i-1;

            while (j >= 0 && numbers[j] > key){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
        }
    }
}
