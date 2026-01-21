package version_updates.java10to21;

public class SwitchEnhancement {
    public static void main(String[] args) {
        String day = "fri";
        String time = "";

        // General switch statement
//        switch (day) {
//            case "sat", "sun":
//                time = "6am";
//                break;
//            case "wed":
//                time = "8am";
//                break;
//            default:
//                time = "7am";
//                break;
//        }

        // switch statement, here we can avoid break statement
//        switch (day) {
//            case "sat", "sun" -> time = "6am";
//            case "wed" -> time = "8am";
//            default -> time = "7am";
//        }

        // switch expression (also known as "switch with rules") (it should end with semicolon (;)
//        time = switch (day) {
//            case "sat", "sun" -> "6am";
//            case "wed" -> "8am";
//            default -> "7am";
//        };

        // switch expression with yield (it should end with semicolon (;)
        time = switch (day) {
            case "sat", "sun":
                yield "6am";
            case "wed":
                yield "8am";
            default:
                yield "7am";
        };

        System.out.println(time);
    }
}
