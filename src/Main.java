public class Main {
    public static void main(String[] args) {

        int[] a = { 1, 3, 4, 10, 12 };
        System.out.println(" Array: ");
        for( int i : a ){
            System.out.println( i );
        }
        a = pop(a);
//        a = pop(a);
        System.out.println("New array after pop:");
        for( int i : a ){
            System.out.println( i );
        }
    }

    public static int[] pop(int[] array){
        int[] newArray = new int[ array.length - 1 ];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        array = newArray;
        return array;
    }
}