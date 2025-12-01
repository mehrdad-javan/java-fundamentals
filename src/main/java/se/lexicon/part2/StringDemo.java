package se.lexicon.part2;

public class StringDemo {

    void main(){
        String greeting = "Hello";
        greeting = greeting.concat(" ").concat("World");
        System.out.println(greeting);
        System.out.println(greeting.length());
        System.out.println(greeting.charAt(1));

        ex1();
    }

    static void ex1(){
        String string = "Hello Strings";
        int index1 = string.indexOf("llo");
        System.out.println("index1 = " + index1); // 2
        int index2 = string.indexOf('H');
        System.out.println("index2 = " + index2); // 0
    }

    static void ex2(){
        String greeting = "Welcome";
        System.out.println(greeting.substring(3)); // come
        System.out.println(greeting.substring(1, 5)); // elco
    }

    static void ex3(){
        String textBlock = """
                This is a text block
                It spans multiple lines.
                """;

        String sql = """
                INSERT INTO tbl_user (name, age, city)
                VALUES(%s, %d, %s)
                """.formatted("Test", 30, "Växjö");
    }
}
