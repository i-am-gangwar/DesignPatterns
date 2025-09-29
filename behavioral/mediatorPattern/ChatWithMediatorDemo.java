package behavioral.mediatorPattern;

public class ChatWithMediatorDemo {
    public static void main(String[] args) {
        ChatMediator chatroom = new ChatRoom();

        UserColleague alice = new ChatUser(chatroom, "Alice");
        UserColleague bob = new ChatUser(chatroom, "Bob");
        UserColleague charlie = new ChatUser(chatroom, "Charlie");

        chatroom.addUser(alice);
        chatroom.addUser(bob);
        chatroom.addUser(charlie);

        alice.send("Hello, everyone!");
        bob.send("Hi Alice!");
    }
}
