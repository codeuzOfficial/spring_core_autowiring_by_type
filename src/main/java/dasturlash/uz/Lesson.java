package dasturlash.uz;

public class Lesson {
    private Professor professor;
    private Assistant assistant;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                " professor=" + professor +
                ", assistant=" + assistant +
                '}';
    }
}
