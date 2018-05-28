package by.vpshulga.lesson08;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

class ClassAnalyzer {
    static void analize(Class clazz) {
        methodForAnalize(clazz);
    }

    static void analize(Object object) {
        Class clazz = object.getClass();
        methodForAnalize(clazz);

    }

    private static void analizeFields(Class clazz) {
        StringBuilder text = new StringBuilder();
        for (Field field : clazz.getDeclaredFields()) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            StringBuilder s = new StringBuilder(500);
            if (annotations != null) {
                for (Annotation annotation : annotations) {
                    s.append(annotation).append(", ");
                }
            }

            text.append("Field: ").append(field.getName()).append("\n")
                    .append("\t").append("Type: ").append(field.getType()).append("\n")
                    .append("\t").append("Annotations: ").append(s).append("\n");
        }
        System.out.println(text);
    }

    private static void analizeMethods(Class clazz) {
        StringBuilder text = new StringBuilder(500);
        for (Method method : clazz.getDeclaredMethods()) {
            Parameter[] params = method.getParameters();
            StringBuilder s = new StringBuilder(500);
            Annotation[] annotations = method.getDeclaredAnnotations();
            StringBuilder s1 = new StringBuilder(500);
            if (params != null) {
                for (Parameter param : params) {
                    s.append(param.getType()).append("  ").append(param.getName()).append(", ");
                }
            }
            if (annotations != null) {
                for (Annotation annotation : annotations) {
                    s1.append(annotation).append(", ");
                }
            }
            if (notObjectMethod(method)) {
                text.append("Method: ").append(method.getName()).append("\n")
                        .append("\t").append("Return type: ").append(method.getReturnType().getSimpleName()).append("\n")
                        .append("\t").append("Parameters: ").append(s).append("\n")
                        .append("\t").append("Annotations: ").append(s1).append("\n");
            }
        }
        System.out.println(text);
    }

    private static void analizeConstructors(Class clazz) {
        StringBuilder text = new StringBuilder();
        for (Constructor constructor : clazz.getDeclaredConstructors()) {
            Parameter[] params = constructor.getParameters();
            StringBuilder s = new StringBuilder(500);
            if (params != null) {
                for (Parameter param : params) {
                    s.append(param).append(", ");
                }
            }

            Annotation[] annotations = constructor.getDeclaredAnnotations();
            StringBuilder s1 = new StringBuilder(500);
            if (annotations != null) {
                for (Annotation annotation : annotations) {
                    s1.append(annotation).append(", ");
                }
            }
            text.append("Constructor: ").append(constructor.getName()).append("\n")
                    .append("\t").append("Parameters: ").append(s).append("\n")
                    .append("\t").append("Annotations: ").append(s1).append("\n");
        }
        System.out.println(text);
    }

    private static void analizeAnnotations(Class clazz) {
        StringBuilder text = new StringBuilder();
        for (Annotation annotation : clazz.getDeclaredAnnotations()) {
            text.append("\t").append(annotation).append("\n");
        }
        System.out.println(text);
    }

    private static boolean notObjectMethod(Method method) {
        return !("equals".equals(method.getName()) || "toString".equals(method.getName()) ||
                "wait".equals(method.getName()) || "notify".equals(method.getName()) ||
                "notifyAll".equals(method.getName()) || "hashCode".equals(method.getName()));
    }

    private static void methodForAnalize(Class clazz) {
        System.out.println("FIELDS");
        analizeFields(clazz);
        System.out.println("----------------------");
        System.out.println("METHODS:");
        analizeMethods(clazz);
        System.out.println("----------------------");
        System.out.println("CONSTRUCTORS:");
        analizeConstructors(clazz);
        System.out.println("----------------------");
        System.out.println("ANNOTATIONS FOR CLASS:");
        analizeAnnotations(clazz);
        System.out.println("----------------------");
    }
}
