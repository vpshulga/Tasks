package by.vpshulga.lesson08;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class TransactionalAnalyzer {

    public static void analyzeTransaction(Class clazz, String... methodNames) {
        for (Method method : clazz.getMethods()) {
            for (String methodName : methodNames) {
                if (methodName.equals(method.getName())) {
                    Object[] params = method.getParameterTypes();
                    if (method.isAnnotationPresent(Transactional.class)) {
                        for (Annotation annotation : method.getAnnotations()) {
                            if (annotation instanceof Transactional) {
                                System.out.println("Transaction is started");
                                try {
                                    if (params.length > 0) {
                                        method.invoke(clazz.newInstance(), params);
                                    } else {
                                        method.invoke(clazz.newInstance());
                                    }
                                } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Transaction is ended");
                            }
                        }
                    } else {
                        try {
                            method.invoke(clazz.newInstance());
                        } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }
    }
}
