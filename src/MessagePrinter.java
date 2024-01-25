public class MessagePrinter {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        MessagePrinter messagePrinter = new MessagePrinter();
        messagePrinter.printMessage("This is a message printer");
    }
}
