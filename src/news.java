import java.util.*;


class User implements Observer {
    private String name;
    public User(String name) { this.name = name; }

    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}

class NewsPublisher {
    private List<Observer> listOfSubs = new ArrayList<>();

    public void subscribe(Observer users) { listOfSubs.add(users); }
    public void unsubscribe(Observer users) { listOfSubs.remove(users); }

    public void publish(String news) {
        for (Observer o : listOfSubs) {
            o.update(news);
        }
    }
}

public class news {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");

        publisher.subscribe(user1);
        publisher.subscribe(user2);

        publisher.publish("New Java version released!");
        // 출력:
        // Alice received news: New Java version released!
        // Bob received news: New Java version released!
    }
}