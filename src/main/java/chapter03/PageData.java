package chapter03;

public class PageData {
    private WikiPage wikiPage;
    private String content;

    public WikiPage getWikiPage() {
        return wikiPage;
    }

    public boolean hasAttribute(String attribute) {
        return false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHtml() {
        return null;
    }
}
