import java.time.LocalDate;

public class TodoList {

    public static void main(String[] args) {
        ToDoHandler th = new ToDoHandler();
        th.loadAll();
        if (args.length == 0) {
            th.menu();
        } else if (args[0].startsWith("-l")) {
            th.listTodos();
        } else if (args[0].startsWith("-a")) {
            try {
                th.addTask(args[1]);
            } catch (IndexOutOfBoundsException i) {
                System.out.println("Unable to add: no task provided");
            }
        } else if (args[0].startsWith("-r")) {
            try {
                if (isParsable(args[1])){
                    th.removeTask(Integer.parseInt(args[1]));
                } else {
                    System.out.println("Unable to remove: index is not a number");
                }
            } catch (IndexOutOfBoundsException i) {
                System.out.println("Unable to remove: index is out of bound");
            }
        }else  if (args[0].startsWith("-c")) {
            try {
                th.completeTask(Integer.parseInt(args[1]));
            } catch (IndexOutOfBoundsException i) {
                System.out.println("Unable to delete: no task provided");
            }
        } else {
            System.out.println("Please give me a valid argument.");
        }
            th.saveAll();
    }

        public static boolean isParsable(String input){
            boolean parsable = true;
            try{
                Integer.parseInt(input);
            }catch(NumberFormatException e){
                parsable = false;
            }
            return parsable;
        }
}
