package version_updates.java10to21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 'var is restricted identifier and cannot be used for type declarations
//class var {
//}

public class LocalVariableTypeInference {
//    var age = 28; // error (should not use var for instance variables)

    public static void main(String[] args) throws IOException {

//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        System.out.print("Enter how many friends you have ? ");
//        int friendsCount = Integer.parseInt(bufferedReader.readLine());
//        List<String> friendsList = new ArrayList<>();
//        for (int i = 0; i < friendsCount; i++) {
//            System.out.print("Enter friend - " + (i + 1) + " name : ");
//            friendsList.add(bufferedReader.readLine());
//        }
//        System.out.println(friendsList);


        // Var or LVTI (Local Variable Type Inference)
        var inputStreamReader = new InputStreamReader(System.in);
        var bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter how many friends you have ? ");
        var friendsCount = Integer.parseInt(bufferedReader.readLine());
        List<String> friendsList = new ArrayList<>();
        for (var i = 0; i < friendsCount; i++) {
            System.out.print("Enter friend - " + (i + 1) + " name : ");
            friendsList.add(bufferedReader.readLine());
        }
        System.out.println(friendsList);

        String var = "Prasad";
        System.out.println(var);

        // 'var' is not allowed as an element type of an array
//        var numbers[] = new int[10];

    }
}
