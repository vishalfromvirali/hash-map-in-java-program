import java.util.*;
class hashmap{
    public static void main(String[]args){
        HashMap<String,Integer> names =new HashMap<>();
        names.put("vishal",456);
        names.put("sanjay",563);
        names.put("kowshik",7453);

        int count=names.get("sanjay");
        System.out.println(count);
    }
}

