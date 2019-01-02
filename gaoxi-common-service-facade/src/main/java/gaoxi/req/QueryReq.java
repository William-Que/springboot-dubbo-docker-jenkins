package gaoxi.req;

public class QueryReq extends AbsReq{

    protected int page=1;

    protected int numPerPage=10;

    protected int currentPage;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNumPerPage() {
        return numPerPage;
    }

    public void setNumPerPage(int numPerPage) {
        this.numPerPage = numPerPage;
    }

    public int getCurrentPage() {
        return (page-1)*numPerPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
