package by.vpshulga.lesson04.mainhw;

class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    TimeInterval(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds % 3600) / 60;
        this.seconds = (seconds % 3600) % 60;
    }

    TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private int getTotalSeconds() {
        return this.seconds + this.minutes * 60 + this.hours * 3600;
    }

    void printResults() {
        System.out.println("Часов: " + this.hours + "\n"
                + "Минут: " + this.minutes + "\n"
                + "Секунд: " + this.seconds);
        System.out.println("Полное количество секунд: " + getTotalSeconds());
    }
}
