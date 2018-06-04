package by.vpshulga.lesson12;

class ChangeSadForHappy {
    private String text;

    ChangeSadForHappy(String text) {
        this.text = text;
    }

    private String getText() {
        return text;
    }

    private void setText(String text) {
        this.text = text;
    }

    String changeSmiles() {
        if (getText() != null) {
            setText(getText().replaceAll(":\\(", ":)"));
        }

        return getText();
    }
}
