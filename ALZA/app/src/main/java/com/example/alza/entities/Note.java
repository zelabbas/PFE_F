package com.example.alza.entities;

// set up database
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

import javax.xml.namespace.QName;

@Entity(tableName = "notes") // notes represente une table en database
public class Note implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id ;


   @ColumnInfo(name = "title")
   private String title;

   @ColumnInfo(name = "date_time")
   private String dateTime;

   @ColumnInfo(name = "subtitle")
   private String subtitle;

   @ColumnInfo(name = "note_text")
   private String noteText;

   @ColumnInfo(name = "image_path")
   private String imagePath;

   @ColumnInfo(name = "color")
   private String color;

   @ColumnInfo(name = "web_link")
    private String weblink;

// les methodes :


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeblink() {
        return weblink;
    }

    public void setWeblink(String weblink) {
        this.weblink = weblink;
    }

    @NonNull //@NonNull semble être utilisée pour indiquer que les propriétés title et dateTime ne peuvent pas être nulles. Cela signifie que ces propriétés doivent toujours avoir une valeur non nulle.
    @Override
    public String toString() {
        return title + ":" +dateTime;
    }
}
