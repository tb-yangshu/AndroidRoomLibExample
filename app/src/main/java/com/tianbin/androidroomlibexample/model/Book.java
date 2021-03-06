package com.tianbin.androidroomlibexample.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Book
 * Created by tianbin on 2017/8/9.
 */
@Entity(foreignKeys = @ForeignKey(entity = Category.class, parentColumns = "id", childColumns = "category_id", onDelete = CASCADE),
        indices = {@Index(value = "category_id", unique = true)})
public class Book {

    @PrimaryKey
    public int id;
    public String name;
    public String author;
    @ColumnInfo(name = "category_id")
    public int categoryId;
}
