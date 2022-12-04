public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("select * from students where ");
        String filter = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";

        String filer2 = filter.replace("\"", "")
                .replace("{", "")
                .replace("}", "")
                .replace(" ", "");
        // name:Ivanov,country:Russia,city:Moscow,age:null

        String[] stringArray = filer2.split(",");

        for (String s : stringArray) {
            if (!s.contains("null")) {             // если не содержит подстроку null
                stringBuilder.append(s.split(":")[0])
                        .append(" = ").append('\'')
                        .append(s.split(":")[1])
                        .append('\'').append(" and ");
            }
        }
        stringBuilder.replace(stringBuilder.length() - 5, stringBuilder.length(), "");
        System.out.println(stringBuilder);
        // "select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'"
    }
}