package java17.textBlocks;

public class  TextBlockExample {

    public static void main(String[] args) {
        // Using Text Blocks to create a multi-line String
        String htmlTextBlock = """
                <html>
                    <body>
                        <p>Hello, World!</p>
                    </body>
                </html>
                """;

        System.out.println("HTML using Text Block:");
        System.out.println(htmlTextBlock);

        // Traditional way (Using concatenation and escape sequences)
        String htmlTraditional = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, World!</p>\n" +
                "    </body>\n" +
                "</html>\n";

        System.out.println("\nHTML in Traditional Way:");
        System.out.println(htmlTraditional);

        // Comparing both strings are equal
        System.out.println("\nAre both HTML strings equal? " + htmlTextBlock.equals(htmlTraditional));
    }
}
