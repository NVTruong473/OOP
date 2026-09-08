public class Lab03{

        // 1. Write a Java program (Do not use the Arrays class, use the primitive array like Lab 2):
        // • Write a function to remove the first specific element from an array and return true, if the
        // element does not exist in an array return false.
        public static boolean removefirstspecificelement(int []arr, int k){
            int [] arr1 = arr;
            for (int i =0; i<arr1.length;i++){
                if(arr1[i] == k){
                    for(int j=i;j<arr1.length-1;j++){
                        arr1[j] = arr1[j+1];
                    }
                    
                    arr1[arr1.length-1] = 0;
                    return true;
                }
                else
                    return false;
            }
            return true;
        }

        // • Write a function to insert an element at a specific position into an array. (After insertion
        // you can replace the last element with the element before)
        // (Ex: arr = [1,2,4,3] insert 5 at position 2 returns [1,2,5,4])

        public static void insertelement(int [] arr, int k, int index){
            int [] arr1 = arr;
            for (int i=arr1.length-1;i>index;i--){
                arr1[i] = arr[i-1];
            }
            arr1[index] = k;


            for (int i=0;i<arr1.length;i++){
                System.out.println(arr1[i]);
            }
        }
        // • Write a function to find the duplicate values of an array of integer values.
        // (Ex: arr = [1,3,1,3,2,4] returns [1,3])
        public static int [] findduplicate(int [] arr){
            int dem = 0;
            for (int i =0; i<arr.length;i++){
                for (int j = i;j<arr.length;j++){
                    if (arr[i] == arr[j] && i != j)
                        // System.out.println(arr[j]);
                        dem = dem + 1;

                }
            }
            int [] b = new int[dem];
            int tam = 0;
            for (int i =0; i<arr.length;i++){
                for (int j = i;j<arr.length;j++){
                    if (arr[i] == arr[j] && i != j){
                        // System.out.println(arr[j]);
                        b[tam] = arr[j];
                        tam = tam +1;
                    }

                }
            }

            return b;

        }


        // • Write a function to remove the duplicate values of an array of integer values.
        // (Ex: arr = [1,3,1,3,2,4] returns [1,3,2,4])

    // Hàm loại bỏ các giá trị trùng lặp
    public static int[] removeDuplicates(int[] arr) {
        // Tạo một mảng mới để chứa các phần tử không trùng lặp
        int[] temp = new int[arr.length];
        int count = 0; // Đếm số phần tử không trùng lặp

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false; // Biến để kiểm tra trùng lặp
            
            // Kiểm tra xem phần tử đã có trong mảng tạm thời chưa
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true; // Nếu đã có, đánh dấu là trùng lặp
                    break;
                }
            }
            
            // Nếu không phải là phần tử trùng lặp, thêm vào mảng tạm
            if (!isDuplicate) {
                temp[count] = arr[i];
                count++; // Tăng số lượng phần tử không trùng lặp
            }
        }

        // Tạo mảng kết quả với đúng kích thước
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i]; // Sao chép các phần tử không trùng lặp
        }

        return result;
    }


    // 2. To create an integer 2-dimensional array (matrix), you can use the following statements:
    //     int[][] arr = new int[2][3] // [[0 0 0]// [0 0 0]]
    //     int[][] arr1 = {{1, 2, 3}, {4, 5, 6}} // [[1 2 3]// [4 5 6]]
    //     Write a Java program:
    //     • Write a function to add two matrices of the same size.
    public static int [][] addtwomatrices(int[][] arr1, int[][] arr2) {
        // Create a new array for the result with the same dimensions
        int[][] arr3 = new int[arr1.length][arr1[0].length];
    
        // Check if the dimensions are compatible for addition
        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
            // Perform addition
            for (int i = 0; i < arr1.length; i++) { // Use arr1.length for rows
                for (int j = 0; j < arr1[i].length; j++) { // Use arr1[i].length for columns
                    arr3[i][j] = arr1[i][j] + arr2[i][j]; // Add corresponding elements
                }
            }
        } else {
            System.out.println("Matrices cannot be added due to incompatible dimensions.");
        }
        return arr3; // Exit the function if dimensions are not compatible
    }
    
    // Write a function to multiply a matrix with a number.
    public static int [][] multiplyMatrixByScalar(int[][] arr2, int k) {
        // Create a new matrix to store the result with the same dimensions
        int[][] result = new int[arr2.length][arr2[0].length];
    
        // Iterate over each element of the matrix
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                // Multiply each element by the scalar
                result[i][j] = arr2[i][j] * k;
            }
        }
        return result;
    }
    
    //     • Write a function to print a matrix to screen in matrix format.
        public static void printMatrix(int [][] arr2){
            for(int i = 0;i<arr2.length;i++){
                for(int j=0;j<arr2[i].length;j++){
                    System.out.print(arr2[i][j] + " ");
                }
            }

        }
    //     • Write a main function and run all the above functions.


    // 3. Write a Java program that receives the full name of a person and writes functions to:
    // • Return the first name and last name, except the middle name.
    // (Ex: Nguyen Van Chien → Nguyen Chien)
    public static void firstlastname(String name){
        int tam = 0;
        for(int i = 0; i<name.length();i++){
            if((name.charAt(i) == ' ')){
                if(tam == 0){
                    System.out.println(name.substring(tam, i));
                }
                tam = i;
                
            }
        }
        
        if (tam != -1) {
            System.out.println(name.substring(tam).trim()); // Print last name
        }
    }

    // • Return the middle name. (Ex: Nguyen Thi Thu Thao → Thi Thu)
    public static void middlename(String name){
        int tam = 0;
        for(int i = 0; i<name.length();i++){
            if((name.charAt(i) == ' ')){
                if(tam != 0){
                    System.out.println(name.substring(tam, i));
                }
                tam = i;
                
            }
        }
    }
    // • Capitalize the full name. (Ex: nguyen van chien → Nguyen Van Chien)
    public static void Capitalizefullname(String name){
        int tam = 0;
        for(int i = 0; i<name.length();i++){
            if((name.charAt(i) == ' ')){
                Character.toUpperCase(name.charAt(tam));
                tam = i;
                
            }
        }
        
        if (tam != -1) {
            Character.toUpperCase(name.charAt(tam));
        }
        System.out.println(name);
    }
    // • Uppercase all vowels and lowercase all consonants. (Ex: Nguyen Van Chien → ngUyEn
    //   vAn chIEn)

    public static void lowercaseName(String name){
        String name1 = name;
        for(int i = 0; i<name1.length();i++){
            Character.toLowerCase(name1.charAt(i));
        }

        for(int i = 0; i<name1.length();i++){
            if(name1.charAt(i) == 'a' || name1.charAt(i) == 'e' || name1.charAt(i) == 'u'|| name1.charAt(i) == 'o' || name1.charAt(i) == 'i'){
                Character.toUpperCase(name1.charAt(i));
            }
        }
        System.out.println(name1);
    }


    // 4. Write a Java program:
    // • Find the length of the string.
    public static void lengthstring(String name){
        int dem =0;
        // cach 1
        // for (int i=0;i<name.length();i++)
        //     dem = dem + 1;
        // System.out.println(dem);
        // cach 2
        dem = name.length();
        System.out.println(dem);

    }
    // • Count the number of words in the string.
    public static void Countwords(String name){
        int dem = 0;
        for(int i = 0;i<name.length();i++){
            if (name.charAt(i) != ' ')
                dem =dem+1;
        }
        System.out.println(dem);
    }
    // • Concatenate one string’s contents to another.
    public static void Concatenate(String name, String temp){
        int tam = 0;
        for (int i = 0; i <= name.length(); i++) {
            // Check for the space or the end of the string to get a word
            if (i == name.length() || name.charAt(i) == ' ') {
                String word = name.substring(tam, i);  // Extract the word
                if (word.equals(temp)) {
                    System.out.println(temp + " thuoc trong " + name);
                    return;  // Exit after finding the word
                }
                tam = i + 1;  // Update tam to the position after the space
            }
        }
        System.out.println(temp + " khong thuoc trong " + name);
    }
    // • Check if a string is a palindrome or not.
    public static void palindrome(String name){
        String pa = name;
        int dem = 0;
        for(int i = pa.length()-1;i>=0;i--){
            pa.replace((char) pa.charAt(i), (char) name.charAt(dem));
            dem = dem +1;
        }
        if (pa.compareTo(name) != 0){
            System.out.println(name + " la mot chuoi palindrome");
        }else{
            System.out.println(name + " khong phai la mot chuoi palindrome");
        }

    }

    // 5. Write a program to count how many times one word appears in the paragraph. Expect result is
    // the 2-dimension array in which the first column contains only one word, and the second column
    // contains its frequency. Words are not case-sensitive.
    // For example, given the string:
    // “You are living on a Plane. What you style Flatland is the vast level surface of what I may call
    // a fluid, on, or in, the top of which you and your countrymen move about, without rising above it
    // or falling below it.”
    // The examp
    




    public static void main(String [] args){
        int [] arr = {1,3,1,3,2,4};
        int k = 3;
        int index = 0;

        int[][] arr1 = new int[2][3]; // [[0 0 0]// [0 0 0]]
        int[][] arr2 = {{1, 2, 3}, 
                        {4, 5, 6}}; // [[1 2 3]// [4 5 6]]

        // 1.
        // removefirstspecificelement(arr, k);
        // insertelement(arr, k, index);
        // findduplicate(arr);
        // for(int x:findduplicate(arr))
        //     System.out.println(x);
        // int[] result = removeDuplicates(arr);
        // for(int x :result)
        //     System.out.println(x);

        // 2.
        addtwomatrices(arr1, arr2);
        multiplyMatrixByScalar(arr2, k);
        // printMatrix(multiplyMatrixByScalar(arr2, k));
        // printMatrix(addtwomatrices(arr1, arr2));
        // printMatrix(arr2);

        // 3.
        String name = "abcdcba";
        String temp = "Thu";
        // firstlastname(name);
        // middlename(name);
        // Capitalizefullname(name);
        // lowercaseName(name);
        // lengthstring(name);
        // Countwords(name);
        // Concatenate(name, temp);
        palindrome(name);
    }
        
}