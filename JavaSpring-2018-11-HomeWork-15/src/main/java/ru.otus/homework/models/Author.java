package ru.otus.homework.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Author implements Serializable, DataSet
{
    static final long serialVersionUID = -1L;

    private long id;

    private String firstName;

    private String lastName;
}