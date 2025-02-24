package com.example.alza.dao;


import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.alza.entities.Note;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM notes ORDER BY  id DESC")
    List<Note> getAllNotes();

    @Insert(onConflict = REPLACE)
    void insert(Note note);

    @Delete
    void deleteNote(Note note);

}
