package peaksoft.model;

public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на том острове дуб стоит ,под дубом сундук зарыт " + wood.toString();
    }
}
