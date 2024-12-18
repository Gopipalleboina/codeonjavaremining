public class removelastelement {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        
        
        int[] newArray = new int[originalArray.length - 1];

       
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        
        System.out.print("New array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}