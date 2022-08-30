package com.lib.library.domain.db;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Table;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@Table
public class User {
    @Id
    private long personal_id;
    private String fullName;
    private long phoneNumber;
    private Date dateOfBirth;
    private List<Book> rentedBooks = new LinkedList<>();

}
