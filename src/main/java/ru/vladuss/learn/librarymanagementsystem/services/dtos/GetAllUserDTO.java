package ru.vladuss.learn.librarymanagementsystem.services.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


public class GetAllUserDTO extends BaseDTO{

    private String first_name;

    private String second_name;

    private String last_name;

    private LocalDateTime birthday;

    public GetAllUserDTO() {
    }

    public GetAllUserDTO(String first_name, String second_name, String last_name, LocalDateTime birthday) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.last_name = last_name;
        this.birthday = birthday;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
}
