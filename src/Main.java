import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //String string = "GM,Ford,Tesla,Volkswagen,Audi,Subaru,Tesla,Ford,Ford,Subaru,Mercedes,Hyundai,Honda,Suzuki";
        String string = "GM,GM";

        String[] seperatedString = string.split(",");
        List<String> list = new ArrayList<>();
        for (String s : seperatedString) {
            System.out.println(s);
            list.add(s);
        }

        System.out.println();

        list = list.stream().sorted().collect(Collectors.toList());
        List<String> noDupes = new ArrayList<>();
        for (String s : list) {
            System.out.println(s);
            if (!(noDupes.contains(s))) {
                noDupes.add(s);
            }
        }

        System.out.println();

        for (String s : noDupes) {
            System.out.println(s);
        }

        System.out.println();

        for (String s : noDupes) {
            System.out.println(s.length());
        }
    }
}