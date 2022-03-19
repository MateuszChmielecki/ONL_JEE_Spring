package pl.coderslab.beans;

public class MessageSender {
    private final MessageService messageService;
    private String message;


    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }
    public void sendMessageFromProperty(){
        messageService.send(message);

    }


    public void sendMessage() {
        messageService.send();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
