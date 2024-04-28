package sosunovych.user.registration.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import sosunovych.user.registration.validation.birth.date.BirthDate;
import sosunovych.user.registration.validation.email.Email;

@Data
public class RegisterUserRequestDto {
    @Email
    private String email;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @BirthDate
    private String birthDate;
    private String address;
    private String phoneNumber;
}