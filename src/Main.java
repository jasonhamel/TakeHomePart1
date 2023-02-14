import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String string = "GM,Ford,Tesla,Volkswagen,Audi,Subaru,Tesla,Ford,Ford,Subaru,Mercedes,Hyundai,Honda,Suzuki";
        //String string = "GM,GM";

        String[] separatedString = string.split(",");
        List<String> list = new ArrayList<>();
        for (String s : separatedString) {
            System.out.println(s);
            list.add(s);
        }

        System.out.println();

        list = list.stream().sorted().collect(Collectors.toList());
        HashMap<Integer, String> noDupes = new HashMap<>();
        int key = 0;
        for (String s : list) {
            System.out.println(s);
            if (!(noDupes.containsValue(s))) {
                noDupes.put(key, s);
                key++;
            }


        }

        System.out.println();

        for (int i = 0; i < noDupes.size(); i++) {
            System.out.println(noDupes.get(i));
        }

        System.out.println();

        for (int i = 0; i < noDupes.size(); i++) {
            System.out.println(noDupes.get(i).length());
        }
    }
}