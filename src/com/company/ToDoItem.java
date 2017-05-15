package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by BUBBABAIRD on 4/5/17.
 */
public class ToDoItem {
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String text;
    public boolean isDone;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public ToDoItem(int id, String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    public static void insertToDo(Connection conn, String text) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO todos VALUES (NULL, ?, false)");
        stmt.setString(1, text);
        stmt.execute();
    }
}

