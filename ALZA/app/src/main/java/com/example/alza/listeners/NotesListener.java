package com.example.alza.listeners;

import com.example.alza.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note,int position);
}
