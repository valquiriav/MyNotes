package com.valquiria.mynotes.feature_note.domain.use_case

data class NoteUseCases (
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNote: AddNoteUseCase
    )