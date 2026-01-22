package version_updates.java10to21;

public class TextBlock {
    public static void main(String[] args) {
        String htmlData1 = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "   <head>\n" +
                "       <meta charset=\"UTF-8\">\n" +
                "       <title>Page Title</title>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "       <h1>This is a Heading</h1>\n" +
                "       <p>This is a paragraph.</p>\n" +
                "   </body>\n" +
                "</html>\n";

        System.out.println("htmlData-1 :\n" + htmlData1);

        String htmlData2 = """
                <!DOCTYPE html>
                <html>
                    <head>
                        <meta charset="UTF-8">
                        <title>Page Title</title>
                    </head>
                    <body>
                        <h1>This is a Heading</h1>
                        <p>This is a paragraph.</p>
                    </body>
                </html>
                """;

        System.out.println("htmlData-2 :\n" + htmlData2);

        String paragraph = """
                Hi my name is prasad.
                    I love Java.
                """;

        System.out.println("paragraph :\n" + paragraph);
    }
}
