package _9_linear_search;

//searching a string to check if a character's there or not
//treating a string as an array of characteres here
public class _q1_search_in_string {
    public static void main(String[] args) {
        String str = "Kunal Bhadra";
        char find = 'h';
        System.out.println("Is character present in the string? " +searchString(str, find));
    }

    //same function with for-each loop
    static boolean searchString2(String str, char target){
        //edge case
        if(str.length() == 0){
            return false;
        }
        //for-each loop used here
        for (char ch : str.toCharArray()){ //here, string is converted to char array to be used in for-each
            if (ch == target){
                return true;
            }
        }
        //this is executed if above return statements haven't been executed; char not found
        return false;
    }

    //original function with normal for loop
    static boolean searchString(String str, char target){
        //edge case
        if(str.length() == 0){
            return false;
        }
        //to go through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == target){
                return true;
            }
        }
        //this is executed if above return statements haven't been executed; char not found
        return false;
    }
}
