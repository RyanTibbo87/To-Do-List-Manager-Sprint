public class ToDoManager {
    static User[] users = new User[10]; // Array to store users
    static int userCount = 0;

    public static void addUser(String name) {
        users[userCount++] = new User(name);
    }

    public static User getUser(String name) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].name.equals(name)) {
                return users[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        addUser("Ryan");
        addUser("Tyler");
        addUser("Amanda");

        User ryan = getUser("Ryan");
        User tyler = getUser("Tyler");
        User amanda = getUser("Amanda");

        if (ryan != null) {
            ryan.addTask("Play games on steam");
            ryan.addTask("Watch a stream");
            ryan.markTaskCompleted("Play games on steam");
        }

        if (tyler != null) {
            tyler.addTask("Go to hockey practice");
            tyler.addTask("Review game footage");
            tyler.markTaskCompleted("Go to hockey practice");
        }

        if (amanda != null) {
            amanda.addTask("Complete leg day workout");
            amanda.addTask("Track daily calorie intake");
            amanda.markTaskCompleted("Complete leg day workout");
        }

        ryan.printTasks();
        tyler.printTasks();
        amanda.printTasks();
    }
}
