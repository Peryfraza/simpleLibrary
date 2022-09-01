package com.lib.library.domain.db;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.File;

@Getter
@Setter
@Table
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private short amountAvailable;
    private short amountToRent;
    private File content;
    private BookDetails bookDetails;
}
