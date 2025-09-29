package behavioral.mediatorPattern;

public class ChatUser extends UserColleague {

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " sending: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg, String from) {
        System.out.println(this.name + " received from " + from + ": " + msg);
    }
}
