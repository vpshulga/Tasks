package by.vpshulga.lesson12;

class CountOfWords {
    static int getCountOfWords(String text) {
        if (text == null) {
            return -1;
        } else if (text.equals("")){
            return 0;
        } else {
            if (text.charAt(0) == ' ') {
                return text.split(" +").length - 1;
            } else if (text.split( " +").length == 0){
                return 0;
            } else {
                return text.split(" +").length;
            }
        }
    }
}
