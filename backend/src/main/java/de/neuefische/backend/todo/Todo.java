package de.neuefische.backend.todo;

public record Todo(
        String id,
        String description,
        TodoStatus status,

        String name,

        String user,

        String createDate


) {

    Todo(
            String description,
            TodoStatus status,
            String name,
            String user,
            String createDate

    ) {
        this(null, description, status, name, user, createDate);
    }


    public Todo withId(String id) {
        return new Todo(id, description, status, name, user, createDate);
    }
}
