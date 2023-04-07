package org.example.formbeans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeFormBean {

    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String extension;
    private Integer vacationHours;
    private Integer officeId;
    private String profileImg;

}
