package by.vpshulga.lesson08;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

class TransactionalAnalyzer {

    static void analyzeTransaction(Class clazz, String... methodNames) {
        for (Method method : clazz.getMethods()) {
            for (String methodName : methodNames) {
                if (methodName.equals(method.getName())) {
                    Parameter[] params = method.getParameters();
                    for (int i = 0; i < params.length; i++) {
                        params[i] = null;
                    }
                    if (method.isAnnotationPresent(Transactional.class)) {
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
                        System.out.println("---------------------------");
                    } else {
                        try {
                            method.invoke(clazz.newInstance());
                            System.out.println("---------------------------");
                        } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }
    }
}
