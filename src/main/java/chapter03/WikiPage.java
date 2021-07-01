package chapter03;

public class WikiPage {
    public PageCrawler getPageCrawler() {
        return new PageCrawlerImpl();
    }
}
