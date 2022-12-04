import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream inFile = new FileInputStream("/Users/ruslankaverin/Desktop/Java_home_work_GB/Lesson_2/Task_6/src/class_school.txt");
        byte[] string = new byte[inFile.available()];
        inFile.read(string);
        String newText = new String(string);

        String str = newText.replace("{", "").replace("}", "").replace("\"", "");
        String[] str2 = str.split(", ");
        System.out.println(Arrays.toString(str2));

        Map<String, String> dictionary = new HashMap<String, String>();

        for (String item : str2) {
            String[] strNew = item.split(", ");
            for(String item2: strNew) {
                String[] strNew2 = item2.split(",");
                for(String item3: strNew2) {
                    String[] strNew3 = item3.split(":");
                    dictionary.put(strNew3[0], strNew3[1]);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Студент " + dictionary.get("фамилия")
                        + " получил " + dictionary.get("оценка")
                        + " по предмету " + dictionary.get("предмет"));
                System.out.println(stringBuilder);
            }
        }
    }
}