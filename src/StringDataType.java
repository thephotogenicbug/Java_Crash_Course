public class StringDataType {

    public static void main(String[] args) {

        String s = "I love Java";
        System.out.println(s);

        System.out.println(s.charAt(2));
        System.out.println(s.charAt(7));

        String s2 = """
                Harry Potter and the Philosopher's Stone
                Harry Potter and the Chamber of Secrets
                Harry Potter and the Prisoner of Azkaban
                Harry Potter and the Goblet of Fire
                Harry Potter and the Order of The Phoenix
                Harry Potter and the Half-Blood Prince
                Harry Potter and the Deathly Hallows
                """;

        System.out.println(s2);
    }
}
