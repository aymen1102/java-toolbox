package designPatterns.architectural.mvc;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StudentController {
    private StudentModel model;
    private StudentView view;

    public void updateView() {
        view.printStudentDetails(
                model.getName(),
                model.getRollNo()
        );
    }
}