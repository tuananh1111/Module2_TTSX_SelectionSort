public class Main {
    static double[] list ={1.5,5,1,6.8,6,9,-5,-1.2};

    public static void main(String[] args) {
        SelectionSort sort= new SelectionSort();
        sort.selectionSort(list);
        for (int i=0; i<list.length;i++){
            System.out.println(list[i]+ " ");
        }
    }
}
