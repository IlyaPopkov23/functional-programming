package com.itrexgroup.funcdataprocessing.employee;

import java.util.List;

public class OfficeManager {
    /*  Write a method using Stream API that calculates the general number of employees
    with salary >= threshold for all departments whose code starts with string "111-" (without "").

    Perhaps, flatMap method can help you to implement it.   */

    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(department -> department.getCode().startsWith("111-"))
                .flatMap(department -> department.getEmployees().stream().filter(employee -> employee.getSalary() >= threshold)).count();
    }
}
