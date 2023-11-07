package designPatterns.architectural.mvc;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentModel {
    private String rollNo;
    private String name;
}