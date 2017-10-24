import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToDoHandler {

    protected ArrayList<Todo> todoList;
    protected List<String[]> input;

    public void load() {
        for (int i = 0; i < todoList.size(); i++) {
            input.get(i)[0] = todoList.get(i).isCompleted() ? "&&" : "";
            input.get(i)[1] = todoList.get(i).getText();
            input.get(i)[2] = String.valueOf(todoList.get(i).getID());
        }
    }

    public void saveAll () {
            load();
            try {
                CSVWriter writer = new CSVWriter(new FileWriter("C:\\GreenFox\\CsomaM\\week-06\\Todo_Extended\\src\\main\\resources\\Data.csv"), ';', CSVWriter.NO_QUOTE_CHARACTER);
                writer.writeAll(input);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public void save(List<String[]> list) {
        for (int i = 0; i < list.size(); i++) {
            Todo tempToDo = new Todo(list.get(i)[1]);
            todoList.add(tempToDo);
            if (list.get(i)[0].equals("&&")) {
                tempToDo.complete();
            }
            tempToDo.setID(i + 1);
        }
    }

    public void loadAll() {
        todoList = new ArrayList<>();
        try {
            CSVReader reader = new CSVReader(new FileReader("C:\\GreenFox\\CsomaM\\week-06\\Todo_Extended\\src\\main\\resources\\Data.csv"), ';');
            input =  reader.readAll();
            save(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void menu () {
        System.out.println("\n" + "Command Line Todo application");
        System.out.println("=============================" + "\n");
        System.out.println("Command line arguments:");
        System.out.println("-l   Lists all the tasks");
        System.out.println("-a   Adds a new task");
        System.out.println("-r   Removes an task");
        System.out.println("-c   Completes an task");
    }

    public void listTodos () {
        if (todoList.size() == 0) {
            System.out.println("No todos for today! :)");
        } else {
            for (int i = 0; i < todoList.size(); i++) {
                String[] tp = input.get(i);
                System.out.println( tp[0].equals("&&") ? "[x]" : "" + tp[2] + "." + tp[1]);
            }
        }
    }

    public void addTask (String task) {
        todoList.add(todoList.size(), new Todo(task));
    }

    public void removeTask (int index){
        todoList.remove(index - 1);
    }

    public void completeTask (int index) {
        todoList.get(index - 1).complete();
    }
}
