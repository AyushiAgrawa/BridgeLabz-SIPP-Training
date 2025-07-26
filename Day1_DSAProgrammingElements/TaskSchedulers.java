package Day1_DSAProgrammingElements;
class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head = null;
    private Task tail = null;
    private Task current = null;

    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    public void addTaskAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        if (position <= 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newTask.next = temp.next;
        temp.next = newTask;

        if (temp == tail) {
            tail = newTask;
        }
    }

    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        Task current = head;
        Task prev = tail;
        boolean found = false;

        do {
            if (current.taskId == taskId) {
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("Task with ID " + taskId + " not found.");
            return;
        }

        if (head == tail && head.taskId == taskId) {
            head = null;
            tail = null;
        } else if (current == head) {
            head = head.next;
            tail.next = head;
        } else if (current == tail) {
            tail = prev;
            tail.next = head;
        } else {
            prev.next = current.next;
        }

        System.out.println("Task with ID " + taskId + " removed.");
    }

    public void viewCurrentAndMoveNext() {
        if (current == null) {
            current = head;
        }

        if (current == null) {
            System.out.println("No tasks in the scheduler!");
            return;
        }

        System.out.println("Current Task -> ID: " + current.taskId + ", Name: " + current.taskName +
                ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
        current = current.next;
    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        Task temp = head;
        do {
            System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        Task temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName +
                        ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }
}

public class TaskSchedulers{
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTaskAtEnd(1, "Write Code", 2, "2025-07-20");
        scheduler.addTaskAtBeginning(2, "Team Meeting", 1, "2025-07-15");
        scheduler.addTaskAtEnd(3, "Code Review", 3, "2025-07-18");
        scheduler.addTaskAtPosition(4, "Presentation", 2, "2025-07-17", 2);

        System.out.println("All Tasks:");
        scheduler.displayAllTasks();

        System.out.println("View and Move:");
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        System.out.println("Search by Priority 2:");
        scheduler.searchByPriority(2);

        System.out.println("Remove Task ID 2:");
        scheduler.removeTaskById(2);

        System.out.println("All Tasks after Removal:");
        scheduler.displayAllTasks();
    }
}
