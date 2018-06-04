package by.vpshulga.lesson12;

public class Initials {

    static StringBuilder getInitials(String firstName, String lastName, String patronymicName){
        StringBuilder stringBuilder = new StringBuilder();
        if (firstName != null && lastName !=null && patronymicName != null) {
            stringBuilder.append(Character.toUpperCase(lastName.charAt(0))).append(".")
                    .append(Character.toUpperCase(firstName.charAt(0))).append(".")
                    .append(Character.toUpperCase(patronymicName.charAt(0)));

        } else {
            stringBuilder.append("Need not null values");
        }
        return stringBuilder;
    }
}
