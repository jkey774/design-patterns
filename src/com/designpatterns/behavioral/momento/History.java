package com.designpatterns.behavioral.momento;

import java.util.ArrayList;
import java.util.List;

// Caretaker as referred to by GoF
public class History {
    // could have used a a Stack, but using List for simplicity
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        int lastIndex = states.size() - 1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
