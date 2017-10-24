import java.time.LocalDate;

public class Todo {

    protected LocalDate createdAt;
    protected LocalDate completedAt;
    protected boolean completed;
    protected String text;
    protected int id;

    public Todo (String text) {
        this.text = text;
        this.createdAt = LocalDate.now();
        this.completed = false;
        this.id = 0;
    }

    public void complete () {
        completedAt = LocalDate.now();
        completed = true;
    }

    public boolean isCompleted () {
        return completed;
    }

    public void setID (int id) {
        this.id = id;
    }

    public int getID () {
        return id;
    }

    public String getText() {
        return text;
    }
}
