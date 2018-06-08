public class Main {

    public static void main(String[] args) {

        int[] numbers = {2,7,4,1,5,3};
        int length = numbers.length;
        System.out.println("Before sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }

        QuickSort(numbers,0,length-1);

        System.out.println();
        System.out.println("After Sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void QuickSort(int[] numbers, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(numbers, low, high);

            QuickSort(numbers, low, pi-1);
            QuickSort(numbers, pi+1, high);
        }
    }

}
