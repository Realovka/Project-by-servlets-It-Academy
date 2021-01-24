package by.realovka.web.dao.dto;

import by.realovka.web.dao.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Data
@AllArgsConstructor
@NoArgsConstructor
@With
public class UserDTO {

    private String userName;
    private int age;
    private String login;
    private String password;
    private Role role;

}
