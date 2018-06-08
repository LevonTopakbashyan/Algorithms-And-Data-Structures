public class Main {

    public static void main(String[] args) {

        int[] numbers = {2,7,4,1,5,3};
        int length = numbers.length;
        System.out.println("Before sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        MergeSort(numbers,0,length-1);

        System.out.println();
        System.out.println("After Sort: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }

    public static void sort(int[] numbers, int left, int middle, int right)
    {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int leftNumbers[] = new int [n1];
        int rightNumbers[] = new int [n2];

        for (int i=0; i<n1; ++i)
            leftNumbers[i] = numbers[left + i];

        for (int j=0; j<n2; ++j)
            rightNumbers[j] = numbers[middle + 1+ j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftNumbers[i] <= rightNumbers[j]) {
                numbers[k] = leftNumbers[i];
                i++;
            }
            else {
                numbers[k] = rightNumbers[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            numbers[k] = leftNumbers[i];
            i++;
            k++;
        }

        while (j < n2) {
            numbers[k] = rightNumbers[j];
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
