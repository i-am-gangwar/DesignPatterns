package behavioral.mediatorPattern;

public interface ChatMediator {
    void sendMessage(String msg, UserColleague user);
    void addUser(UserColleague user);
}
