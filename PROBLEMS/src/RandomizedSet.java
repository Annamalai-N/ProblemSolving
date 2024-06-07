import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {
    private  ArrayList<Integer> list;
    private HashMap<Integer,Integer> map;
    public RandomizedSet() {
        list=new ArrayList<>();
        map=new HashMap<>();
    }
    public boolean SEARCH(int val){
        return map.containsKey(val);
    }
    
    public boolean insert(int val) {
        if(SEARCH(val)){
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!SEARCH(val)) return false;

        int index = map.get(val);
        list.set(index, list.get(list.size() - 1));
        map.put(list.get(index), index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}