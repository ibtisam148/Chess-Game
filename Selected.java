public class Selected {
    int rankSelect;
    int fileSelect;

    public Selected(char rankSelect, int fileSelect) {
        this.rankSelect = rankSelect - 65;
        this.fileSelect = fileSelect - 1;
    }

    public Selected(int rankSelect, int fileSelect) {
        this.rankSelect = rankSelect;
        this.fileSelect = fileSelect;
    }
}
