package ru.Sobolev.lesson20;

public class Entry {

    private String api;
    private String description;
    private String auth;
    private boolean https;
    private String cors;
    private String link;
    private String category;

    @Override
    public String toString() {
        return "Entry{" +
                "api='" + api + '\'' +
                ", description='" + description + '\'' +
                ", auth='" + auth + '\'' +
                ", https=" + https +
                ", cors='" + cors + '\'' +
                ", link='" + link + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public boolean isHttps() {
        return https;
    }

    public void setHttps(boolean https) {
        this.https = https;
    }

    public String getCors() {
        return cors;
    }

    public void setCors(String cors) {
        this.cors = cors;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
