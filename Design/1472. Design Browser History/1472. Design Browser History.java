class BrowserHistory {
    List<String> history;
    int cur = 0;
    
    public BrowserHistory(String homepage) {
        history = new LinkedList<>();
        history.add(homepage);
    }
    
    public void visit(String url) {
        history.subList(cur+1,history.size()).clear();
        history.add(url);
        cur = history.size() - 1;
    }
    
    public String back(int steps) {
        cur = cur-steps >=0? cur-steps: 0;
        return history.get(cur);
    }
    
    public String forward(int steps) {
        cur = cur + steps>= history.size() -1? history.size() -1 : cur + steps;
        return history.get(cur);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */