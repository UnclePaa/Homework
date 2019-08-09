package com.pickles.practice_17.task_5;

// +
public class CodeRefactor {
    public static void main(String[] args) {
        Website website = new Website("http://www.onliner.by", WebsiteType.NEWS);

        String url = website.getUrl();
        WebsiteType type = website.getType();

        System.out.println(url);
        System.out.println(type);
    }
}

class Website {
    private String url;
    private WebsiteType type;

    public Website(String url, WebsiteType type) {
        this.url = url;
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public WebsiteType getType() {
        return type;
    }
}

enum WebsiteType {
    NEWS,
    MUSIC,
    EDUCATION
}
