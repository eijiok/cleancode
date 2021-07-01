package chapter03.re_rerefactored;

import chapter03.PageData;
import chapter03.WikiPage;

public class HtmlUtil {

    public static String renderPageWithSetupsAndTeardowns( PageData pageData, boolean isSuite) throws Exception {

        if (isTestPage(pageData))
            includeSetupAndTeardownPages(pageData, isSuite);

        return pageData.getHtml();
    }

    private static void includeSetupAndTeardownPages(PageData pageData, boolean isSuite) {

    }

    private static boolean isTestPage(PageData pageData) {
        return false;
    }

    private static void includeSetupPages(WikiPage testPage, StringBuffer newPageContent, boolean isSuite) {

    }

    private static void includeTeardownPages(WikiPage testPage, StringBuffer newPageContent, boolean isSuite) {

    }
}
