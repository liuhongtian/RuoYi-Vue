package com.ruoyi.kanban.client.model;

public class NewCard {
    private String authorId;
    private String title;
    private String description;
    private String swimlaneId;

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setSwimlaneId(String swimlaneId) {
        this.swimlaneId = swimlaneId;
    }

    public String getAuthorId() {
        return this.authorId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public String getDescription() {
        return this.description;
    }

    public String getSwimlaneId() {
        return this.swimlaneId;
    }
        
}
