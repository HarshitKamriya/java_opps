import java.util.HashMap;

public class Studentregistery {
    HashMap<String,student> map = new HashMap<>();

    void register(String key, Student st){
        map.put(key,st);
    }
    Student get(String key){
        return map.get(key);
    }
}
