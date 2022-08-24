public class Main {
    public static void main(String[] args) {
        var firstBoxerWeight = 78.2;
        System.out.println(firstBoxerWeight);
        var secondBoxerWeight = 82.7;
        System.out.println(secondBoxerWeight);
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifference);
        var overLoad2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println(overLoad2);

        var totalHoursWork = 640;
        System.out.println(totalHoursWork);
        var workers = totalHoursWork / 8;
        System.out.println("Всего работников в компании" + workers + "работников");
        System.out.println(workers);
        workers = workers + 94;
        System.out.println(workers);
        totalHoursWork = workers * 8;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + totalHoursWork + " часов работы может быть поделено между сотрудниками");

    }
}