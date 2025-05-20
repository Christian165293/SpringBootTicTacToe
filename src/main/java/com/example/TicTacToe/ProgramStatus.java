package com.example.TicTacToe;

//Object class that represents the JSON response
public class ProgramStatus {
    private String status;

    public ProgramStatus() {
    }

    public ProgramStatus(String inStatus) {
        status = inStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String inStatus) {
        status = inStatus;
    }
}
