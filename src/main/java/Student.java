/**
 * Класс, представляющий объект "Студент"
 *
 * @author Meshchaninov A.A.
 */
public class Student {
    private final String name;
    private final String surname;
    private short age;
    private int group;
    private boolean hasExperience;
    private short tasksCompleted;
    private short modulesCompleted;
    private String targetOfLearning;

    public Student(String name, String surname, short age) {
        this(name, surname, age, 0, false, (short) 0, (short) 0, "Рост в качестве программиста");
    }

    /**
     * Конструктор, инициализирующий все поля объекта Student
     *
     * @param name             Имя студента
     * @param surname          Фамилия студента
     * @param age              Возвраст студента
     * @param group            Группа, в которй учится студент
     * @param hasExperience    Наличие опыта
     * @param tasksCompleted   Количество выполненных задач
     * @param modulesCompleted Количество пройденных модулей
     * @param targetOfLearning Цель обучения
     */
    public Student(String name, String surname, short age, int group, boolean hasExperience, short tasksCompleted, short modulesCompleted, String targetOfLearning) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.hasExperience = hasExperience;
        this.tasksCompleted = tasksCompleted;
        this.modulesCompleted = modulesCompleted;
        this.targetOfLearning = targetOfLearning;
    }

    /**
     * Выполнить задание
     *
     * @param taskNumber номер задания
     */
    public void completeTask(int taskNumber) {
        System.out.println("Student " + name + " complete a task number " + taskNumber);
    }

    /**
     * Задать вопрос
     *
     * @param question вопрос
     */
    public void askAQuestion(String question) {
        System.out.println("Student " + name + " ask a question");
    }

    /**
     * Выполнить модуль
     *
     * @param moduleNumber номер модуля
     */
    public void completeModule(int moduleNumber) {
        System.out.println("Student " + name + " complete a module number " + moduleNumber);
    }

    /**
     * Поговорить с куратором
     */
    public void talkWithSupervisor() {
        System.out.println("Student " + name + " talk with supervisor ");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public short getAge() {
        return age;
    }

    public int getGroup() {
        return group;
    }

    public boolean isHasExperience() {
        return hasExperience;
    }

    public short getTasksCompleted() {
        return tasksCompleted;
    }

    public short getModulesCompleted() {
        return modulesCompleted;
    }
}
