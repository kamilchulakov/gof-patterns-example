package bridge;

import java.util.ArrayList;

public class ProgramFactory {
    static ArrayList<Program> getPrograms() {
        ArrayList<Program> programs = new ArrayList<>();
        programs.add(new ShitApp(new GoodPythonDeveloper()));
        programs.add(new DjangoApp(new PythonDeveloper()));
        return programs;
    }
}
