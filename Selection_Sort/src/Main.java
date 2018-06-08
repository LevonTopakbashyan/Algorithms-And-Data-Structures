public class Main {

    public static void main(String[] args) {

        int[] numbers = {2,7,4,1,5,3};
        int length = numbers.length;
        System.out.println("Before sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        //SelectionSort(numbers,length);
        //InsertionSort(numbers, length);
        //BubbleSort(numbers,length);
        //ShellSort(numbers,length);
        //QuickSort(numbers,0,length-1);
        //MergeSort(numbers,0,length-1);

        System.out.println();
        System.out.println("After Sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }

    public static void SelectionSort(int[] numbers, int length){
     
        for (int i = 0; i < length-2; i++) {
            int min = i;
            for (int j = i+1; j < length; j++) {
                if (numbers[j] < numbers[min])
                    min = j;
            }

            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
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

    public static void sort(int[] numbers, int left, int middle, int right)
    {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = numbers[left + i];

        for (int j=0; j<n2; ++j)
            R[j] = numbers[middle + 1+ j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                numbers[k] = L[i];
                i++;
            }
            else {
                numbers[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            numbers[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            numbers[k] = R[j];
            j++;
            k++;
        }
    }

    public static void MergeSort(int[] numbers, int left, int right)
    {

        if (left < right) {

            int middle = (left + right)/2;

            MergeSort(numbers, left, middle);
            MergeSort(numbers , middle+1, right);

            sort(numbers, left, middle, right);
        }
    }

}
