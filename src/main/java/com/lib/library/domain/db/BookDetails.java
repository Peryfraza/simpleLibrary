package com.lib.library.domain.db;

import com.lib.library.domain.db.utils.Author;
import com.lib.library.domain.db.utils.Genre;
import com.lib.library.domain.db.utils.Type;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@Table
public class BookDetails {
    private List<Author> authors = new LinkedList<>();
    private List<Genre> genres = new LinkedList<>();
    private Type type;
    private short pageCount;
}
