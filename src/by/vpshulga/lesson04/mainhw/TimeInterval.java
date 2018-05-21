package by.vpshulga.lesson04.mainhw;

class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;
    private boolean isCorrect;

    TimeInterval(int seconds) {
        if (seconds >= 0) {
            this.hours = seconds / 3600;
            this.minutes = (seconds % 3600) / 60;
            this.seconds = (seconds % 3600) % 60;
            isCorrect = true;
        }
    }

    TimeInterval(int hours, int minutes, int seconds) {
        if (hours >= 0 && minutes >= 0 && seconds >= 0) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            isCorrect = true;
        }
    }

    private int getTotalSeconds() {
        return this.seconds + this.minutes * 60 + this.hours * 3600;
    }

    void printResults() {
        if (isCorrect) {
            System.out.println("Часов: " + this.hours + "\n"
                    + "Минут: " + this.minutes + "\n"
                    + "Секунд: " + this.seconds);
            System.out.println("Полное количество секунд: " + getTotalSeconds());
        } else {
            System.out.println("need positive values");
        }

    }
}
