import java.util.ArrayList;
import java.util.Scanner;

public class Notepad {

    public ArrayList<Note> createNotepad() {
        ArrayList <Note> notes = new ArrayList<>();
        return notes;
    }

    public void startWork() {
        ArrayList<Note> notes = createNotepad();
        System.out.println("YOUR NOTEPAD");
        boolean flag = true;
        while (flag) {
            Note note = new Note();
            System.out.println("Enter note:");
            Scanner sc = new Scanner(System.in);
            note.text = sc.nextLine();
            note.time = note.getTime();
            notes.add(note);
            System.out.println("What you prefer to do now?");
            System.out.println("A - create new note; B - get notes; C - exit");
            String doIt = sc.nextLine();
            if(doIt.equals("B")) {
                for(Note not : notes) {
                    System.out.println(not.text + " " + not.time);
                }
                System.out.println("What you prefer to do now?");
                System.out.println("A - create new note; C - exit");
                String doItNew = sc.nextLine();
                if(doItNew.equals("C")) {
                    break;
                }
            } else if (doIt.equals("C")) {
                break;
            }
        }
    }
}
