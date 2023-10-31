package bestPractices.bestPractice7;

enum Color {

    RED(0x000001),
    BLACK(0x000002),
    WHITE(0x000003);

    private int code;

    Color(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
