package com.valquiria.mynotes.feature_note.domain.use_case

import com.valquiria.mynotes.feature_note.domain.model.InvalidNoteException
import com.valquiria.mynotes.feature_note.domain.model.Note
import com.valquiria.mynotes.feature_note.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    //validations

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()){
            throw InvalidNoteException("Title cant be empty.")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("Content cant be empty")
        }
        repository.insertNote(note)
    }
}