import java.util.HashSet;
import java.util.Set;

public class SetBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Size: " + conjunto.size());

        System.out.println("Remove: " + conjunto.remove("Teste"));

        System.out.println("Contains: " + conjunto.contains('x'));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("nums: " + nums);
        System.out.println("conjunto: " + conjunto);

        // conjunto.addAll(nums);
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
