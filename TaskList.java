public class TaskList {
    Task head;

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask;
        }
    }

    public void markTaskCompleted(String description) {
        Task temp = head;
        while (temp != null) {
            if (temp.description.equals(description)) {
                temp.markCompleted();
                return;
            }
            temp = temp.next;
        }
    }

    public void printTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
