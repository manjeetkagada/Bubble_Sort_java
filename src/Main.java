public class Main {
    private static int[] arr;

    public static void main(String[] args) {
       arr= new int[]{34, 12, 43, 45, 32};
        sort(arr);
        print();






    }
    public static void sort(int arr[]){

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(j,j+1);
                }


            }


        }

    }


    public static void swap(int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void print(){
       for (int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }


    }
}
