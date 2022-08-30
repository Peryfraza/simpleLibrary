package com.lib.library.domain.db;

import com.lib.library.domain.db.utils.Author;
import com.lib.library.domain.db.utils.Genre;
import com.lib.library.domain.db.utils.Type;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@Table
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<Author> authors = new LinkedList<>();
    private List<Genre> genres = new LinkedList<>();
    private Type type;
    private boolean taken;
    private short pageCount;
    private File content;
}
