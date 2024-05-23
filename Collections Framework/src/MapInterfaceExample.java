import java.util.*;

public class MapInterfaceExample {
    public static void main(String[] args) {
        Map<Integer , String> st = new HashMap<>();
        st.put(1,"aman");
        st.put(2,"krishna");
        st.put(3,"anant");
        System.out.println(st);
        System.out.println(st.get(2));
        System.out.println(st.containsValue(1));
        System.out.println(st.entrySet());
        System.out.println(st.keySet());
        System.out.println(st.values());

        // iterate over key in map
        for(Integer i : st.keySet()){
            System.out.println(i);
        }

        // iterate over value in map
        for(String i : st.values()){
            System.out.println(i);
        }

        // iterate over key , value in map
        for(var i : st.entrySet()){
            System.out.println(i);
        }
    }
}








