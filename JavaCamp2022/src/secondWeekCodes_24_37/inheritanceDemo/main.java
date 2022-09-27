package inheritanceDemo;

public class main {
    public static void main(String[] args) {

        teacherCreditManager teacherCreditManager = new teacherCreditManager();
        teacherCreditManager.Calculate();

        creditUi creditUi = new creditUi();
        creditUi.CalculateCredit(teacherCreditManager);
        creditUi.CalculateCredit(new agricultureCreditManager());
        creditUi.CalculateCredit(new soldierCreditManager());

    }
}
