package behavioral.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private List<UserColleague> users = new ArrayList<>();

    @Override
    public void addUser(UserColleague user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String msg, UserColleague sender) {
        for (UserColleague u : users) {
            if (u != sender) {
                u.receive(msg, sender.getName());
            }
        }
    }
}
