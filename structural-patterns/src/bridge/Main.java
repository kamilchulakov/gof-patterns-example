package bridge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProgramFactory.getPrograms().forEach(Program::developProgram);
    }
}
