package com.example.administrator.myapplication.bean;


public class NotepadBean {
    //记录的id
    private String id;
    //记录的内容
    private String notepadContent;
    //记录的时间
    private String notepadTime;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNotepadContent(){
        return notepadContent;
    }
    public void setNotepadContent(String notepadContent){
        this.notepadContent = notepadContent;
    }
    public String getNotepadTime(){
        return notepadTime;
    }
    public void setNotepadTime(String notepadTime){
        this.notepadTime = notepadTime;
    }
}
